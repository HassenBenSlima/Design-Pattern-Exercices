package com.builder.student;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double mark;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getMark() {
        return mark;
    }

    public Student(String firstName, String lastName, int age, double mark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }
}
