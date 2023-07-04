package com.homework03;

public class Vice extends Teacher {
    private String level;

    public Vice(String name, int age, String post, double salary, String level) {
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
