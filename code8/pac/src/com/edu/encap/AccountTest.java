package com.edu.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("Jack", 15, "87654321");
        System.out.println(account.info());

    }
}

class Account{
    private String name;
    private double acc;
    private String key;

    public Account() {
    }

    public Account(String name, double acc, String key) {
        setName(name);
        setAcc(acc);
        setKey(key);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() == 2 || name.length() == 3 || name.length() == 4) {
            this.name = name;
        } else{
            System.out.println("输入的姓名长度不在范围内，给定默认值匿名");
            this.name = "匿名";
        }
    }

    public double getAcc() {
        return acc;
    }

    public void setAcc(double acc) {
        if(acc > 20) {
            this.acc = acc;
        } else{
            System.out.println("余额必须大于20，给定默认值1000");
            this.acc = 1000;
        }
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        if(key.length() == 6) {
            this.key = key;
        } else{
            System.out.println("密码长度须为6位，给定默认密码123456");
            this.key = "123456";
        }
    }

    public String info(){
        return "信息为：name=" + name + "\t余额为" + acc + "\t密码为" + key;
    }
}
