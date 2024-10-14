DESCRIPTION = "macchinaimaginis Packagegroup"
LICENSE = "MIT"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS_${PN} = " \
	packagegroup-core-buildessential \
    packagegroup-sdk-target \
    gdbserver \
"


