package com.mao.dao;

import com.mao.entity.Student;

import java.util.List;

public interface StudentDao {

    //增加一个学生
    int addStudent(Student student);

    //根据id删除一个学生
    int deleteStudentById(int id);

    //更新学生
    int updateStudent(Student student);

    //根据id查询,返回一个学生
    Student queryStudentById(int id);

    //查询全部学生,返回list集合
    List<Student> queryAllStudent();
}
