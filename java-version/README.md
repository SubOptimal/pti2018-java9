Java version numbering is changed to reflect the new time based release cycle.
Whereas Java 9 is special as it is an intermediate solution.

execute with different Java versions

```
$ # change the Java version to be used
$ mvn compile
$ java -cp target/classes pti2018.JavaVersion
```

till Java 8

```
           java.class.version = 52.0
         java.runtime.version = 1.8.0_162-b12
   java.specification.version = 1.8
                 java.version = 1.8.0_162
          java.vendor.version = null
java.vm.specification.version = 1.8
              java.vm.version = 25.162-b12
```

Java 9

```
           java.class.version = 53.0
         java.runtime.version = 9.0.4+11
   java.specification.version = 9
                 java.version = 9.0.4
          java.vendor.version = null
java.vm.specification.version = 9
              java.vm.version = 9.0.4+11
              ```

from Java 10 on

```
           java.class.version = 54.0
         java.runtime.version = 10+46
   java.specification.version = 10
                 java.version = 10
          java.vendor.version = 18.3
java.vm.specification.version = 10
              java.vm.version = 10+46
              ```
