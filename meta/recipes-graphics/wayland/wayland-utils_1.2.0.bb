SUMMARY = "Wayland utilities"
DESCRIPTION = "Wayland-utils contains (for now) \
wayland-info, a utility for displaying information about the Wayland \
protocols supported by a Wayland compositor. \
wayland-info is basically a standalone version of weston-info as found \
in weston repository. "
HOMEPAGE = "http://wayland.freedesktop.org"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=548a66038a77415e1df51118625e832f \
                   "

SRC_URI = "https://gitlab.freedesktop.org/wayland/wayland-utils/-/archive/${PV}/${BPN}-${PV}.tar.bz2"
SRC_URI[sha256sum] = "f38c6a4ca2113cf716ca687a4cd8e24a11cbeeb04759678b7bb2da7d16335d18"

UPSTREAM_CHECK_URI = "https://gitlab.freedesktop.org/wayland/wayland-utils/-/tags"

inherit meson pkgconfig

DEPENDS += "wayland wayland-native wayland-protocols"

PACKAGECONFIG ??= "drm"
PACKAGECONFIG[drm] = "-Ddrm=enabled,-Ddrm=disabled,libdrm"
