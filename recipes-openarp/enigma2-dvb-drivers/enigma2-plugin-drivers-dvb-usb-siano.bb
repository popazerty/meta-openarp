DESCRIPTION = "USB DVB driver for Siano chipset"

require conf/license/openpli-gplv2.inc

DVBPROVIDER ?= "kernel"

RDEPENDS_${PN} = " \
	${DVBPROVIDER}-module-smsusb \
	${DVBPROVIDER}-module-smsdvb \
	firmware-dvb-siano \
	firmware-dvb-nova-12mhz-b0 \
	firmware-isdbt-nova-12mhz-b0 \
	"

PV = "1.0"
PR = "r5"

ALLOW_EMPTY_${PN} = "1"
