package com.edu.poly.polyparameter_;

public class PolyParameter {
    public static void main(String[] args) {
        Employee[] emp = new Employee[3];
        emp[0] = new Employee("jack", 6000);
        emp[1] = new PublicEmployee("tom", 8000);
        emp[2] = new Manage("scott", 10000, 5000);
        for (int i = 0; i < emp.length; i++) {
            Test test = new Test();
            System.out.println(emp[i].getName() + "\t" + test.showEmpAnnal(emp[i]));
            test.testWork(emp[i]);
        }
    }

}
