DESCRIPTION = "macchinaimaginis Packagegroup"
LICENSE = "MIT"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS_${PN} = " \
	kernel-modules \
	usbutils \
	i2c-tools \
	rapidjson-dev \
	libsndfile1 \
	libmodbus \
"


