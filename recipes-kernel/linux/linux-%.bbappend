

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI += " file://usb-audio.cfg"
KERNEL_CONFIG_FRAGMENTS += "usb-audio.cfg"
