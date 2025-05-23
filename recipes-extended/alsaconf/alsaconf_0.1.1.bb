DESCRIPTION = "machina imaginis alsa and sound configuration"
SECTION = "configuration"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "\
  file://asound.conf \
  file://alsa-base.conf \
  "
do_install() {
    install -d ${D}${sysconfdir}
    install -m 0644 ${WORKDIR}/asound.conf ${D}${sysconfdir}
	install -d ${D}/${sysconfdir}/modprobe.d/
	install -m 0664 ${WORKDIR}/alsa-base.conf ${D}/${sysconfdir}/modprobe.d/
}