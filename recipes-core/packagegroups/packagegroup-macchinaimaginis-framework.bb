DESCRIPTION = "macchinaimaginis framework Packagegroup"
LICENSE = "MIT"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} += " \
    libsndfile1 \
	libmodbus \
	alsa-utils \
	alsaconf \
	midriver \
	miutils \
	mimodules \
	misound \
	micomponents \
"


