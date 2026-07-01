import java.util.*;
import java.util.stream.Collectors;

record Person(String name, int age) {}

public class RecordE {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", 25),
                new Person("Alice", 17),
                new Person("Bob", 30)
        );

        System.out.println("All Persons:");
        people.forEach(System.out::println);

        System.out.println("\nAdults:");

        List<Person> adults = people.stream().filter(p -> p.age() >= 18).collect(Collectors.toList());

        adults.forEach(System.out::println);
    }
}