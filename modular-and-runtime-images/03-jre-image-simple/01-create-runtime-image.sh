#!/bin/sh

jlink --module-path ${JAVA_HOME}/jmods:mlib \
	--add-modules com.greetings \
	--output output/greetingsapp
