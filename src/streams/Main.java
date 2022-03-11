package streams;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Person> people = getPersons();

        // get female persons
        // imperative
        List<Person> female = new ArrayList<>();
        for (Person p: people){
            if(p.gender.equals(Gender.FEMALE))
                female.add(p);
        }
//        female.forEach(System.out::println);

        // filter
        List<Person> femaleStream = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
//        femaleStream.forEach(System.out::println);

        // sort
        List<Person> sortedStream = people.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender).reversed())
                .collect(Collectors.toList());
//        sortedStream.forEach(System.out::println);

        // all match
        boolean allMatchStream = people.stream()
                .allMatch(person -> person.getAge() >= 18);
//        System.out.println(allMatchStream);

        // any match
        boolean anyMatchStream = people.stream()
                .anyMatch(person -> person.getAge() >= 18);
//        System.out.println(anyMatchStream);

        // none match
        boolean nonMatchStream = people.stream()
                .noneMatch(person -> person.getFirstName().contains("Ayoub"));
//        System.out.println(nonMatchStream);

        // max
        Optional<Person> maxStream = people.stream()
                .max(Comparator.comparing(Person::getAge));
//        if (maxStream.isPresent())
//            System.out.println(maxStream.get());

        // min
//        people.stream()
//                .min(Comparator.comparing(streams.Person::getAge))
//                .ifPresent(System.out::println);

        // group - based on gender
        Map<Gender, List<Person>> groupStream = people.stream().collect(Collectors.groupingBy(Person::getGender));
        groupStream.forEach(((gender, people1) -> {
//            System.out.println(gender);
//            people1.forEach(System.out::println);
//            System.out.println();
        }));

        // custom - get every female and grabe firstname of the oldest one
        people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFirstName)
                    .ifPresent(System.out::println);



    }

    public static List<Person> getPersons(){
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("El-kabira", "RHAZALI", 48, "kiba.rh@gmail.com", Gender.FEMALE));
        persons.add(new Person("Abdellatif", "HABACH", 26, "habach@gmail.com", Gender.MALE));
        persons.add(new Person("Abdo", "RHAZALI", 30, "abdo.rh@gmail.com", Gender.MALE));
        persons.add(new Person("Youness", "HABACH", 26, "youness.habach@gmail.com", Gender.MALE));
        persons.add(new Person("Oussama", "HABACH", 22, "oussama.habach@gmail.com", Gender.MALE));
        persons.add(new Person("Walid", "HABACH", 17, "walid.habach@gmail.com", Gender.MALE));
        persons.add(new Person("FatimaZahra", "RHAZALI", 8, "fati.rh@gmail.com", Gender.FEMALE));
        persons.add(new Person("Siham", "ASIFI", 52, "sihamassifi@gmail.com", Gender.FEMALE));
        persons.add(new Person("Asmaa", "MOUSSAFIR", 24, "amoussafir@gmail.com", Gender.FEMALE));
        return persons;
    }
}
