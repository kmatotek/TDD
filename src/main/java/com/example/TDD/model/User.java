package com.example.TDD.model;

public class User {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLegal() {
        return age >= 21;
    }

}
