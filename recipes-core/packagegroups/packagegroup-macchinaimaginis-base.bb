DESCRIPTION = "macchinaimaginis Packagegroup"
LICENSE = "MIT"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} += " \
	kernel-modules \
	openssh-sftp \
	openssh-sftp-server \
"


