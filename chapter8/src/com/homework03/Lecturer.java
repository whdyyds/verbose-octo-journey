package com.homework03;

public class Lecturer extends Teacher {
    private String level;

    public Lecturer(String name, int age, String post, double salary, String level) {
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
        return super.introduce(t) + getLevel();
    }
}
