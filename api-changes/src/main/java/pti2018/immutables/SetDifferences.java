package pti2018.immutables;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.out;

public class SetDifferences {
    /**
     * the iteration order is always the same, when the set contains the same entries
     */
    static Set<String> collectionsUnmodifiableSet() {
        Set<String> modifiableSet = new HashSet<>();
        modifiableSet.add("one");
        modifiableSet.add("two");
        modifiableSet.add("three");
        modifiableSet.add("four");
        return Collections.unmodifiableSet(modifiableSet);
    }

    /**
     * the iteration order of the set entries is intentionally randomized
     */
    static Set<String> setOf() {
        return Set.of("one", "two", "three", "four");
    }

    public static void main(String[] args) {
        show(collectionsUnmodifiableSet());
        show(setOf());
    }

    static void show(Set<String> set) {
        String format = "%10s : %s%n";
        out.printf(format, "set class", set.getClass());
        out.printf(format, "elements", set);
        out.println();
    }
}
