package com.edu.poly.polyarr_;

public class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say(){
        return super.say() + "\t" + score;
    }

    public void study(){
        System.out.println(this.getName() + "正在学习");
    }
}
