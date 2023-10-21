DESCRIPTION = "machina imaginis wooden machine application"
SECTION = "application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
# inherit systemd

# SYSTEMD_AUTO_ENABLE = "enable"
# SYSTEMD_SERVICE_${PN} = "hello.service"

INSANE_SKIP:${PN} += "ldflags"

DEPENDS:append = " \
	micomponents \
	mimodule \
	miutils \
	misound \
	micomponents \
	midriver \
    "
    	
RDEPENDS:${PN} = " \
	micomponents \
	mimodule \
	miutils \
	misound \
	micomponents \
	midriver \
"


S = "${WORKDIR}/git/machines/Holzmaschine/Software"

SRCREV = "${AUTOREV}"
SRC_URI:append = "git://git@github.com/SigiMcArcel/macchina-imaginis.git;protocol=ssh;branch=main"


# FILES_${PN} += "${systemd_unitdir}/system/miwoodenmachine.service"

EXTRA_OEMAKE =+ "bindir=${bindir}"

do_install:append() {
  # install -d ${D}/${systemd_unitdir}/system
  # install -m 0644 ${WORKDIR}/miwoodenmachine.service ${D}/${systemd_unitdir}/system
  oe_runmake install DESTDIR=${D}
}

