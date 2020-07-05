package com.itheima.infor.manager02.controller;

import com.itheima.infor.manager02.domain.Teacher;
import com.itheima.infor.manager02.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    public void start() {
        Scanner sc = new Scanner(System.in);
        teacherLoop:
        while (true) {
            System.out.println("--------欢迎来到 <老师> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    addTeacher();
                    break;
                case "2":
                    deleteTeacherById();
                    break;
                case "3":
                    updateTeacher();
                    break;
                case "4":
                    findAllTeacher();
                    break;
                case "5":
                    System.out.println("感谢您使用老师管理系统, 再见!");
                    break teacherLoop;
                default:
                    System.out.println("您的输入有误, 请重新输入");
                    break;
            }
        }
    }

    public void deleteTeacherById() {
        Scanner sc = new Scanner(System.in);
        TeacherService teacherService = new TeacherService();
        String deleteId;
        while (true) {
            System.out.println("请输入老师id:");
            deleteId = sc.next();
            boolean exists = teacherService.isExists(deleteId);
            if (!exists) {
                System.out.println("id已被占用, 请重新输入:");
            } else {
                break;
            }
        }
        teacherService.deleteTeacherById(deleteId);
        System.out.println("删除成功");
    }

    public void updateTeacher() {
        Scanner sc = new Scanner(System.in);
        TeacherService teacherService = new TeacherService();
        String updateId;
        while (true){
            System.out.println("请输入老师id:");
            updateId = sc.next();
            boolean exists = teacherService.isExists(updateId);
            if (!exists){
                System.out.println("id已被占用, 请重新输入:");
            }else {
                break;
            }
        }
        System.out.println("请输入老师姓名:");
        String name = sc.next();
        System.out.println("请输入老师年龄:");
        String age = sc.next();
        System.out.println("请输入老师生日:");
        String birthday = sc.next();

        Teacher newTeacher= new Teacher(updateId,name,age,birthday);
        teacherService.updateTeacher(updateId,newTeacher);
        System.out.println("修改成功");
    }

    public void findAllTeacher() {
        TeacherService teacherService = new TeacherService();
        Teacher[] teachers = teacherService.findAllTeacher();
        if (teachers==null){
            System.out.println("查无信息, 请添加后重试");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t\t生日");
        for (int i = 0; i < teachers.length; i++) {
            Teacher t = teachers[i];
            if (t != null){
                System.out.println(t.getId() + "\t" + t.getName() + "\t" + t.getAge() + "\t\t" + t.getBirthday());
            }
        }
    }

    public void addTeacher() {
        Scanner sc = new Scanner(System.in);
        TeacherService teacherService = new TeacherService();
        String id;
        while (true){
            System.out.println("请输入老师id:");
            id = sc.next();
            boolean exists = teacherService.isExists(id);
            if (exists){
                System.out.println("id已被占用, 请重新输入:");
            }else {
                break;
            }
        }
        System.out.println("请输入老师姓名:");
        String name = sc.next();
        System.out.println("请输入老师年龄:");
        String age = sc.next();
        System.out.println("请输入老师生日:");
        String birthday = sc.next();

        Teacher t= new Teacher(id,name,age,birthday);
        boolean result = teacherService.addTeacher(t);
        if (result){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }
}
