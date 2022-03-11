package optional;

import java.util.Optional;

class Optional_optionalOrElse {
    public static void main(String[] args) {
        System.out.println("\nOPTIONAL OF OTHER OPTIONAL WITH OR ELSE\n");
        Optional<String> optional = Optional.of("Hello");
        System.out.println(optional);
        System.out.println(optional.isPresent());
        System.out.println(optional.isEmpty());

        System.out.println("\nEXTENSION\n");
        String extension = optional.orElse("World");
        System.out.println(extension);
        System.out.println(optional.isPresent());
        System.out.println(optional.isEmpty());
    }
}
