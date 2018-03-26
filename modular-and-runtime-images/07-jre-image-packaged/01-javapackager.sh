#!/bin/sh

javapackager -deploy \
	-outdir output \
	-name greetings \
	-native deb \
	-BsignBundle=false \
	-BappVersion=1.0 \
	"-Bvendor=Frank Dietrich" \
	"-Bemail=bits_n_bytes@gmx.de" \
	"-BlicenseType=GPL v2 + Classpath Exception" \
    -BjlinkOptions=compress=2 \
	--module-path mlib \
	--module com.greetings/com.greetings.Main
