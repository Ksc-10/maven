package com.itheima.test04;

public class Student extends Teacher{
    public String name;
    public int age;

    public Student() {
        //super();
    }

    public Student(String birthday,String name, int age) {
        super(birthday);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
