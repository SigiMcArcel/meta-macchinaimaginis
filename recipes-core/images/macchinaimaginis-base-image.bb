# Base this image on core-image-minimal
DESCRIPTION = "core-image-full-cmdline."

IMAGE_FEATURES += "ssh-server-openssh"
CORE_IMAGE_EXTRA_INSTALL += "openssh-sftp openssh-sftp-server rsync zip"

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    packagegroup-macchinaimaginis-dev \
    packagegroup-macchinaimaginis-core \
    packagegroup-macchinaimaginis-framework \
    "

inherit core-image



