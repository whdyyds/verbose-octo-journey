package com.homework04;

public class Homework04 {
    public static void main(String[] args) {
        Manager manager = new Manager("Tom",500,30);
        Worker worker = new Worker("Jack",100,30);
        System.out.println("普通员工" + worker.getName() + "的工资为" + worker.printSal());
        System.out.println("部门经理" + manager.getName() + "的工资为" + manager.printSal());
    }
}
