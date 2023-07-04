package com.edu.extend_;

public class ExtendTheory {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.name);
        System.out.println(son.age);

    }
}

class Grandpa{
    String name = "爷爷";
    int age = 70;
}
class Father extends Grandpa{
    String name = "爸爸";
    //private int age = 45;
}
class Son extends Father{
    String name = "儿子";
}
