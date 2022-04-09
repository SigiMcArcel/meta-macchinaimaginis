DESCRIPTION = "macchinaimaginis Packagegroup"

inherit packagegroup


PACKAGES = "\
	packagegroup-macchinaimaginis-sound \
"

RDEPENDS:packagegroup-macchinaimaginis-sound = "\
    	alsa-utils \	
    	alsa-lib \
    	alsa-tools \
    	libsndfile1 \
    	libsndfile1-dev \
    	misound \
"


