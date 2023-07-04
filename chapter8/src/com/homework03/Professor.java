package com.homework03;

public class Professor extends Teacher {
    private String level;

    public Professor(String name, int age, String post, double salary, String level) {
        super(name, age, post, salary);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String introduce(Teacher t) {
        return super.introduce(t) + ",工资级别为" + getLevel();
    }
}
