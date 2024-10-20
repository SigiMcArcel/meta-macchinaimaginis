DESCRIPTION = "machina imaginis twitter machine application"
SECTION = "application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit systemd

FILES_EXTRAPATHS:prepend := "${THISDIR}/files:"

SYSTEMD_SERVICE:${PN} += "miquadratmachine.service"
SYSTEMD_AUTO_ENABLE:${PN} = "enable"

INSANE_SKIP:${PN} += "ldflags"

DEPENDS:append = " \
	micomponents \
	mimodules \
	miutils \
	misound \
	midriver \
	mitasks \
    "
    	
RDEPENDS:${PN} = " \
	micomponents \
	mimodules \
	miutils \
	misound \
	midriver \
	mitasks \
"

S = "${WORKDIR}/git/machines/Quadratmaschine/Software"

SRCREV = "${AUTOREV}"

SRC_URI:append = " \
	git://git@github.com/SigiMcArcel/macchina-imaginis.git;protocol=ssh;branch=main \
	file://miquadratmachine.service \
	file://sounds/ \
	"

CXX:remove = "-Wl,--as-needed"
EXTRA_OEMAKE += "bindir=${bindir}"

do_install:append() {
	# Erstelle das Zielverzeichnis für Sounds und installiere die Dateien
	install -d ${D}/usr/share
	install -d ${D}/usr/share/misounds/
	for file in ${WORKDIR}/sounds/*; do
        install -m 0644 "$file" ${D}/usr/share/misounds
    done

	install -d ${D}${systemd_system_unitdir}
	install -m 0664 ${WORKDIR}/miquadratmachine.service ${D}${systemd_system_unitdir}/

	# Führe die normale Installation durch
	oe_runmake install DESTDIR=${D}
}

pkg_postinst_ontarget:${PN}() {
    if [ -n "$D" ]; then
        exit 1
    fi
    systemctl enable miquadratmachine.service
}

# Füge die Sounds zum Paket hinzu

FILES:${PN} += "/usr/share"
FILES:${PN} += "/usr/share/misounds/*"
FILES:${PN} += "${systemd_system_unitdir}/miquadratmachine.service"
