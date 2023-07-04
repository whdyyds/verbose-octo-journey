package com.edu.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Jackson");
        person.setAge(3000);
        person.setSal(30000);
        System.out.println(person.info());

        Person smith = new Person("Smith", 20, 50000);
        System.out.println("====Smith的信息====");
        System.out.println(smith.info());
    }
}

class Person{
    public String name;
    private int age;
    private double sal;

    public Person() {
    }

    public Person(String name, int age, double sal) {
//        this.name = name;
//        this.age = age;
//        this.sal = sal;
        setName(name);
        setAge(age);
        setSal(sal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 6){
            this.name = name;
        } else{
            System.out.println("输入的名字长度应在2-6个字符，给定默认名字Tom");
            this.name = "Tom";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 1 && age <= 120) {
            this.age = age;
        } else{
            System.out.println("年龄设置不在范围内,给定默认年龄18");
            this.age = 18;
        }

    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String info(){
        return "信息为name=" + name + ",age=" + age + ",sal=" + sal;
    }
}
