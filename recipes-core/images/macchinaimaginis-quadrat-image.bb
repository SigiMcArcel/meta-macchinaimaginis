# Base this image on core-image-minimal
DESCRIPTION = "core-image-full-cmdline."

# include macchinaimaginis-base-image.bb


IMAGE_FEATURES += "splash ssh-server-openssh"
CORE_IMAGE_EXTRA_INSTALL += "openssh-sftp openssh-sftp-server rsync zip"


IMAGE_INSTALL += "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    rsync \
    libsndfile1 \
    alsa-utils \
    nano \
    rapidjson \
    packagegroup-macchinaimaginis-dev \
    packagegroup-macchinaimaginis-core \
    packagegroup-macchinaimaginis-framework \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    "

inherit core-image



