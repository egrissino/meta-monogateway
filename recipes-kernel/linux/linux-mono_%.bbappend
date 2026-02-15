FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI:remove = "file://defconfig"
SRC_URI:append = " file://defconfig"
