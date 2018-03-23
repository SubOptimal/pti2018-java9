package pti2018;

import static java.lang.System.getProperty;
import static java.lang.System.out;

public class JavaVersion {
    public static void main(String... args) {
        String[] propNames = {
                "java.class.version",
                "java.runtime.version",
                "java.specification.version",
                "java.version",
				"java.vendor.version",
                "java.vm.specification.version",
                "java.vm.version"
        };
        for (String propName : propNames) {
            out.printf("%29s = %s\n", propName, getProperty(propName));
        }
    }
}

