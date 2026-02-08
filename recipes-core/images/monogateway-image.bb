SUMMARY = "Gateway Image"
DESCRIPTION = "A development and tinkering image"
LICENSE = "MIT"

require recipes-core/images/mono-sdk-image.bb

IMAGE_FEATURES:append = " allow-empty-password allow-root-login empty-root-password"

# Utils
IMAGE_INSTALL:append = "openssh screen apt python3 python3-pip python3-venv"

# Audio
PACKAGE_EXCLUDE:remove = "alsa-utils busybox pulseaudio"
IMAGE_INSTALL:append = " alsa-utils busybox pulseaudio"

# Dev
IMAGE_INSTALL:append = " nano"