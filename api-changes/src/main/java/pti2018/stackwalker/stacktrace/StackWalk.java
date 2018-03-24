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
 * from the stacktrace only that many lines processed as needed to fulfil the filter()
 * and limit() conditions
 */
public class StackWalk {
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
            StackWalker walker = StackWalker.getInstance();

            // drop from top of the stream all lines which do not start with 'pti2018'
            walker.walk(st -> st.dropWhile(f -> !f.getClassName().startsWith("pti2018"))
                    .limit(2)
                    .collect(Collectors.toList())
            ).forEach(System.out::println);

            strings = Collections.EMPTY_LIST;
        }
        System.out.println("strings = " + strings);
    }
}

