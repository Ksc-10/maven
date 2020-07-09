package com.itheima.test02;

public class Student extends Person{

    public String age;

    public  Student(){
        System.out.println("子类 空构造");
    }
    public void eat(){
        System.out.println("student,eat");
    }

    public void show(){
        this.eat();
        super.eat();
    }

    public void s(){
        super.eat();
        System.out.println("student.e");
    }
}
