package com.homework04;

public class Manager extends Employee {
    public Manager(String name, double salary, int day) {
        super(name, salary, day);
    }

    @Override
    public double printSal() {
        return super.printSal() * 1.2 + 1000;
    }
}
