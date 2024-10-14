FILESEXTRAPATHS:prepend := "${THISDIR}/alsa-state:"

SRC_URI = "\
  file://asound.conf \
  "

do_install:append() {
    install -d ${D}${sysconfdir}
    install -m 0644 ${WORKDIR}/asound.conf ${D}${sysconfdir}
}