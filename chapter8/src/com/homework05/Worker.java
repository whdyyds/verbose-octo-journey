package com.homework05;

public class Worker extends Employee {
    public Worker(double sal) {
        super(sal);
    }
    public void printSal(){
        System.out.println("工人全年工资为" + getSal());
    }
}
