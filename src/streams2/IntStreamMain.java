package streams2;

import java.util.stream.IntStream;

public class IntStreamMain {
    public static void main(String[] args) {
        IntStream
                .range(0, 20)
                .skip(7)
                .forEach(System.out::print);
//                .forEach(integer -> System.out.print(integer));
        System.out.println();
        System.out.println(
            IntStream
                    .range(0, 20)
                    .count()
        );
        System.out.println(
            IntStream
                    .range(0, 20)
                    .sum()
        );
    }
}
