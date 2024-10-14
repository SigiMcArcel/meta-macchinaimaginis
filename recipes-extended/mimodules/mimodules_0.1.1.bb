DESCRIPTION = "machina imaginis sound library"
SECTION = "library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += " \
    misound \
	midriver \
	miutils \
    "
    	
RDEPENDS:${PN} = " \
	misound \
	midriver \
	miutils \
"

TARGET_CC_ARCH += "${LDFLAGS}"
SOLIBS = ".so"
FILES_SOLIBSDEV = ""
FILES_${PN} += "${libdir}/*.so"
INSANE_SKIP_${PN} += "dev-so"

S = "${WORKDIR}/git/mimodules"

SRCREV = "${AUTOREV}"

SRC_URI = "git://git@github.com/SigiMcArcel/mimodules.git;protocol=ssh;branch=main"

EXTRA_OEMAKE =+ "prefix=${prefix} includedir=${includedir} libdir=${libdir}"
CXX:remove = "-Wl,--as-needed"

do_install(){
	oe_runmake install DESTDIR=${D}
}









