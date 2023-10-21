FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append = " \
	file://asound.conf \
	file://asoundrc \
"

do_install:append(){
    install -d ${D}/home
    install -d ${D}/home/root
    install -D ${WORKDIR}/asoundrc ${D}/home/root/.asoundrc
}

FILES:${PN} += " \
    /home \
    /home/root \
    /home/root/.asoundrc \
    "