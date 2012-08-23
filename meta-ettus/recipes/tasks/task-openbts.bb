DESCRIPTION = "Base software to install GNU Radio"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"


PR = "r1"
inherit task

RDEPENDS_${PN} = " \
  task-usrp-embedded \
  task-base-extended \
  task-proper-tools \
  libosip2-dev \
  ortp-dev \
  asterisk \
  openbts \
"



