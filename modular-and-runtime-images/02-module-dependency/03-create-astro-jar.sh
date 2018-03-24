#!/bin/sh

jar --create \
	--file=mlib/org.astro.jar \
	--module-version 1.0 \
    -C mods/org.astro .
