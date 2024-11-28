SUMMARY = "Backport of pathlib-compatible object wrapper for zip files"
HOMEPAGE = "https://github.com/jaraco/zipp"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=141643e11c48898150daa83802dbc65f"

SRC_URI[sha256sum] = "84e64a1c28cf7e91ed2078bb8cc8c259cb19b76942096c8d7b84947690cabaf0"

DEPENDS += "python3-setuptools-scm-native"

inherit pypi python_setuptools_build_meta

SRC_URI += " \
    file://0001-Add-SanitizedNames-mixin.patch \
    file://0002-Employ-SanitizedNames-in-CompleteDirs.-Fixes-broken-.patch \
    file://0003-Removed-SanitizedNames.patch \
    file://0004-Address-infinite-loop-when-zipfile-begins-with-more-.patch \
    file://0005-Prefer-simpler-path.rstrip-to-consolidate-checks-for.patch \
"

DEPENDS += "python3-toml-native"

RDEPENDS:${PN} += "python3-compression \
                   python3-math \
                   python3-more-itertools"

BBCLASSEXTEND = "native nativesdk"
