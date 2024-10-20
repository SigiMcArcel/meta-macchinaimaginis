#!/bin/bash

# rootfolder
#    |- rpi64-build
#    |- sources
#          |- poky
#          |- meta-macchinaimaginis
#          |- meta-openembedded
#          |- meta-raspberrypi

# Exit immediately if a command exits with a non-zero status.

ROOT_FOLDER_PREFIX="../../../"
BUILD_FOLDER="$ROOT_FOLDER_PREFIX/rpi64-build"

# create build folder
mkdir -p "$BUILD_FOLDER"
# copy conf and bblayer
cp "$PWD/bblayers.conf" "$BUILD_FOLDER"
cp "$PWD/local.conf" "$BUILD_FOLDER"

# jump into poky and call oe-init-build.env
cd "$ROOT_FOLDER_PREFIX"source/poky
source oe-init-build-env ../../rpi64-build
