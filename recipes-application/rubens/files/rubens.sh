#!/bin/sh

case $1 in

	start)
		/usr/bin/rubens -d
		;;

	stop)
		killall rubens
		;;

	restart)
		$0 stop
		$0 start
		;;
	*)
		echo "Usage: $0 [start|stop|restart]"
		;;
esac