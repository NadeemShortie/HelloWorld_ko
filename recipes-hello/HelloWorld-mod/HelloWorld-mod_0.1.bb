SUMMARY = "hello-module"
DESCRIPTION = "Enables user mode access to PMU registers"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""
SRCBRANCH = "master"

inherit module

SRC_URI = "https://github.com/NadeemShortie/HelloWorld_ko.git;protocol=https;branch=${SRCBRANCH}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

RPROVIDES_${PN} += "kernel-module-hello-user"