package streams2;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringStreamMain {
    public static void main(String[] args) {
        System.out.println(
            Stream
                .of("Val4", "Val2", "Val1", "Val3")
                .sorted()
                .collect(Collectors.joining(", "))
        );

        Stream
            .of("Val4", "Val2", "Val1", "Val3")
            .sorted()
            .findFirst()
            .ifPresentOrElse(
                    System.out::println,
                    () -> System.out.println("Nope")
            );
    }
}
