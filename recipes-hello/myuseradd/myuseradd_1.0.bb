DESCRIPTION = "useradd class usage example"
PRIORITY = "optional"
SECTION = "examples"
LICENSE = "MIT"
SRC_URI += "file://file0"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit useradd

USERADD_PACKAGES = "${PN}"
USERADD_PARAM:${PN} = "-u 1000 -d /home/user0 -s /bin/bash user0"

do_install() {
	install -m 0755 -d ${D}/home/user0
	install -m 644 ${WORKDIR}/file0 ${D}/home/user0/
	chown user0:user0 ${D}/home/user0/file0
}

FILES:${PN} = "/home/user0/file0"
