# Copyright (C) 2012.
#
DESCRIPTION = "An X11 image just capable of allowing a device to boot."

IMAGE_INSTALL = "task-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_FEATURES += "apps-console-core ${X11_IMAGE_FEATURES}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

#IMAGE_ROOTFS_SIZE = "8192"

# remove not needed ipkg informations
ROOTFS_POSTPROCESS_COMMAND += "remove_packaging_data_files ; "
