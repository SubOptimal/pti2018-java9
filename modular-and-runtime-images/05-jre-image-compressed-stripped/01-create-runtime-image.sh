#!/bin/sh

jlink --module-path ${JAVA_HOME}/jmods:mlib \
	--add-modules com.greetings \
    --compress=2 \
	--no-header-files \
	--no-man-pages \
	--strip-debug \
	--output output/greetingsapp
