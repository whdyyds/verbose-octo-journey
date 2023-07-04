package com.homework13;

public class Student extends Person {
    private String stu_id;

    public Student(String name, String sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public String study(){
        return "我承诺，我会好好学习。";
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }

    public void printInfo(){
        System.out.println("学生的信息：");
        System.out.println("姓名：" + getName() +
                            "\n年龄:" + getAge() +
                            "\n性别:" + getSex() +
                            "\n学号:" + getStu_id() +
                            "\n" + this.study() +
                            "\n" + this.play());
        System.out.println("--------------------------");
    }
}
