package com.itheima.test01;

public class Zi extends Fu{
    int age=10;

    public void show(){

        int age=20;

        System.out.println(age);//20

        System.out.println(this.age);//10

        System.out.println(super.age);//30
    }
}
