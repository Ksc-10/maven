package com.itheima.infor.manager02.controller;

import com.itheima.infor.manager02.domain.Student;

import java.util.Scanner;

public class OtherStudentController extends BaseStudentController{

    private Scanner sc = new Scanner(System.in);

    @Override
    // 键盘录入学生信息
    public Student inputStudentInfo(String id) {
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        String age = sc.next();
        System.out.println("请输入学生生日");
        String birthday = sc.next();

        Student stu = new Student(id, name, age, birthday);
        return stu;
    }
}
