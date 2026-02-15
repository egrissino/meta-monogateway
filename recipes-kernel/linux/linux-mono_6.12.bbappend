SRC_URI:remove = "file://defconfig"
FILESEXTRAPATHS:prepend := "${THISDIR}:"
SRC_URI:append = "file://gatewayos/defconfig"
