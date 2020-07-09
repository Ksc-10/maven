package com.itheima.test;

public class TestClass {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name="张三";
        teacher.teacherYear=18;
        //调用继承的父类方法
        teacher.show();
        //调用自己的方法
        teacher.teach();

        Student student = new Student();
        student.name="李四";
        student.className="java";
        student.doHomeWork();
        student.show();
    }
}
