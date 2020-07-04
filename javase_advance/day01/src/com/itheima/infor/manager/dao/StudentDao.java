package com.itheima.infor.manager.dao;

import com.itheima.infor.manager.domain.Student;

        public class StudentDao {

            private static Student[] stau = new Student[5];

            //删除学生
            public  void deleteStudentById(String delId) {
                //查找id在容器中所在的索引位置
                int index = getIndex(delId);
                //将该索引位置,使用null元素进行覆盖
                stau[index]=null;
            }

            //获取索引
            public int getIndex(String delId) {
                int index=-1;
                for (int i = 0; i < stau.length; i++) {
                    Student stu = stau[i];
                    if (stu != null && stu.getId().equals(delId)){
                        index=i;
                        break;
                    }
                }
                return index;
            }

            public boolean addStudent(Student stu) {

                int index = -1;
                for (int i = 0; i < stau.length; i++) {
                    Student student = stau[i];
                    if (student==null){
                        index=i;
                        break;
                    }
                }
                if (index==-1){
                    return false;
                }else {
                    stau[index]=stu;
                    return true;
                }
            }

            public Student[] findAllStudent() {
                return stau;
            }

            public void updateStudent(String updateId, Student newStu) {
                int index = getIndex(updateId);
                stau[index]=newStu;
    }
}
