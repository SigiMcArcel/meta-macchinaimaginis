DESCRIPTION = "macchinaimaginis Packagegroup"

inherit packagegroup


PACKAGES = "\
	packagegroup-macchinaimaginis-io \
"

RDEPENDS:packagegroup-macchinaimaginis-io = "\
	kernel-modules \
	rpio \
    	rpi-gpio \
    	usbutils \
    	i2c-tools \
"


