package com.homework05;

public class Waiter extends Employee {
    public Waiter(double sal) {
        super(sal);
    }
    public void printSal(){
        System.out.println("服务员全年工资为" + getSal());
    }
}
