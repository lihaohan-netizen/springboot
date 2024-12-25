package com.example.lhh.dto;

public class StudentDTO {
    private long id;
    private String name;
    private String email;
    private int age;

    public StudentDTO() {
    }

    public StudentDTO(long id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
}
