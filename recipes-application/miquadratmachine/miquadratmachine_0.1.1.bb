DESCRIPTION = "machina imaginis wooden machine application"
SECTION = "application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit update-rc.d

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

INITSCRIPT_NAME = "miquadratmachine.sh"
INITSCRIPT_PARAMS = "defaults 90 10"

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

S = "${WORKDIR}/git/machines/Quadratmaschine/Software"

SRCREV = "${AUTOREV}"
SRC_URI:append = " \
	git://git@github.com/SigiMcArcel/macchina-imaginis.git;protocol=ssh;branch=main \
	file://miquadratmachine.sh \
	"
CXX:remove = "-Wl,--as-needed"
EXTRA_OEMAKE =+ "bindir=${bindir}"

do_install:append() {
	install -d ${D}/home
	install -d ${D}/home/root/
	install -d ${D}/home/root/sounds
	install -d ${D}/etc/init.d
  	install -m 0755 ${WORKDIR}/miquadratmachine.sh ${D}/etc/init.d/miquadratmachine.sh
  	oe_runmake install DESTDIR=${D}
}

FILES:${PN} += " \
	/etc/init.d/* \
	/home \
	/home/root/ \
	/home/root/sounds \
	"
