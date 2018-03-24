#!/bin/sh

jlink --module-path ${JAVA_HOME}/jmods:mlib \
	--add-modules com.greetings \
    --compress=2 \
	--output output/greetingsapp
