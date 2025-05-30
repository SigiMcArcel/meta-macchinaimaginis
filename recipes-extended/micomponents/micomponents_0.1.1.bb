DESCRIPTION = "machina imaginis component library"
SECTION = "library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "\
	misound \
	mimodules \
	midriver \
    "
    	
RDEPENDS:${PN} = "\
	misound \
	mimodules \
	midriver \
"

TARGET_CC_ARCH += "${LDFLAGS}"
SOLIBS = ".so"
FILES_SOLIBSDEV = ""

S = "${WORKDIR}/git/micomponents"

SRCREV = "${AUTOREV}"

SRC_URI = "git://git@github.com/SigiMcArcel/micomponents.git;protocol=ssh;branch=main"


EXTRA_OEMAKE =+ "prefix=${prefix} includedir=${includedir} libdir=${libdir}"
   
   
do_install(){
	oe_runmake install DESTDIR=${D}
}










