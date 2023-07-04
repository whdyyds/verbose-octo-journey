package com.edu.poly.polyparameter_;

public class Manage extends Employee {
    private double bonus;

    public Manage(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println("调用manage方法");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + getBonus();
    }
}
