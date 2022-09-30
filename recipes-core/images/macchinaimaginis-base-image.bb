# Base this image on core-image-minimal
DESCRIPTION = "core-image-full-cmdline."



IMAGE_FEATURES += "splash ssh-server-openssh"
CORE_IMAGE_EXTRA_INSTALL += "openssh-sftp openssh-sftp-server rsync zip"


IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    rsync \
    libsndfile1 \
    nano \
    packagegroup-macchinaimaginis-dev \
    packagegroup-macchinaimaginis-sound \
    packagegroup-macchinaimaginis-io \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    "

inherit core-image



