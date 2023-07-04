package com.homework05;

public class Peasant extends Employee {
    public Peasant(double sal) {
        super(sal);
    }
    public void printSal(){
        System.out.println("农民全年工资为" + getSal());
    }
}
