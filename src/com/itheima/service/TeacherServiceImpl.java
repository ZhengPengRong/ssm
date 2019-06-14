package com.itheima.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.dao.TeacherMapper;
import com.itheima.entity.Teacher;

@Service("teacherServiceImpl")
public class TeacherServiceImpl 
{
    @Autowired
    private TeacherMapper teacherMapper;
    public int createTeacher(Teacher teacher) 
    {
        teacherMapper.insertSelective(teacher);
        return 0;
    }
}
