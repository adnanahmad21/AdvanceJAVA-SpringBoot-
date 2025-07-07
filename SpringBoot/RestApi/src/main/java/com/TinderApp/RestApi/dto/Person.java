package com.TinderApp.RestApi.dto;

public class Person {
    private String name;
    private int age;
    private String city;
    private String gender;
    private String education;

    public Person() {
    }

    public Person(String name, int age, String city, String gender, String education) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.gender = gender;
        this.education = education;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
