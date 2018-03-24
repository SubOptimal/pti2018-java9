#!/bin/sh

[ -d output/ ] && r, -rf output
[ -d mods/ ] && rm -rf mods
[ -d mlib/ ] && rm -rf mlib

mkdir output/
mkdir mods/
mkdir mlib/

javac -d mods/org.astro \
	src/org.astro/module-info.java \
	src/org.astro/org/astro/World.java

javac -d mods/com.greetings \
	--module-path mods \
	src/com.greetings/module-info.java \
	src/com.greetings/com/greetings/Main.java

jar --create \
	--file=mlib/org.astro.jar \
	--module-version 1.0 \
    -C mods/org.astro .

jar --create \
	--file=mlib/com.greetings.jar \
	--main-class=com.greetings.Main \
	-C mods/com.greetings .
