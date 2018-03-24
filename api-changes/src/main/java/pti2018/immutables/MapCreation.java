package pti2018.immutables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.lang.System.out;
import static java.util.Map.entry;

/**
 * The class shows the different ways to create and initialize a <code>Map</code> in the different Java version.
 */
public class MapCreation {
    static Map<String, Integer> beforeJdk9() {
        Map<String, Integer> strings = new HashMap<>();
        strings.put("one", 1);
        strings.put("two", 2);
        strings.put("three", 3);
        strings.put("four", 4);
        return strings;
    }

    /**
     * create with key/value pairs, for a maximum of ten value pairs
     */
    static Map<String, Integer> inJdk9KeyValues() {
        return Map.of(
                "one", 1,
                "two", 2,
                "three", 3,
                "four", 4
        );
    }

    /**
     * for more then ten key/value pairs only this method can be used
     */
    static Map<String, Integer> inJdk9MapOfEntries() {
        return Map.ofEntries(
                entry("one", 1),
                entry("two", 2),
                entry("three", 3),
                entry("tour", 4)
        );
    }

    public static void main(String[] args) {
        show(beforeJdk9());
        show(inJdk9KeyValues());
        show(inJdk9MapOfEntries());
    }

    static void show(Map<String, Integer> map) {
        String format = "%10s : %s%n";
        out.printf(format, "elements", map);
    }
}
