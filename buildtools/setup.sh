#!/bin/bash

# rootfolder
#    |- rpi64-build
#    |- sources
#          |- poky
#          |- meta-macchinaimaginis
#          |- meta-openembedded
#          |- meta-raspberrypi

# Exit immediately if a command exits with a non-zero status.
set -e

ROOT_FOLDER_PREFIX="../../../"

# create build folder
mkdir -p "$ROOT_FOLDER/rpi64-build"
# copy conf and bblayer
cp bblayers.conf "$ROOT_FOLDER/rpi64-build"
cp local.conf "$ROOT_FOLDER/rpi64-build"

# jump into poky and call oe-init-build.env
cd "$ROOT_FOLDER/source/poky"
source source oe-init-build-env ../../rpi64-build
