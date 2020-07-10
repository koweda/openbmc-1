SUMMARY = "Abseil Python Common Libraries"
HOMEPAGE = "https://github.com/abseil/abseil-py"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "git://github.com/abseil/abseil-py.git"
SRCREV ?= "06edd9c20592cec39178b94240b5e86f32e19768"

inherit setuptools3

S = "${WORKDIR}/git"

BBCLASSEXTEND = "native"
