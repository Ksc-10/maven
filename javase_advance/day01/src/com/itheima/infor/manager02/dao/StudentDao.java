package com.itheima.infor.manager02.dao;

import com.itheima.infor.manager02.domain.Student;

public class StudentDao {
    //创建Student学生数组长度为5
    private static Student[] stud = new Student[5];
    //将接受到的学生对象添加到数组中
    public boolean addStudent(Student stu) {

        int index=-1;
        for (int i = 0; i < stud.length; i++) {
            Student student = stud[i];
            if (student==null){
                index=i;
                break;
            }
        }
        //返回是否添加成功的boolean类型值
        if (index==-1){
            return false;
        }else {
            stud[index]=stu;
            return true;
        }
    }

    public Student[] findAllStudent() {
        //将学生数组返回
        return stud;
    }

    public void updateStudent(String updateId, Student newStu) {
        /*
        1.查找学生id,在数组中所在的索引位置
        2.将该索引位置的学生对象使用新的学生对象替换
        */
        int index = getIndex(updateId);
        stud[index]= newStu;
    }

    //获取索引
    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < stud.length; i++) {
            Student stu = stud[i];
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
        stud[index]=null;
    }
}
