DESCRIPTION = "Print a friendly, customizable greeting"
HOMEPAGE = "https://www.gnu.org/software/hello/"
PRIORITY = "optional"
SECTION = "examples"
LICENSE = "GPL-3.0-or-later"
SRC_URI = "${GNU_MIRROR}/hello/hello-${PV}.tar.gz"
SRC_URI[md5sum] = "048d95d41f9c0bd3424bf0917f53782d"
SRC_URI[sha256sum] = "cf04af86dc085268c5f4470fbae49b18afbc221b78096aab842d934a76bad0ab"
LIC_FILES_CHKSUM = "file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464"

inherit gettext
DEPENDS = "gettext"
inherit autotools-brokensep
