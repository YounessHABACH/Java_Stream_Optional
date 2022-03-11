package optional.advanced;

import java.util.Locale;
import java.util.Optional;

class Optional_Advanced2 {
    public static void main(String[] args) {
        Person person = new Person("James", "JAMESEMAIL@GMAIL.coM");
        System.out.println(person.getEmail().map(String::toLowerCase).orElse("email Not Provided"));

        Person person2 = new Person("Jones", null);
        System.out.println(person2.getEmail().map(String::toLowerCase).orElse("email Not Provided"));

        Person person3 = new Person("Susan", "Susan@yahoo.fr");
        if(person3.getEmail().isPresent()){
            System.out.println(person3.getEmail().get());
        } else {
            System.out.println("Email not provided");
        }
    }
}