DESCRIPTION = "machina imaginis driver library"
SECTION = "library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

TARGET_CC_ARCH += "${LDFLAGS}"
SOLIBS = ".so"
FILES_SOLIBSDEV = ""

S = "${WORKDIR}/git/midriver"

SRCREV = "${AUTOREV}"

SRC_URI = "git://git@github.com/SigiMcArcel/midriver.git;protocol=ssh;branch=main"


EXTRA_OEMAKE =+ "prefix=${prefix} includedir=${includedir} libdir=${libdir}"
CXX:remove = "-Wl,--as-needed"
   
do_install(){
	oe_runmake install DESTDIR=${D}
}







