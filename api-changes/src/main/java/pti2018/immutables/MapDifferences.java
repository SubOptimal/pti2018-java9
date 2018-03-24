package pti2018.immutables;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;
import static java.util.Map.entry;

public class MapDifferences {
    /**
     * the iteration order is always the same, when the map contains the same entries
     */
    static Map<String, Integer> beforeJdk9() {
        Map<String, Integer> modifiableMap = new HashMap<>();
        modifiableMap.put("one", 1);
        modifiableMap.put("two", 2);
        modifiableMap.put("three", 3);
        modifiableMap.put("four", 4);
        return Collections.unmodifiableMap(modifiableMap);
    }

    /**
     * the iteration order of the map entries is intentionally randomized
     */
    static Map<String, Integer> inJdk9KeyValues() {
        return Map.of("one", 1, "two", 2, "three", 3, "four", 4);
    }

    public static void main(String[] args) {
        show(beforeJdk9());
        show(inJdk9KeyValues());
    }

    static void show(Map<String, Integer> map) {
        String format = "%10s : %s%n";
        out.printf(format, "map class", map.getClass());
        out.printf(format, "elements", map);
        out.println();
    }
}
