OE-Alliance BSP Layer - For STLinux sh4 based Set-Top-Boxes 
============================================================

This is the general hardware specific BSP overlay for STLinux based devices.
It should be used with OE-Alliance


This layer in its entirety depends on:

    URI: https://github.com/oe-alliance/build-enviroment.git
    
It is preferred that people raise pull requests using GIThub by forking the appropriate tree:

                   https://github.com/drgogeta86/meta-stlinux.git
                   (More info on achieving this can be found at http://help.github.com/send-pull-requests/)

        
How to use it with openembedded core 
------------------------------------

## Clone openembedded-core
    git clone git://git.openembedded.org/openembedded-core oe-core

## Move to top folder
    

Independent Steps from poky/oe-core
-----------------------------------

## Clone meta-stlinux
    git clone https://github.com/drgogeta86/meta-stlinux.git meta-stlinux
    
## Initialize the oe-alliance build environment 
    
    

## Add meta-stlinux in bblayers.conf 
    vim conf/bblayers.conf
    ...
    BBLAYERS ?= " \
      ${TOPDIR}/../oe-core/meta \
      ${TOPDIR}/../meta-stlinux \
    "
    ...

## Set MACHINE to spark and package type to ipk in local.conf
    vim conf/local.conf
    ...
    # Currently only spark hardware is supported
    MACHINE ??= "spark"
    ...
    PACKAGE_CLASSES ?= "package_ipk"
    ...
   

## Run bitbake: 

    bitbake core-image-minimal 


Prerequisite
------------

For the coprocessor firmware loading you have to provide the coprocessor firmware. Put the files either in the folder /data/stslave_fw/${MACHINE} or overwrite the variable  "BINARY_STSLAVE_FW_PATH" in your conf/local.conf file. These files are audio.elf and video.elf. For spark this looks like this: 
-   /data/stslave_fw/spark/video.elf
-   /data/stslave_fw/spark/audio.elf

These files can be extracted from a alternative image and are not part of this repository.

Caution!
--------

Currently the only supported boot mechanism is booting a USB Stick. Fore more information 
have a look at this wiki page: [Boot-from-USB-Stick](https://github.com/project-magpie/meta-stlinux/wiki/Boot-from-USB-Stick)

Layer maintainer: Christian Ege (graugans) k4230r6 at googlemail.com and forked by Fabio Isgro' ( dr_gogeta86)
