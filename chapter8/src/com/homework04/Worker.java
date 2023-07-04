package com.homework04;

public class Worker extends Employee {
    public Worker(String name, double salary, int day) {
        super(name, salary, day);
    }

    @Override
    public double printSal() {
        return super.printSal() * 1.0;
    }
}
