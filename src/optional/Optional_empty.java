package optional;

import java.util.Optional;

class Optional_empty {
    public static void main(String[] args) {
        System.out.println("EMPTY");
        System.out.println("-----");
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional.isPresent());
        System.out.println(emptyOptional.isEmpty());
    }
}
