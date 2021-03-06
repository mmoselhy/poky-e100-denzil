require recipes/linux/linux.inc

DESCRIPTION = "Linux kernel for OMAP processors"
KERNEL_IMAGETYPE = "uImage"

COMPATIBLE_MACHINE = "usrp-e1xx"

FILESPATHPKG_prepend = "linux-usrp-embedded-3.0-pm:"

PV = "3.0-pm"
MACHINE_KERNEL_PR_append = "d"

SRCREV = "38fa80e38cf348dc599a9f01e5a2cd052e5af775"
SRC_URI = "git://www.sakoman.com/git/linux-omap-2.6.git;branch=omap-3.0-pm;protocol=git \
	file://0001-Add-defines-to-set-config-options-in-GPMC-per-CS-con.patch \
	file://0002-Add-functions-to-dma.c-to-set-address-and-length-for.patch \
	file://0003-Add-defconfig-to-save-working-kernel-.config.patch \
	file://0004-usrp_e-Add-driver-for-USRP-E1XX-FPGA-interface.patch \
	file://0005-usrp_e-Modify-overo-board-file-to-setup-hardware-for.patch \
	file://834c2a69c87ee7211932f8ec5102a472828abcb1.patch \
	file://0001-mmc-Max-dto-to-14-for-testing.patch \
	file://195bcbf5078d74c8e00d68f04eb8695196fb31e8.patch \
	file://defconfig \
	"

S = "${WORKDIR}/git"

