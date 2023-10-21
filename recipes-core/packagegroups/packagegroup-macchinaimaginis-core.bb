DESCRIPTION = "macchinaimaginis Packagegroup"

inherit packagegroup


PACKAGES = "\
	packagegroup-macchinaimaginis-core \
"

RDEPENDS:packagegroup-macchinaimaginis-core = " \
	kernel-modules \
	usbutils \
	i2c-tools \
	rapidjson-dev \
	libsndfile1 \
"


