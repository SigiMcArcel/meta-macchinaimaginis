# Base this image on core-image-minimal
DESCRIPTION = "core-image-full-cmdline."

# include macchinaimaginis-base-image.bb


IMAGE_FEATURES:append = " splash ssh-server-openssh dev-pkgs "
CORE_IMAGE_EXTRA_INSTALL:append = "openssh-sftp openssh-sftp-server rsync zip"


IMAGE_INSTALL:append = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    packagegroup-core-buildessential \
    packagegroup-sdk-target \
    gdbserver \
    rsync \
    libsndfile1 \
    alsa-utils \
    nano \
    rapidjson \
    kernel-modules \
	usbutils \
	i2c-tools \
	libsndfile1 \
	libmodbus \
	miutils \
    midriver \
	mimodules \
	misound \
	micomponents \
    mitasks \
    miquadratmachine \
    udev-usb-sound \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    "

inherit core-image



