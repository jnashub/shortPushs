package com.saraya.models;

import java.util.List;

public class Owner {
    private int id;
    private static int incId;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String telephone;
    private List<Pet> pets;

    public Owner() {
        System.out.println("pets' incId " + Pet.getIncId());
        Pet.reinitialiseIncId();

        this.modifeId();
    }

    public Owner(String firstName, String lastName, String address, String city, String telephone, List<Pet> pets) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.telephone = telephone;
        this.pets = pets;
        this.modifeId();
        Pet.reinitialiseIncId();
        System.out.println("pets' incId " + Pet.getIncId());
    }

    private void modifeId() {
        this.id = ++incId;
    }

    public static void reduceId() {
        --incId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
