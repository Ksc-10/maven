package com.itheima.infor.manager02.service;

import com.itheima.infor.manager02.dao.TeacherDao;
import com.itheima.infor.manager02.domain.Teacher;

public class TeacherService {
    public boolean addTeacher(Teacher t) {
        TeacherDao teacherDao = new TeacherDao();
        boolean result = teacherDao.addTeacher(t);
        return result;
    }

    public boolean isExists(String id) {
        TeacherDao teacherDao = new TeacherDao();
        Teacher[] teachers = teacherDao.findAllTeacher();
        boolean exists = false;
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            if (teacher != null && teacher.getId().equals(id)){
                exists = true;
                break;
            }
        }
        return exists;
    }

    public Teacher[] findAllTeacher() {
        TeacherDao teacherDao = new TeacherDao();
        Teacher[] allTeacher = teacherDao.findAllTeacher();
        boolean flag = false;
        for (int i = 0; i < allTeacher.length; i++) {
            Teacher t = allTeacher[i];
            if (t != null){
                flag=true;
                break;
            }
        }
        if (flag){
            return allTeacher;
        }else {
            return null;
        }
    }

    public void updateTeacher(String updateId, Teacher newTeacher) {
        TeacherDao teacherDao = new TeacherDao();
        teacherDao.updateTeacher(updateId,newTeacher);
    }

    public void deleteTeacherById(String deleteId) {
        TeacherDao teacherDao = new TeacherDao();
        teacherDao.deleteTeacherById(deleteId);
    }
}
