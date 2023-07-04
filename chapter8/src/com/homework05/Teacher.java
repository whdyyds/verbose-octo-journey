package com.homework05;

public class Teacher extends Employee {
    private int classDay;
    private double classSal;

    public Teacher(double sal, int classDay, double classSal) {
        super(sal);
        this.classDay = classDay;
        this.classSal = classSal;
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    public void printSal(){
        System.out.println("教师全年工资为" + (getSal() + getClassDay() * getClassSal()));
    }
}
