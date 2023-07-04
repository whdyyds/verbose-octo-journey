package com.edu.poly.objectpoly_;

public class PolyObject {
    public static void main(String[] args) {
        Animal animal = new Dog("jack");
        Food food = new Bone("骨头");
        Master master = new Master("lily");
        System.out.println(master.feed(animal,food));
        animal = new Cat("tom");
        food = new Fish("鱼");
        System.out.println(master.feed(animal,food));
    }
}
