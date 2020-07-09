package com.itheima.test04;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("15","18",19);
        String b = student.getBirthday();
        String n = student.getName();
        int a = student.getAge();
        System.out.println(n+a+b);
    }
}
