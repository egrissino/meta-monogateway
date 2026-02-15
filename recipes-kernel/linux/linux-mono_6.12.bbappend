SRC_URI:remove = "file://defconfig"
FILESEXTRAPATHS:prepend := "${THISDIR}:"
SRC_URI:append = "file://gatewayos/defconfig_new"


do_configure:prepend() {
    cp ${UNPACKDIR}/gatewayos/defconfig_new ${B}/.config
}