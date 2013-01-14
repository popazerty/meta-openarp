SUMMARY = "libdvdnav wrapper for enigma2 based stbs"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94d55d512a9ba36caa9b7df079bae19f"
DEPENDS = "libdvdnav"
#SRCREV = "ee7b0b4c1b35264ed7e003782b501040b7b435fd"
PR = "r3"

inherit autotools pkgconfig git-project

SRC_URI = " git://github.com/mirakels/libdreamdvd.git"

