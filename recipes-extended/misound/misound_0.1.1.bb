DESCRIPTION = "machina imaginis sound library"
SECTION = "library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append = " \
	file://asound.conf \
	file://asoundrc \
"
DEPENDS:append = "\
	libsndfile1 \
	alsa-lib \
    "
RDEPENDS_${PN}:append = "\
	libsndfile1-dev \
	alsa-lib-dev \
"
TARGET_CC_ARCH += "${LDFLAGS}"
SOLIBS = ".so"
FILES_SOLIBSDEV = ""

S = "${WORKDIR}/git/misound"

SRCREV = "${AUTOREV}"

SRC_URI = "git://git@github.com/SigiMcArcel/misound.git;protocol=ssh;branch=main"

EXTRA_OEMAKE =+ "prefix=${prefix} includedir=${includedir} libdir=${libdir}"
CXX:remove = "-Wl,--as-needed"

do_install(){
	oe_runmake install DESTDIR=${D}
	install -d asound.conf ${sysconfdir}/asound.conf
	install -d asoundrc /home/root/.asoundrc
}

FILES_${PN} += "asound.conf .asoundrc"







