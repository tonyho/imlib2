DESCRIPTION = "im lib2"
#DEPENDS = "curl libmodbus sqlite3 jsoncpp gpsd"
RDEPENDS_${PN} = "freetype libxdmcp tiff libx11 jpeg libbz2 libxext libxcb libpng liblzma zlib libxau"


SECTION = "libs"
LICENSE = "MIT"
#PV = "1"
#PR = "r0"

SRC_URI = " \
    file://imlib2-${PV}.tar.bz2 \
    file://copyright  \
"

LIC_FILES_CHKSUM = "file://${WORKDIR}/copyright;md5=3dd6192d306f582dee7687da3d8748ab"
S = "${WORKDIR}/imlib2-${PV}"

inherit autotools pkgconfig



#do_configure () {
#}
#
#do_compile () {
#    make
#}
#
#do_install () {
#	install -d ${D}${bindir}/
#	install -m 0755 ${S}/atinout ${D}${bindir}/
#}

FILES_${PN}-dbg += " \
    ${libdir}/${BPN}/loaders/.debug \
    ${libdir}/${BPN}/filters/.debug \
"

FILES_${PN} =  " \
    ${bindir} \
    ${sbindir} \
    ${libexecdir} \
    ${libdir}/lib*.so.* \
    ${sysconfdir} \
    ${sharedstatedir} \
    ${localstatedir} \
    /bin \
    /sbin \
    /lib/*.so* \
    /usr/share/* \
    ${libdir}/${BPN} \
    ${libdir}/${BPN}/* \
"

