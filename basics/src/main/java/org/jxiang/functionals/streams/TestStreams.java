package org.jxiang.functionals.streams;

import java.util.*;
import java.util.stream.Collectors;

public class TestStreams {
    public static void main(String[] args) {
        List<Person> people = getPeople();

        // Imperative approach
        List<Person> imperativeFemales = new ArrayList<>();
        for (Person p: people) {
            if (p.getGender().equals(Gender.FEMALE))
                imperativeFemales.add(p);
        }
        imperativeFemales.forEach(System.out::println);


        // Filter
        System.out.println("FILTER #########################################################");
        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
        females.forEach(System.out::println);

        // Sort
        System.out.println("SORT #########################################################");
        List<Person> sortedPeople = people.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender).reversed())
                .collect(Collectors.toList());
        sortedPeople.forEach(System.out::println);

        // All match
        System.out.println("ALL MATCH #########################################################");
        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 5);
        System.out.println(allMatch);

        // Any match
        System.out.println("ANY MATCH #########################################################");
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() > 100);
        System.out.println(anyMatch);

        // None match
        System.out.println("NONE MATCH #########################################################");
        boolean noMatch = people.stream()
                .noneMatch(person -> person.getName().equals("Anna Cook"));
        System.out.println(noMatch);

        // Max/Min
        System.out.println("MAX MIN #########################################################");
        Optional<Person> maxAgedOne = people.stream()
                .max(Comparator.comparing(Person::getAge));
        System.out.println(maxAgedOne);

        // Group -> A map with key to be gender and value to be people
        System.out.println("GROUP #########################################################");
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));
        groupByGender.forEach(((gender, groupMembers) -> {
            System.out.println(gender);
            groupMembers.forEach(System.out::println);
        }));

        //Return the oldest female's first name
        System.out.println("EXAMPLE #########################################################");
        Optional<String> oldestFemaleName = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);
        oldestFemaleName.ifPresent(System.out::println);

    }

    private static List<Person> getPeople() {
        return Arrays.asList(
                new Person("James Bond",20, Gender.MALE),
                new Person("Alina Smith",33, Gender.FEMALE),
                new Person("Helen White",57, Gender.FEMALE),
                new Person("Alex Boz",14, Gender.MALE),
                new Person("Jamie Goa",99, Gender.MALE),
                new Person("Anna Cook",7, Gender.FEMALE),
                new Person("Zelda Brown",120, Gender.FEMALE)
        );
    }
}
