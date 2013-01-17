DESCRIPTION = "Enigma2 Skin DMConcinnity HD"
MAINTAINER = "kerni"
SECTION = "base"
PRIORITY = "required"
LICENSE = "proprietary"
PACKAGE_ARCH = "all"

require conf/license/license-gplv2.inc

inherit gitpkgv
SRCREV = "${AUTOREV}"
PV = "2.0+git${SRCPV}"
PKGV = "2.0+git${GITPKGV}"
VER ="2.0"
PR = "r0"

SRC_URI="git://github.com/openaaf/enigma2-plugin-skins-dmcconcinnityhd.git"

S = "${WORKDIR}/git"

FILES_${PN} = "/usr/*"

do_install() {
	cp -rp ${S}/usr ${D}/
}