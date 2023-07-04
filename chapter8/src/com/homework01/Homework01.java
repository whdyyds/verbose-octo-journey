package com.homework01;

public class Homework01 {
    public static void main(String[] args) {
        Person[] p = new Person[3];
        p[0]= new Person("jack",25,"teacher");
        p[1]= new Person("tom",30,"worker");
        p[2]= new Person("smith",28,"doctor");
        Person person;
        for (int i = 0; i < p.length - 1; i++) {
            for (int j = 0; j < p.length - 1 - i; j++) {
                if(p[j].getAge() < p[j + 1].getAge()){
                    person = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = person;
                }
            }
        }
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }
}
