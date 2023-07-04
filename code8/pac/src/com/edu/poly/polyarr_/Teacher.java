package com.edu.poly.polyarr_;

public class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String say(){
        return super.say() + "\t" + salary;
    }

    public void teach(){
        System.out.println(this.getName() + "正在授课");
    }
}
