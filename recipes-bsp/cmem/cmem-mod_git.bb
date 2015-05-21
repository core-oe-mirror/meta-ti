DESCRIPTION = "Kernel module for contiguous memory allocation from userspace"

include cmem.inc

# This package builds a kernel module, use kernel PR as base and append a local
MACHINE_KERNEL_PR_append = "b"
PR = "${MACHINE_KERNEL_PR}"

inherit module

EXTRA_OEMAKE += '-f lu.mak KERNEL_INSTALL_DIR="${STAGING_KERNEL_DIR}" TOOLCHAIN_PREFIX="${TOOLCHAIN_PREFIX}" EXEC_DIR="${D}/lib/modules/${KERNEL_VERSION}/extra"'
MAKE_TARGETS = "module"

module_autoload_cmemk = "cmemk"
