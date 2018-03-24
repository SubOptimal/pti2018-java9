#!/bin/sh

javapackager -deploy \
	-outdir output \
	-name greetings \
	-native deb \
	-BsignBundle=false \
	-BappVersion=1.0 \
    -BjlinkOptions=compress=2 \
	--module-path mlib \
	--module com.greetings/com.greetings.Main
