package com.itheima.infor.manager02.dao;

import com.itheima.infor.manager02.domain.Student;

import java.util.ArrayList;

public class OtherStudentDao implements BaseStudentDao{
    //创建Student学生数组长度为5
    private static ArrayList<Student> stud = new ArrayList<>();

    static {
        Student stu1 = new Student("heima001","张三","23","1999-11-11");
        Student stu2 = new Student("heima002","李四","25","2000-11-11");

        stud.add(stu1);
        stud.add(stu2);
    }
    //将接受到的学生对象添加到数组中
    public boolean addStudent(Student stu) {

            stud.add(stu);
            return true;
        }


    public Student[] findAllStudent() {

    Student[] students = new Student[stud.size()];

        for (int i = 0; i < students.length; i++) {
            students[i]=stud.get(i);
        }
        //将学生数组返回
        return students;
    }

    public void updateStudent(String updateId, Student newStu) {
        /*
        1.查找学生id,在数组中所在的索引位置
        2.将该索引位置的学生对象使用新的学生对象替换
        */
        int index = getIndex(updateId);
        stud.set(index,newStu);
    }

    //获取索引
    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < stud.size(); i++) {
            Student stu = stud.get(i);
            if (stu!=null && stu.getId().equals(id)){
                index=i;
                break;
            }
        }
        return index;
    }

    public void deleteStudentById(String deleteId) {
        /*
        1.查找学生id,在数组中所在的索引位置
        2.将该索引位置的学生对象使用null替换
        */
        int index = getIndex(deleteId);
        stud.remove(index);
    }
}
