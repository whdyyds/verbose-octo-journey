package com.homework03;

public class Homework03 {
    public static void main(String[] args) {
        Teacher teacher = new Professor("Scott",40,"教授",20000,"1.3");
        System.out.println(teacher.introduce(teacher));
    }
}
