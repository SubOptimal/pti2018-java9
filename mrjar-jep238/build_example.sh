#!/bin/sh

javac -d target8/ \
	-target 8 \
	-source 8 \
	-Xlint:-options \
	src8/pti2018/mrjar/Main.java

javac --add-modules java.xml.bind \
	-d target9/ \
	src9/pti2018/mrjar/Main.java

jar --create \
	--file mrjar-jep238.jar \
	--main-class pti2018.mrjar.Main \
	-C target8/ pti2018/mrjar/Main.class \
	--release 9 \
	-C target9/ pti2018/mrjar/Main.class
