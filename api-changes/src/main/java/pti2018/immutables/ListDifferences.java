package pti2018.immutables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.System.out;

public class ListDifferences {
    static List<String> collectionsUnmodifiableList(List<String> modifiableList) {
        return Collections.unmodifiableList(modifiableList);
    }

    static List<String> arraysAsList(String[] array) {
        return Arrays.asList(array);
    }

    static List<String> listOf(String[] array) {
        return List.of(array);
    }

    public static void main(String[] args) {
        List<String> modifiableList = getList();
        List<String> unmodifiableList = collectionsUnmodifiableList(modifiableList);
        show("initial unmodifiableList", unmodifiableList);

        /*
        as the unmodifiable list is only a wrapper around a modifiable list,
        all changes on the wrapped list are visible through the unmodifiable list
         */
        modifiableList.set(0, "111");
        show("wrapped list changed", modifiableList);
        show("unmodifiableList", unmodifiableList);
        out.println();

        String[] array1 = getArray();
        show("initial Arrays.asList", arraysAsList(array1));
        array1[0] = "222";
        show("wrapped array changed", arraysAsList(array1));
        show("Arrays.asList", arraysAsList(array1));
        out.println();

        String[] array2 = getArray();
        show("initial List.of", listOf(array2));
        array2[0] = "333";
        show("wrapped array changed", listOf(array2));
        show("List.of", listOf(array2));
    }

    static String[] getArray() {
        return new String[]{"one", "two", "three"};
    }
    static List<String> getList() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        return list;
    }

    static void show(String what, List<String> list) {
        String format = "%24s : %s%n";
        out.printf(format, what, list);
    }
}
