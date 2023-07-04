package com.homework11;

public class Homework11 {
    public static void main(String[] args) {
        //向上转型：父类引用指向子类对象
        Person p = new Student();
        p.run();//student run
        p.eat();//person eat
        //向下转型:把指向子类对象的父类引用，转成指向子类对象的子类引用
        Student s = (Student)p;
        s.run();//student run
        s.study();//student study
        s.eat();//person eat
    }
}
