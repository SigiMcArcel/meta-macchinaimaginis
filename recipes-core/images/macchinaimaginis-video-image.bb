SUMMARY = "Image with Sato, a mobile environment and visual style for mobile devices."
DESCRIPTION = "Image with Sato, a mobile environment and visual style for \
mobile devices. The image supports X11 with a Sato theme, Pimlico \
applications, and contains terminal, editor, and file manager."
HOMEPAGE = "https://www.yoctoproject.org/"

IMAGE_FEATURES += "splash package-management ssh-server-openssh hwcodecs x11"

LICENSE = "MIT"


inherit core-image

TOOLCHAIN_HOST_TASK:append = " nativesdk-intltool nativesdk-glib-2.0"
TOOLCHAIN_HOST_TASK:remove:task-populate-sdk-ext = " nativesdk-intltool nativesdk-glib-2.0"

QB_MEM = '${@bb.utils.contains("DISTRO_FEATURES", "opengl", "-m 512", "-m 256", d)}'
QB_MEM:qemuarmv5 = "-m 256"
QB_MEM:qemumips = "-m 256"

IMAGE_INSTALL+= "\
    packagegroup-macchinaimaginis-dev \
    rsync zip linux-firmware \
    openssh-sftp openssh-sftp-server \
    mesa \
    glmark2 \
    "



