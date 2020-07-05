package com.itheima.infor.manager02.dao;

import com.itheima.infor.manager02.domain.Teacher;

public class TeacherDao {
    private static Teacher[] teachers = new Teacher[5];
    public boolean addTeacher(Teacher t) {
        //Teacher[] teachers = new Teacher[5];
        int index = -1;
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            if (teacher==null){
                index=i;
                break;
            }
        }
        if (index==-1){
            return false;
        }else {
            teachers[index]=t;
            return true;
        }
    }

    public Teacher[] findAllTeacher() {
        return teachers;
    }

    public void updateTeacher(String updateId, Teacher newTeacher) {
        int index = getIndex(updateId);
        teachers[index] = newTeacher;
    }

    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < teachers.length; i++) {
            Teacher t = teachers[i];
            if (t != null && t.getId().equals(id)){
                index=i;
                break;
            }
        }
        return index;
    }

    public void deleteTeacherById(String deleteId) {
        int index = getIndex(deleteId);
        teachers[index]= null;
    }
}
