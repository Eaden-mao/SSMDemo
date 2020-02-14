package com.mao.service.api;

import com.mao.entity.Student;

import java.util.List;

public interface StudentServices {
    //增加一个Student
    int addStudent(Student student);
    //根据id删除一个Student
    int deleteStudentById(int id);
    //更新Student
    int updateStudent(Student student);
    //根据id查询,返回一个Student
    Student queryStudentById(int id);
    //查询全部Student,返回list集合
    List<Student> queryAllStudent();
}
