package pti2018.streams;

import java.util.Optional;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        // drop from the top of the stream all lines as long the predicate is 'true'
        IntStream.range(1, 10)
                .dropWhile(x -> x < 5)
                .forEach(System.out::println);

        // take from the top of the stream all lines as long the predicate is 'true'
        IntStream.range(1, 10)
                .takeWhile(x -> x < 5)
                .forEach(System.out::println);

        // return the same values in the stream as following for-loop
        // for (int index=seed; hasNext.test(index); index = next.applyAsInt(index)) {
        IntStream.iterate(0, x -> x < 5, x1 -> x1 + 1).forEach(System.out::println);

        // we now can define a Runnable which should be executed for the case where
        // an Optional is present or empty
        System.out.println("--- not empty Optional");
        Optional notEmptyOptional = Optional.of("pti2018");
        notEmptyOptional.ifPresentOrElse(x -> System.out.printf("not empty: %s%n", x),
                () -> System.out.println("empty"));

        System.out.println("--- empty Optional");
        Optional emptyOptional = Optional.empty();
        emptyOptional.ifPresentOrElse(x -> System.out.println(x),
                () -> System.out.println("empty"));
    }
}
