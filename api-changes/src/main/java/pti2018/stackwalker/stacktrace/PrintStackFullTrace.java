package pti2018.stackwalker.stacktrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * example which prints the whole stacktrace in case of an exception
 *
 * the complete stacktrace will be printed, independent from which line would contain
 * useful information for us
 */
public class PrintStackFullTrace {
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
            // prints the whole stacktrace
            e.printStackTrace(System.out);
            strings = Collections.EMPTY_LIST;
        }
        System.out.println("strings = " + strings);
    }
}

