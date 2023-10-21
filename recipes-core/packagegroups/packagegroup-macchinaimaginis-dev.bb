DESCRIPTION = "macchinaimaginis Packagegroup"

inherit packagegroup


PACKAGES = " \
	packagegroup-macchinaimaginis-dev \
"

RDEPENDS:packagegroup-macchinaimaginis-dev = " \
	packagegroup-core-buildessential \
    	packagegroup-sdk-target \
    	gdbserver \
"


