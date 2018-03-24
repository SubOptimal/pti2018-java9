#!/bin/sh

jar --create \
	--file=mlib/com.greetings.jar \
	--main-class=com.greetings.Main \
	-C mods/com.greetings .
