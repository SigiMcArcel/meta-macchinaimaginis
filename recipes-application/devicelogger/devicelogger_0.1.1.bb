DESCRIPTION = "machina imaginis twitter machine application"
SECTION = "application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit systemd

FILES_EXTRAPATHS:prepend := "${THISDIR}/files:"

# SYSTEMD_SERVICE:${PN} += "devicelogger.service"
# SYSTEMD_AUTO_ENABLE:${PN} = "enable"

INSANE_SKIP:${PN} += "ldflags"

DEPENDS:append = " \
	mimodules \
	miutils \
	midriver \
	mitasks \
	curl \
    "
    	
RDEPENDS:${PN} = " \
	mimodules \
	miutils \
	midriver \
	mitasks \
"

S = "${WORKDIR}/git/Software"

SRCREV = "${AUTOREV}"

SRC_URI = " \
	git://git@github.com/SigiMcArcel/DeviceLogger.git;protocol=ssh;branch=main \
	"
	

CXX:remove = "-Wl,--as-needed"
EXTRA_OEMAKE += "bindir=${bindir}"

do_install:append() {
	oe_runmake install DESTDIR=${D}
}

