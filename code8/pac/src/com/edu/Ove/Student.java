package com.edu.Ove;

public class Student extends Person {
    private String id;
    private double score;

    public Student() {

    }

    public Student(String name, int age, String id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say(){
        return super.say() + "，id为" + id + "，分数为" + score;
    }
}
