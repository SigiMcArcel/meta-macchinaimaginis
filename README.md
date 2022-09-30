# meta-macchinaimaginis
rasperry pi image for machina imaginis art machines.
Includes library and executables for controlling lamps,switches and playing sounds.



see https://www.machinaimaginis.com/

Please see the corresponding sections below for details.

Dependencies
============

BB_VERSION           = "1.52.0"
BUILD_SYS            = "x86_64-linux"
NATIVELSBSTRING      = "universal"
TARGET_SYS           = "aarch64-poky-linux"
MACHINE              = "raspberrypi4-64"
DISTRO               = "poky"
DISTRO_VERSION       = "3.4.2"
TUNE_FEATURES        = "aarch64 armv8a crc crypto cortexa72"
TARGET_FPU           = ""
meta                 
meta-poky            
meta-yocto-bsp       = "honister:ef97194d30385c1124d2f671024882358fb8609f"
meta-raspberrypi     = "honister:378d4b6e7ba64b6a9a701457cc3780fa896ba5dc"
meta-macchinaimaginis = "main:0562f82635adc4813c522b098cbd26e2a9aaa0da"

Thanks to <https://github.com/agherzan/meta-raspberrypi> for his work.
  
Patches
=======

Table of Contents
=================

  I. Adding the meta-macchinaimaginis layer to your build
 II. Misc


I. Adding the meta-macchinaimaginis layer to your build
=================================================

Run 'bitbake-layers add-layer meta-macchinaimaginis'

II. Misc
========
