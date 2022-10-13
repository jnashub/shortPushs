package com.saraya.models;

import java.util.Date;
import java.util.List;

public class Pet {
    private int id;
    private static int incId;
    private String name;
    private Date dateOfBirth;
    private String petType;
    private List<Visit> visits;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }

    public void generateId() {
        this.id = ++incId;
    }

    public static void reinitialiseIncId() {
        Pet.incId = 0;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static void setIncId() {
        --incId;
    }

    public static int getIncId() {
        return incId;
    }

    public Pet(String name, Date dateOfBirth, String petType) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.petType = petType;
        this.generateId();
    }

    public Pet() {
        this.generateId();
    }
}
