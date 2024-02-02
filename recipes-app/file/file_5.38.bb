DESCRIPTION = "File is a utility that provides information about file types."
SECTION = "tools"

LICENSE = "BSD"

SRC_URI = "http://ftp.astron.com/pub/file/file-${PV}.tar.gz"
SRC_URI[sha256sum] = "593c2ffc2ab349c5aea0f55fedfe4d681737b6b62376a9b3ad1e77b2cc19fa34"
LIC_FILES_CHKSUM = "file://COPYING;md5=8bafafc441e2e0b9660848c98760b5f3"

inherit autotools
do_install() {
    oe_runmake 'DESTDIR=${D}' install

    # Remove unwanted files
    rm -rf ${D}/usr/share/misc
}
