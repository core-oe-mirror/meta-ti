DESCRIPTION="User space IO (UIO) driver for on-chip modules"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2b7c96eb2aed7b0f6f922214dbde9016"

BRANCH ?= "master"
# This corresponds to version 01.00.02.01
SRCREV = "c1988446e3364af4df7cd877e6536f0c6647d7bb"
PV = "1.0.2.1+git${SRCPV}"

SRC_URI = "git://git.ti.com/keystone-linux/uio-module-drv.git;protocol=git;branch=${BRANCH}"

# This package builds a kernel module, use kernel PR as base and append a local
MACHINE_KERNEL_PR_append = "b"
PR = "${MACHINE_KERNEL_PR}"

S = "${WORKDIR}/git"

module_auto_load_uio-module-drv = "uio-module-drv"

inherit module
