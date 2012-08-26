SECTION = "Software"
DESCRIPTION = "OpenBTS"
PR = "r0"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://COPYING;md5=2d73201eaa7756524349718536abd889"
SRC_URI = "file://openbts-2.8.0.tar.gz"
DEPENDS ="libosip2 ortp asterisk"
S = "${WORKDIR}/openbts-2.8.0"
inherit autotools pkgconfig  

do_configure () {
    autoreconf -i
   ./configure --with-uhd CFLAGS="-march=armv7-a -mtune=cortex-a8 -mfpu=neon -mfloat-abi=softfp -O3" CXXFLAGS="-march=armv7-a -mtune=cortex-a8 -mfpu=neon -mfloat-abi=softfp -O3" --host=${TARGET_SYS} 
}
do_compile () {
   oe_runmake
}
do_install () {
   DESTDIR=${D} oe_runmake install
}

SRC_URI[md5sum] = "f0d69d68c52aa8a074ac18a669162dac"
SRC_URI[sha256sum] = "63f869f65245a9fcb07bc6124f98a91e99d2f115ae2efb6857fd5fc1deb2bd87"

