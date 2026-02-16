SUMMARY = "Audionet: A configuration for Jack"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=b3b732d1349633a53e69356607fd2d6c"

DEPENDS += "libjack"

SRC_URI = "file://files/jackserver.sh \
           file://files/jackconnect.sh \
           file://files/jackclient.sh \
           "

do_install() {
    install -d ${D}${bindir}
    for f in ${WORKDIR}/files/*; do
        install -m 0755 $f ${D}${bindir}/
    done
}

