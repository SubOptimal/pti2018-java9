1. [01-simple-module](#simple-module)
1. [02-module-dependency](#module-with-dependency)
1. [03-jre-image-simple](#simple-java-runtime-image)
1. [04-jre-image-compressed](#java-runtime-image-compressed)
1. [05-jre-image-compressed-stripped](#java-runtime-image-compressed-and-debug-removed)
1. [06-jre-image-with-launcher](#java-runtime-image-with-application-launcher)
1. [07-jre-image-packaged](#self-contained-application-bundle)

***

#### simple module

Create a simple Java module JAR with no dependencies.

***

#### module with dependency

Create a simple Java module JAR with dependency to another module.

***

#### simple Java runtime image

Create a Java runtime image which contains only the classes needed to run the example application.

size of the output directory: 45 MB

***

#### Java runtime image compressed

Create a Java runtime image which contains only the classes needed to run the example application. The module resources are compressed.

size of the output directory: 33 MB

***

#### Java runtime image compressed and stripped

Create a Java runtime image which contains only the classes needed to run the example application. The module resources are compressed, with debug information removed, man files and native header files excluded.

size of the output directory: 31 MB

***

#### Java runtime image with application launcher

Create a Java runtime image which contains only the classes needed to run the example application. Same as before with an application launcher script added.

size of the output directory: 31 MB

***

#### self-contained application bundle

Example how to create a Debian package for a self-containing Java application, which includes the JRE runtime image.

size of the output deb file: 16 MB

The `javapackager` can create application bundle types:

 - Windows: installer, image, exe, msi
 - MacOS: dmg, pkg
 - Linux: rpm, deb
