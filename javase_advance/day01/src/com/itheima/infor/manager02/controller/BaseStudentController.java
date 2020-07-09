package com.itheima.infor.manager02.controller;

import com.itheima.infor.manager02.domain.Student;
import com.itheima.infor.manager02.service.StudentService;

import java.util.Scanner;

public abstract class BaseStudentController {

    private Scanner sc = new Scanner(System.in);
    private StudentService studentService = new StudentService();

    public final void start() {
        //Scanner sc = new Scanner(System.in);
        studentLoop:
        while (true){
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String choice = sc.next();
            switch (choice){
                case "1":
                    //System.out.println("1.添加学生");
                    addStudent();
                    break;
                case "2":
                    //System.out.println("2.删除学生");
                    deleteStudent();
                    break;
                case "3":
                    //System.out.println("3.修改学生");
                    updateStudent();
                    break;
                case "4":
                    //System.out.println("4.查看学生");
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

    //删除学生
    public final void deleteStudent() {
        //Scanner sc = new Scanner(System.in);
        //StudentService studentService = new StudentService();
        //判断id是否存在
        String delId = inputStudentId();
        studentService.deleteStudentById(delId);
        System.out.println("删除成功");
    }

    // 键盘录入学生id
    public final String inputStudentId()  {
        String id;
        while (true){
            System.out.println("请输入学生id:");
            id=sc.next();
            boolean exists=studentService.isExists(id);
            if (!exists){
                System.out.println("您输入的id不存在, 请重新输入:");
            }else {
                break;
            }
        }
        return id;
    }

    //修改学生
    public final void updateStudent() {
        //Scanner sc = new Scanner(System.in);
        //StudentService studentService = new StudentService();
        //判断id是否存在
        String updateId = inputStudentId();
        //录入学生信息,封装为学生对象
        Student newStu = inputStudentInfo(updateId);
        //调用studentService中的updateStudent方法修改学生
        studentService.updateStudent(updateId,newStu);
        System.out.println("修改成功!");
    }

    //查看学生
    public final void findAllStudent() {
        //方法内部创建StudentService业务员对象
        //StudentService studentService = new StudentService();
        //调用业务员对象中的findAllStudent方法,得到学生数组
        Student[] stus = studentService.findAllStudent();
        //判断数组地址是否为null,是的话,提示查无信息
        if (stus==null){
            System.out.println("查无信息");
            return;
        }
        //不为null,遍历数组,打印学生信息
        System.out.println("学号\t姓名\t年龄\t\t生日");
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (student!=null){
                System.out.println(student.getId()+"\t"+student.getName()+"\t"+student.getAge()+"\t\t"+student.getBirthday());
            }
        }
    }

    //添加学生
    public final void addStudent() {
        //键盘录入输入的信息
        Scanner sc = new Scanner(System.in);
        //创建StudentService业务员对象
        StudentService studentService = new StudentService();
        //判断id是否存在
        String id;
        while (true){
            System.out.println("请输入学生id");
            id = sc.next();
            //指派StudentService中的isexists方法判断id是否存在
            boolean flag = studentService.isExists(id);
            //true:存在
            if (flag){
                System.out.println("学号已经被占用,请重新输入:");
            }else {
                break;
            }
        }


        Student stu = inputStudentInfo(id);
        //接收方法的boolean类型返回值
        boolean result = studentService.addStudent(stu);
        if (result){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }

    // 键盘录入学生信息
    public abstract Student inputStudentInfo(String id);
}
