# Base this image on core-image-minimal
DESCRIPTION = "core-image-full-cmdline."



IMAGE_FEATURES += "splash ssh-server-openssh"
CORE_IMAGE_EXTRA_INSTALL += "openssh-sftp openssh-sftp-server rsync zip libdrm"

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-macchinaimaginis-dev \
    packagegroup-core-full-cmdline \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    "

inherit core-image



