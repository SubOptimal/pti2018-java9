With Java 9 a JAR file (a so called multi-release JAR, in short MR JAR) can contain classes for different Java releases. This allows the use of Java version specific features.

To compile and build the JAR file the Java 9 JDK is used.

In the example we use the `SHA-1` algorithm for Java 8 and `SHA3-512` for Java 9 (as SHA-1 was removed with this release).

#### compile the source for Java 8

```
javac -d target8/ \
	-target 8 \
	-source 8 \
	src8/pti2018/mrjar/Main.java
```

#### compile the source for Java 9

```
javac --add-modules java.xml.bind \
	-d target9/ \
	src9/pti2018/mrjar/Main.java
	```

#### create the multi-release JAR file

```
	jar --create \
		--file mrjar-jep238.jar \
		--main-class pti2018.mrjar.Main \
		-C target8/ pti2018/mrjar/Main.class \
		--release 9 \
		-C target9/ pti2018/mrjar/Main.class
```

All release specific files are stored below the directory `META-INF`. The file structure is `META-INF/versions/{release number}/{package path}/{class}`.

```
$ jar --list --file mrjar-jep238.jar
META-INF/
META-INF/MANIFEST.MF
pti2018/mrjar/Main.class
META-INF/versions/9/pti2018/mrjar/Main.class
```

#### execute the JAR file with Java 8

```
$ java -jar
sha1: 2EF7BDE608CE5404E97D5F042F95F89F1C232871
```

#### execute the JAR with Java 9

sha3: 32400B5E89822DE254E8D5D94252C52BDCB27A3562CA593E980364D9848B8041B98EABE16C1A6797484941D2376864A1B0E248B0F7AF8B1555A778C336A5BF48
java -jar mrjar-jep238.jar
java --add-modules java.xml.bind -jar mrjar-jep238.jar
#!/bin/sh
