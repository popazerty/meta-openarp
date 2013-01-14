SUMMARY = "CDfs filesystem"
HOMEPAGE = "http://users.elis.ugent.be/~mronsse/cdfs/"
SECTION = "kernel/modules"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"

MACHINE_KERNEL_PR_append = ".2"

SRC_URI = " \
        http://users.elis.ugent.be/~mronsse/cdfs/download/${P}.tar.bz2 \
        file://0001-Fix-compile-error-with-linux-2.6.32.patch \
        file://0002-Fix-compile-error-with-linux-2.6.37.patch \
        file://fix-strange-errors.patch \
        file://compile-fix-linux-3.2.patch \
        file://add-3.4-support.patch \
"
SRC_URI[md5sum] = "ac64c014a90e3c488394832ea29605b3"
SRC_URI[sha256sum] = "d034f6c6d9578fe2addfaeceaa101584a4a1fc9f27d825c340baebd345d8d724"

inherit module machine_kernel_pr

do_compile() {
        unset CFLAGS CPPFLAGS CXXFLAGS LDFLAGS
        oe_runmake -C "${STAGING_KERNEL_DIR}" SUBDIRS="${S}" modules
}

do_install() {
        unset CFLAGS CPPFLAGS CXXFLAGS LDFLAGS
        oe_runmake -C "${STAGING_KERNEL_DIR}" SUBDIRS="${S}" DEPMOD=echo INSTALL_MOD_PATH="${D}" modules_install
}
