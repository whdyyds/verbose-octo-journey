package com.edu.poly.polyparameter_;

public class PublicEmployee extends Employee{
    public PublicEmployee(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("调用work方法");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
