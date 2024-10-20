DESCRIPTION = "macchinaimaginis Packagegroup"
LICENSE = "MIT"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} += " \
	packagegroup-core-boot \
    packagegroup-core-full-cmdline \
	kernel-modules \
"


