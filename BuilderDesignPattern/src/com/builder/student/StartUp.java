package com.builder.student;

public class StartUp {

    public static void main(String[] args) {
        Student s = new StudentBuilder().setFirstName("Hassen").setLastName("Ben Slima").getStudent();
        System.out.println(s);
    }
}
