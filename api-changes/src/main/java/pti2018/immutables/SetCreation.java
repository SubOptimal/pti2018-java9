package pti2018.immutables;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.out;

/**
 * The class shows the different ways to create and initialize a <code>Set</code> in the different Java version.
 */
public class SetCreation {
    static Set<String> beforeJdk8() {
        Set<String> strings = new HashSet<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("four");
        return strings;
    }

    static Set<String> inJdk8() {
        return new HashSet<>(Arrays.asList("one", "two", "three", "four"));
    }

    static Set<String> inJdk9() {
        return Set.of("one", "two", "three", "four");
    }

    public static void main(String[] args) {
        show(beforeJdk8());
        show(inJdk8());
        show(inJdk9());
    }

    static void show(Set<String> set) {
        String format = "%10s : %s%n";
        out.printf(format, "elements", set);
        out.println();
    }
}
