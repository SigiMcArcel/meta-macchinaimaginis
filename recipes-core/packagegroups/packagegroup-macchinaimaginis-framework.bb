DESCRIPTION = "macchinaimaginis framework Packagegroup"
LICENSE = "MIT"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS_${PN} = " \
    midriver \
	miutils \
	mimodule \
	misound \
	micomponents \
	midriver-dev \
	miutils-dev \
	mimodule-dev \
	misound-dev \
	micomponents-dev \
"


