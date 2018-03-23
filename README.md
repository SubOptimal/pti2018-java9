To compile and run the examples use.

 - JDK 9 Java
 - Apache Maven >= 3.5.0 (take the package provided by Apache Maven project)

**note:** If you use the Maven package provided by Debian / Ubuntu, there is currently a packaging issue (the wrong Guice library is bundled) which leads to the error message.

```
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.inject.internal.cglib.core.$ReflectUtils$1 \
   (file:/usr/share/maven/lib/guice.jar) to method \
   java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
```
