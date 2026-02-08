SUMMARY = "Gateway Image"
DESCRIPTION = "A development and tinkering image"
LICENSE = "MIT"

require recipes-core/images/mono-sdk-image.bb

# Utils
IMAGE_INSTALL:append = "openssh screen apt python3 python3-pip python3-venv"

# Audio
IMAGE_INSTALL:append = " alsa-utils busybox pulseaudio"