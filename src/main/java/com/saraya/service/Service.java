package com.saraya.service;

import com.saraya.models.Owner;
import com.saraya.models.Pet;
import com.saraya.models.Vet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Service {

    private static List<Owner> owners = new ArrayList<Owner>(Arrays.asList(
            new Owner("Jina", "Zey", "PA", "Dakar", "+221",
                    new ArrayList<Pet>(Arrays.asList(new Pet("Boby", new Date("10/10/2010"), "Dog"),
                            new Pet("Boby", new Date("01/20/2010"), "Dog")))),
            new Owner("Michael", "Rostov", "Mosco", "Russia", "+24",
                    new ArrayList<Pet>(Arrays.asList(new Pet("Riky", new Date("10/03/2000"), "Dog"),
                            new Pet("sss", new Date("12/10/2004"), "Dog")))),
            new Owner("Ahmed", "Shakhour", "Nouakchott", "Mauritanie", "+223",
                    new ArrayList<Pet>(Arrays.asList(new Pet("Minou", new Date("12/3/2006"), "cat"),
                            new Pet("Lika", new Date("11/05/2020"), "Dog"))))));

    private static List<Vet> vets = new ArrayList<>(Arrays.asList(
            new Vet("James", "Carter", "none"),
            new Vet("Linda", "Douglas", "dentistry surgery"),
            new Vet("Sharon", "Jenkins", "none"),
            new Vet("Helen", "Leary", "radiology"),
            new Vet("Rafael", "Ortega", "surgery"),
            new Vet("Henry", "Stevens", "radiology")
    ));

    private static List<String> types = new ArrayList<>(Arrays.asList("bird", "cat", "dog", "hamster", "lizard"));

    public static List<String> getTypes() {
        return types;
    }

    public static List<Vet> getVets() {
        return vets;
    }

    public static List<Owner> getOwners() {
        return owners;
    }

    public static boolean authentifie(String userName, String password) {
        return userName.equals("Jonny") && password.equals("1");
    }

}
