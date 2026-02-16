SUMMARY = "Audionet: A configuration for Jack"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

DEPENDS += "jack"

SRC_URI = "file://jackserver.sh \
           file://jackconnect.sh \
           file://jackclient.sh \
           file://COPYING.MIT \
           "

S = "${WORKDIR}/sources-unpack"
RDEPENDS_${PN} += "bash"

do_install() {
    install -d ${D}${bindir}
    for f in ${WORKDIR}/sources-unpack/*; do
        install -m 0755 $f ${D}${bindir}/
    done
}

