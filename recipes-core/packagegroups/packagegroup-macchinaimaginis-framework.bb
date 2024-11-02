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
	mitasks \
	midriver-dev \
	miutils-dev \
	mimodules-dev \
	misound-dev \
	micomponents-dev \
	mitasks-dev \
"


