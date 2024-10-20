DESCRIPTION = "macchinaimaginis Packagegroup"
LICENSE = "MIT"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} += " \
	packagegroup-core-buildessential \
    packagegroup-sdk-target \
    gdbserver \
    rsync \ 
    zip \
    usbutils \
	i2c-tools \
    midriver-dev \
	miutils-dev \
	mimodules-dev \
	misound-dev \
	micomponents-dev \
"


