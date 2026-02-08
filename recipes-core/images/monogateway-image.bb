SUMMARY = "Gateway Image"
DESCRIPTION = "A development and tinkering image"
LICENSE = "MIT"

inherit core-image extrausers

# Audio (alsa, pulse)
IMAGE_INSTALL:append = " \
    alsa-utils \
    busybox \
    pulseaudio \
    "