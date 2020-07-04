package com.itheima.infor.manager.controller;

import com.itheima.infor.manager.domain.Student;
import com.itheima.infor.manager.service.StudentService;

import java.util.Scanner;

public class StudentController {

    private StudentService studentService = new StudentService();

    private Scanner sc = new Scanner(System.in);

    public void start(){
        //Scanner sc = new Scanner(System.in);
        studentLoop:
        while (true){
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String choice =sc.next();
            switch (choice){
                case "1":
                    //开启学生管理系统
                    //System.out.println("1.添加学生" );
                    addStudent();
                    break;
                case "2":
                    //System.out.println("2.删除学生 ");
                    deleteStudentById();
                    break;
                case "3":
                    //System.out.println(" 3.修改学生");
                    updateStudent();
                    break;
                case "4":
                    //System.out.println("4.查看学生 ");
                    findAllStudent();
                    break;
                case "5":
                    System.out.println("感谢您的使用!");
                    break studentLoop;
                default:
                    System.out.println("您的输入有误,请重新输入:");
                    break;

            }

        }

    }

    public void updateStudent() {
        String updateId;
        while (true){
            System.out.println("请输入要修改的学生id:");
            updateId = sc.next();
            boolean exists = studentService.isExists(updateId);
            if (!exists){
                System.out.println("您输入的id不存在,请重新输入:");
            }else {
                break;
            }
        }
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        String age = sc.next();
        System.out.println("请输入学生生日");
        String birthday = sc.next();

        Student newStu = new Student(updateId,name,age,birthday);
        /*
        Student newStu = new Student();
        newStu.setId(updateId);
        newStu.setName(name);
        newStu.setAge(age);
        newStu.setBirthday(birthday);
        */
        studentService.updateStudent(updateId,newStu);
        System.out.println("修改成功!");
    }

    //删除学生
    public void deleteStudentById() {
        String delId;
        while (true){
            System.out.println("请输入要删除的学生id:");
            delId = sc.next();
            boolean exists = studentService.isExists(delId);
            if (!exists){
                System.out.println("您输入的id不存在,请重新输入:");
            }else {
                break;
            }
        }
        //调用业务员中的deleteStudentById根据id,删除学生
        studentService.deleteStudentById(delId);
        /* 提示删除成功 */
        System.out.println("删除成功");
    }

    public void findAllStudent() {
        //StudentService studentService = new StudentService();
        Student[] stus = studentService.findAllStudent();
        if (stus == null){
            System.out.println("查无信息,请添加后重试");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t\t生日");
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if (stu != null){
                System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t\t"+stu.getBirthday());
            }
        }
    }

    public void addStudent() {
        StudentService studentService = new StudentService();
        Scanner sc = new Scanner(System.in);
        //学号是否存在的验证,不存在才可以添加
        String id;
        while (true){
            System.out.println("请输入学生id");
            id = sc.next();
            boolean flag = studentService.isExists(id);
            if (flag){
                System.out.println("学号已经被占用,请重新输入:");
            }else {
                break;
            }
        }

        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        String age = sc.next();
        System.out.println("请输入学生生日");
        String birthday = sc.next();

        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);
        stu.setBirthday(birthday);


        boolean result = studentService.addStudent(stu);
        if(result){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }
}
