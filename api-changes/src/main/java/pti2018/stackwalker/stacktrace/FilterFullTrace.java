package pti2018.stackwalker.stacktrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * example which prints from the stacktrace the two first lines in our package (pti2018),
 * skipping all lines which are in the runtime implementation classes
 *
 * the complete stacktrace needs to be returned, even only few lines from the top are needed
 */
public class FilterFullTrace {
    public static void main(String[] args) {
        methodOne();
    }

    static void methodOne() {
        methodTwo();
    }

    static void methodTwo() {
        methodThree();
    }

    static void methodThree() {
        List<String> strings;
        try {
            strings = Files.readAllLines(Paths.get("/tmp/file-does-not-exist"));
        } catch (IOException e) {
            strings = Collections.EMPTY_LIST;
            // the whole stacktrace needs to be returned first
            StackTraceElement[] stackTrace = e.getStackTrace();
            Arrays.stream(stackTrace)
                    .filter(st -> st.getClassName().startsWith("pti2018"))
                    .limit(2)
                    .forEach(System.out::println);
        }
        System.out.println("strings = " + strings);
    }
}

