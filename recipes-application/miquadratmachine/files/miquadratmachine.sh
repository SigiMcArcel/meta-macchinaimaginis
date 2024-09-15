#!/bin/sh

case $1 in

	start)
		/usr/bin/miwoodenmachine -d
		;;

	stop)
		killall miwoodenmachine
		;;

	restart)
		$0 stop
		$0 start
		;;
	*)
		echo "Usage: $0 [start|stop|restart]"
		;;
esac