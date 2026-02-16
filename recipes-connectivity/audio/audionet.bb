SUMMARY = "Audionet: A configuration for Jack"
LICENSE = "MIT"

DEPENDS += "jack"

SRC_URI = "file://jackserver.sh \
           file://jackconnect.sh \
           file://jackclient.sh \
           "

do_install() {
    install -d ${D}${bindir}
    for f in ${WORKDIR}/sources-unpack/*; do
        install -m 0755 $f ${D}${bindir}/
    done
}

