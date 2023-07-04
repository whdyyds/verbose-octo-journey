package com.edu.poly.polyparameter_;

public class Test {

    public double showEmpAnnal(Employee e){
        return e.getAnnual();
    }

    public void testWork(Employee e){
        if(e instanceof PublicEmployee){
            ((PublicEmployee) e).work();
        } else if(e instanceof Manage){
            ((Manage) e).manage();
        } else if(e instanceof Employee){

        } else{
            System.out.println("输入有误");
        }
    }
}
