DESCRIPTION = "Merge machine and distro options to create a enigma2 feeds machine task/package"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
PV = "1.0"
PR = "r1"

inherit task

RRECOMMENDS = "\
	openarp-picons-meta \
	openarp-3rdparty-plugins \
	enigma2-skins \
	enigma2-pliplugins \
	enigma2-plugin-vix-magic-sd \
	enigma2-plugin-vix-magic-hd \
	enigma2-plugin-vix-magic-hd-lite \
	enigma2-plugin-vix-magic-hd-night \
	enigma2-plugin-vix-day-hd \
	enigma2-plugin-vix-night-hd \
	enigma2-plugin-vix-vixbmc-slim-hd \
	enigma2-plugin-vix-vixbmc-night-hd \
	enigma2-plugin-extensions-project-valerie \
	enigma2-plugin-extensions-xmltvimport \
	enigma2-plugin-systemplugins-crossepg \
	curlftpfs \
	"
