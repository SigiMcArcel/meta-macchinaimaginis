DESCRIPTION = "macchinaimaginis Packagegroup"
LICENSE = "MIT"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} += " \
	hostapd \
	dnsmasq \
"


