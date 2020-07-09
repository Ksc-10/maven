package com.itheima.infor.manager02.service;

import com.itheima.infor.manager02.dao.OtherStudentDao;
import com.itheima.infor.manager02.dao.StudentDao;
import com.itheima.infor.manager02.domain.Student;

public class OtherStudentService {
    private OtherStudentDao studentDao = new OtherStudentDao();
    public boolean addStudent(Student stu) {
        //StudentDao studentDao = new StudentDao();
        //传递给StudentDao
        boolean result = studentDao.addStudent(stu);
        //结果返回给StudentController
        return result;
    }

    public boolean isExists(String id) {
        //StudentDao studentDao = new StudentDao();
        //从StudentDao中获取存储学生对象的数组,调用findAllStudent方法
        Student[] stude = studentDao.findAllStudent();
        //遍历数组获取每一个学生对象,判断学号是否存在
        boolean exists=false;
        for (int i = 0; i < stude.length; i++) {
            Student student = stude[i];
            if (student != null && student.getId().equals(id)){
                exists=true;
                break;
            }
        }
        return exists;
    }


    public Student[] findAllStudent() {
        StudentDao studentDao = new StudentDao();
        Student[] allStudent=studentDao.findAllStudent();
        //判断学生数组中是否有数据
        boolean flag=false;
        for (int i = 0; i < allStudent.length; i++) {
            Student student = allStudent[i];
            if (student != null) {
                flag=true;
                break;
            }
        }
        if (flag){
            return allStudent;
        }else {
            return null;
        }
    }

    public void updateStudent(String updateId, Student newStu) {
        StudentDao studentDao = new StudentDao();
        studentDao.updateStudent(updateId,newStu);
    }

    public void deleteStudentById(String deleteId) {
        StudentDao studentDao = new StudentDao();
        studentDao.deleteStudentById(deleteId);
    }
}
