package com.itheima.infor.manager02.dao;

import com.itheima.infor.manager02.domain.Student;

public interface BaseStudentDao {

    //将接受到的学生对象添加到数组中
    public abstract boolean addStudent(Student stu);

    public abstract Student[] findAllStudent();

    public abstract void updateStudent(String updateId, Student newStu);

    //获取索引
    public abstract int getIndex(String id);

    public abstract void deleteStudentById(String deleteId);
}
