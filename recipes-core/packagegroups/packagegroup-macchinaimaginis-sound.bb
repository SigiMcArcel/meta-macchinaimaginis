DESCRIPTION = "macchinaimaginis Packagegroup"

inherit packagegroup


PACKAGES = "\
	packagegroup-macchinaimaginis-sound \
"

RDEPENDS:packagegroup-macchinaimaginis-sound = "\
	kernel-modules \
	rpio \
    	rpi-gpio \
    	alsa-utils \	
    	alsa-lib \
    	alsa-tools \
    	usbutils \
"


