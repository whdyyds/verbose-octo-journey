package com.edu.Ove;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("jack",20);
        Student student = new Student("jack",20,"12345678",80);
        System.out.println(person.say());
        System.out.println(student.say());
    }
}
