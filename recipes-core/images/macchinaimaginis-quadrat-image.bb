# Base this image on core-image-minimal
DESCRIPTION = "Image for macchina magisnis quadrat machine."


IMAGE_FEATURES += "ssh-server-openssh"

WIFI_NAME = "miquadratmachine"
WIFI_PWD = "funkandzischel"

IMAGE_INSTALL += "\
    packagegroup-macchinaimaginis-core \
    packagegroup-macchinaimaginis-base \
    packagegroup-macchinaimaginis-dev \
    packagegroup-macchinaimaginis-framework \
    miquadratmachine \
    "
inherit core-image
# include macchinaimaginis-image.inc



