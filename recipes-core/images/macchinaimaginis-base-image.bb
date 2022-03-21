# Base this image on core-image-minimal
DESCRIPTION = "core-image-full-cmdline."


IMAGE_FEATURES += "splash ssh-server-openssh"
CORE_IMAGE_EXTRA_INSTALL += "openssh-sftp openssh-sftp-server"

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    packagegroup-macchinaimaginis-sound \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    "

inherit core-image



