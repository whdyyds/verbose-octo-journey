package com.homework06;

public class Homework06 {
    public static void main(String[] args) {
        
    }
}
class Grand{
    String name = "AA";
    private int age = 100;
    public void g1(){

    }
}
class Father extends Grand{
    String id = "001";
    private double score;
    public void f1(){

    }
    //super可以访问：super.name;super.g1();
    //this可以访问：this.id;this.score;this.f1();this.name;this.g1();
}
class Son extends Father{
    String name = "BB";
    public void g1(){

    }
    private void show(){

    }
    //super可以访问：super.id;super.f1();super.name;super.g1();
    //this可以访问：this.name;this.g1();this.show();this.id;this.f1()
}

