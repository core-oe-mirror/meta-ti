require u-boot-ti.inc

DESCRIPTION = "u-boot bootloader for TI devices"

LIC_FILES_CHKSUM = "file://Licenses/README;md5=025bf9f768cbcb1a165dbe1a110babfb"

PV = "2013.10"
PR = "r1+gitr${SRCPV}"

SRC_URI = "git://git.ti.com/ti-u-boot/ti-u-boot.git;protocol=git;branch=${BRANCH}"

BRANCH ?= "ti-u-boot-2013.10"

# Corresponds to ti2013.12.00 release
SRCREV = "4c677486ec4897c90272aac77f8156c15ca27ce2"

SPL_BINARY = "MLO"
SPL_UART_BINARY = "u-boot-spl.bin"
