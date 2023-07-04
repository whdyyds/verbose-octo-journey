package com.homework05;

public class Homework05 {
    public static void main(String[] args) {
        Worker worker = new Worker(4000);
        Peasant peasant = new Peasant(5000);
        Waiter waiter = new Waiter(4000);
        Teacher teacher = new Teacher(6000,20,60);
        Scientist scientist = new Scientist(10000,4000);
        worker.printSal();
        peasant.printSal();
        waiter.printSal();
        teacher.printSal();
        scientist.printSal();
    }
}
