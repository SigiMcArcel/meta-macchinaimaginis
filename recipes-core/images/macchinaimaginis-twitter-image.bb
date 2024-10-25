# Base this image on core-image-minimal
DESCRIPTION = "Image for macchina magisnis twitter machine."

IMAGE_FEATURES += "ssh-server-openssh"

IMAGE_INSTALL += "\
    packagegroup-macchinaimaginis-core \
    packagegroup-macchinaimaginis-base \
    packagegroup-macchinaimaginis-dev \
    packagegroup-macchinaimaginis-framework \
    mitwittermachine \
    "
inherit core-image




