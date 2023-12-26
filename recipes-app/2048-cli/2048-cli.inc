SUMMARY="2048 Cli Game"
SECTION="game"

#SRC_URI="https://github.com/tiehuis/2048-cli/archive/refs/tags/v${PV}.tar.gz;protocol=https"
SRC_URI = "git://github.com/tiehuis/2048-cli.git;branch=master;protocol=https"

LICENSE = "MIT"

S = "${WORKDIR}/git"

do_install() {
        install -d ${D}${bindir}
        install -m 0755 ${S}/2048 ${D}${bindir}
}
