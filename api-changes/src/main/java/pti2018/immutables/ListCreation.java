package pti2018.immutables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

/**
 * The class shows the different ways to create and initialize a <code>List</code> in the different Java version.
 */
public class ListCreation {
    static List<String> beforeJdk8() {
        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        return strings;
    }

    static List<String> inJdk8() {
        return Arrays.asList("one", "two", "three");
    }

    static List<String> inJdk9() {
        return List.of("one", "two", "three");
    }

    public static void main(String[] args) {
        show(beforeJdk8());
        show(inJdk8());
        show(inJdk9());
    }

    static void show(List<String> list) {
        String format = "%10s : %s%n";
        out.printf(format, "elements", list);
    }
}
