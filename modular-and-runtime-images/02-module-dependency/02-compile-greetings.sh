#!/bin/sh

javac -d mods/com.greetings \
	--module-path mods \
	src/com.greetings/module-info.java \
	src/com.greetings/com/greetings/Main.java

