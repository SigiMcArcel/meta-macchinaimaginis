# Base this image on core-image-minimal
DESCRIPTION = "core-image-full-cmdline."
LICENSE = "CLOSED"

IMAGE_FEATURES += "splash package-management x11 x11-base ssh-server-dropbear  hwcodecs"

IMAGE_FEATURES:remove = "wayland"
CORE_IMAGE_EXTRA_INSTALL += "rsync zip libgles2 xserver-xorg"

IMAGE_INSTALL += "\
    packagegroup-core-boot \
    rsync \
    libsndfile1 \
    alsa-utils \
    nano \
    rapidjson \
    mesa \
    glmark2 \
    matchbox-wm \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    "

LICENSE = "MIT"

inherit core-image

TOOLCHAIN_HOST_TASK:append = " nativesdk-intltool nativesdk-glib-2.0"
TOOLCHAIN_HOST_TASK:remove:task-populate-sdk-ext = " nativesdk-intltool nativesdk-glib-2.0"

QB_MEM = '${@bb.utils.contains("DISTRO_FEATURES", "opengl", "-m 512", "-m 256", d)}'
QB_MEM:qemuarmv5 = "-m 256"
QB_MEM:qemumips = "-m 256"







