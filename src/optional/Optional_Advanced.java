package optional;

import java.util.Locale;
import java.util.Optional;

class Optional_Advanced {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);
        String extension = optional
                .map(String::toUpperCase)
                .orElseGet(()->{
                    /// .... extra compo
                    String returnedValue = "World";
                    for (int i = 0; i < 6; i++) {
                        returnedValue += i;
                    }
                    return returnedValue.toUpperCase(Locale.ROOT);
                });
        System.out.println("EXTENSION : " + extension);
        // orelse throw
//        extension = optional
//                .map(String::toUpperCase)
//                .orElseThrow(()-> new IllegalStateException("Exception"));
//        System.out.println(extension);
        // if present
        System.out.print("IFPRESENT : ");
        optional.ifPresent(System.out::print);
        // if present
        System.out.print("\nIFPRESENTORELSE : ");
        optional.ifPresentOrElse(System.out::println, ()-> System.out.println("World"));
    }
}