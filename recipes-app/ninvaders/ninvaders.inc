SUMMARY="nInvaders Game"

SECTION="game"

RDEPENDS:${PN} = "ncurses-terminfo"
DEPENDS = "ncurses"

SRC_URI="https://sourceforge.net/projects/ninvaders/files/ninvaders/${PV}/${BPN}-${PV}.tar.gz"

do_install() {
        install -d ${D}${bindir}
        install -m 0755 ${S}/nInvaders ${D}${bindir}
}
