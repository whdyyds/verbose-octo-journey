package com.homework13;

public class Homework13 {
    public static void main(String[] args) {
        Person[] p = new Person[4];
        p[0] = new Student("小明","男",15,"00023102");
        p[1] = new Student("小美","女",16,"00023103");
        p[2] = new Teacher("张飞","男",40,15);
        p[3] = new Teacher("刘备","男",45,20);
        Person person = null;
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
            p[i].printInfo();
        }
    }
}
