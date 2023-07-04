package com.edu.poly.re;

import java.util.Objects;

public class Rem {
    public static void main(String[] args) {
        //"hello".equals("abc");
        A a = new A("jack");
        System.out.println(a.equals("jack"));
        System.out.println(a.hashCode());
        System.out.println(a.toString());
    }
}

class A{
    private String name;

    public A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return Objects.equals(name, a.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                '}';
    }
}
