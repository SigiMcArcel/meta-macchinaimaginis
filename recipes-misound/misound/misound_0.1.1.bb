DESCRIPTION = "machina imaginis sound library"
SECTION = "library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"


DEPENDS += "\
	libsndfile1 \
    	packagegroup-macchinaimaginis-sound \
    	"
    	
RDEPENDS_${PN} = "\
	libsndfile1 \
    	packagegroup-macchinaimaginis-sound \
"


 

TARGET_CC_ARCH += "${LDFLAGS}"
SOLIBS = ".so"
FILES_SOLIBSDEV = ""

S = "${WORKDIR}/git/misound"

SRCREV = "${AUTOREV}"

SRC_URI = "git://git@github.com/SigiMcArcel/misound.git;protocol=ssh;branch=main"


EXTRA_OEMAKE = "'CC=${CC}' 'RANLIB=${RANLIB}' 'AR=${AR}' \
   'CFLAGS=${CFLAGS} -I${S}/. -DWITHOUT_XATTR' 'BUILDDIR=${S}'"
   
   
   
do_install(){
	install -d ${D}${libdir}
	install -m 0644 libmisound.so ${D}${libdir}
	install -d ${D}${includedir}
	install -m 0644 cWave.h ${D}${includedir}
	install -m 0644 cAlsa.h ${D}${includedir}
	install -m 0644 cAudio.h ${D}${includedir}
}









