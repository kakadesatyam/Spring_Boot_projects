package com.example.Connecting_Spring_boot_with_mysql;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Persons")  // Optionally, specify table name
public class Persons {
    @Id
    private int roll;
    private String name;
    private int age;
    private String address;

    public Persons() {
    }

    public Persons(int roll, String name, int age, String address) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
