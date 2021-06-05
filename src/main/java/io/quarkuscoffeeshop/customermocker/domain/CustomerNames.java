package io.quarkuscoffeeshop.customermocker.domain;

import com.github.javafaker.Faker;

import java.util.*;
import java.util.stream.Collectors;

public class CustomerNames {

    static Faker faker = new Faker();

    static final List<String> names = Arrays.asList(
            "Chidambaram",
            "Larsson",
            "Premkumar",
            "Jaganaathan",
            "Fokou",
            "Paul",
            "Regas",
            "Doshi",
            "Maddali",
            "Sangem",
            "Sangem",
            "Mateti",
            "Bergh",
            "Sinha",
            "Sahu",
            "Bhatt",
            "Birkenberger",
            "Burrell",
            "Calingasan",
            "Chai",
            "Durning",
            "Gaitan",
            "Hortelano",
            "Khanna",
            "Latif",
            "Neece",
            "Nunez",
            "Patan",
            "Tekle",
            "Tucker",
            "Wang",
            "Esclamado",
            "Jennings",
            "Gomez",
            "Seth",
            "Babaoglu",
            "Kudumuri",
            "Brown",
            "NEERUKONDA",
            "Patil",
            "Randell",
            "Agnihotri",
            "Lamtahri",
            "Sandlin",
            "Norman",
            "Addison",
            "DesPres",
            "Morris",
            "IStefan",
            "Prasanth",
            "Raghu",
            "Etienne",
            "Avik",
            "Valarie",
            "Smita",
            "Ram",
            "Omkaram",
            "Omkaram",
            "Vivek",
            "Vijay",
            "Chip",
            "Prasoon",
            "Indrajeet",
            "Nirmal",
            "Lisa",
            "Kelvina",
            "Carlo",
            "Mario",
            "Marilyn",
            "Freddy",
            "Arvin",
            "Rajesh",
            "Alex",
            "Ned",
            "Jose",
            "Jilani",
            "Henok",
            "Hilda",
            "Steve",
            "Edgar",
            "Michele",
            "Anthony",
            "Gaurav",
            "Seza",
            "Partha",
            "Steve",
            "VEERA",
            "Shivraj",
            "Kelvin",
            "Sachin",
            "Mohammed",
            "Chris",
            "David",
            "Martin",
            "Lawrence",
            "Drewry",
            "Venugopal");

    public static List<String> randomNames(int desiredNumberOfNames) {

        if (desiredNumberOfNames > names.size()) {
            throw new RuntimeException("try a smaller number");
        }


        return new Random()
                .ints(desiredNumberOfNames, 0, names.size())
                .mapToObj(i -> faker.name().firstName())
                .collect(Collectors.toList());
    }

    public static String randomName() {

        Collections.shuffle(names);
        Random rand = new Random();

        return names.get(rand.nextInt(names.size()));
    }


}
