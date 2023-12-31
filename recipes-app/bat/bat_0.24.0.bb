# Summary from project homepage
SUMMARY = "A cat clone with wings"

# for the sake of package manager info we set SECTION
SECTION = "tools"

HOMEPAGE = "https://github.com/sharkdp/bat"

# According to the README fie of the project
LICENSE = "MIT"
DEPENDS += "zlib"

# Enable network for the compile task allowing cargo to download dependencies
do_compile[network] = "1"

SRC_URI = "git://github.com/sharkdp/bat.git;protocol=https;branch=master"
SRCREV = "28990bc4512770a2669de33cf71a2edb26abd061"

LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=c46eaa1315aaa0c727a29b157ad9170a"

EXTRA_RUSTFLAGS = "-C strip=none"

S = "${WORKDIR}/git"


inherit cargo_bin
