SUMMARY = "Intel PFR Manager Service"
DESCRIPTION = "Daemon to handle all PFR functionalities"

PV = "1.0+git${SRCPV}"

S = "${WORKDIR}/git/intel-pfr-manager"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

SRC_URI = "git://git@github.com/Intel-BMC/provingground.git;protocol=ssh"
SRCREV = "226ca2842e0a14ad56b4ebeedfd82ac2ea7e145e"

inherit cmake systemd
SYSTEMD_SERVICE_${PN} = "xyz.openbmc_project.Intel.PFR.Manager.service"

DEPENDS += " \
    sdbusplus \
    phosphor-logging \
    boost \
    i2c-tools \
    "
