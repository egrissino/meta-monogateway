SUMMARY = "Audionet: A configuration for Jack"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

DEPENDS += "jack"
RDEPENDS_${PN} += "bash"

S = "${WORKDIR}/sources-unpack"

SRC_URI = "file://jackserver.sh \
           file://jackconnect.sh \
           file://jackclient.sh \
           file://COPYING.MIT \
           "

do_install() {
    install -d ${D}${bindir}
    for f in ${WORKDIR}/sources-unpack/*; do
        install -m 0755 $f ${D}${bindir}/
    done
}

