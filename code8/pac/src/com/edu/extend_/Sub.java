package com.edu.extend_;

public class Sub extends Base{
    public Sub(){
        super("jack",20);
        System.out.println("子类无参构造器被调用");
    }
    public Sub(String name, int age){
        super("name",20);
        System.out.println("子类有参构造器被调用");
    }
}
