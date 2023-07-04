package com.edu.poly.polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person("jack", 20);
        person[1] = new Student("jack", 18, 100);
        person[2] = new Student("smith", 19, 30);
        person[3] = new Teacher("scott", 30, 10000);
        person[4] = new Teacher("kim", 50, 20000);
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].say());
            if(person[i] instanceof Student){
                Student student = (Student)person[i];
                student.study();
            } else if(person[i] instanceof Teacher){
                Teacher teacher = (Teacher)person[i];
                teacher.teach();
            } else if(person[i] instanceof Person){

            } else{
                System.out.println("输入有误");
            }
        }
    }
}
