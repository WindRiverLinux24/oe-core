#
# Copyright OpenEmbedded Contributors
#
# SPDX-License-Identifier: GPL-2.0-only
#
# Include this class when you don't care what version of SPDX you get; it will
# be updated to the latest stable version that is supported
SPDX_CLASS ??= "create-spdx-2.2"
inherit ${SPDX_CLASS}
