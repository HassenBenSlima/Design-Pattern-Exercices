package com.builder.student;

public class StudentBuilder {

    private String firstName;
    private String lastName;
    private int age;
    private double mark;

    public StudentBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public StudentBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;

    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setMark(double mark) {
        this.mark = mark;
        return this;
    }

    //build method
    public Student getStudent() {
        return new Student(firstName, lastName, age, mark);
    }
}
