HOMEPAGE = "https://www.gitorious.org/open-duckbox-project-sh4/tdt"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"
DEPENDS = "tdt-driver"

PR = "r1"

SRCREV = "18ad9ec6051dc5730822d38f1fc85f67c989c31f"

SRC_URI = " \
	git://code.google.com/p/arp-driver.git;protocol=http;branch=master \
"
PV = "0.1+git${SRCPV}"

S = "${WORKDIR}/git"

inherit autotools 

EXTRA_OECONF = "--enable-silent-rules --enable-maintainer-mode --prefix="

do_compile() {
	 oe_runmake  'DESTDIR=${D}' 'SUBDIRS=${@d.getVar('PN',1).replace('-', '_')}' 
}

do_install() {
	 oe_runmake  'DESTDIR=${D}' 'SUBDIRS=${@d.getVar('PN',1).replace('-', '_')}' install
}
