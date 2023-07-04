package com.homework05;

public class Scientist extends Employee {
    private double bonus;

    public Scientist(double sal, double bonus) {
        super(sal);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void printSal(){
        System.out.println("科学家全年工资为" + (getBonus() + getSal()));
    }
}
