package com.edu.poly.objectpoly_;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String feed(Animal animal, Food food){
        return "主人" + name + "喂了" + animal.getName() + "一些" + food.getName();
    }
}
