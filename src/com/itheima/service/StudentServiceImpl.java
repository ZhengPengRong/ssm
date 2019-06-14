package com.itheima.service;
import com.itheima.dao.StudentMapper;
import com.itheima.dao.TeacherMapper;
import com.itheima.entity.Student;
import com.itheima.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.itheima.service.StudentService;
@Service("studentServiceImpl")
public class StudentServiceImpl 
{
	    @Autowired
	    private StudentMapper studentMapper;
	    @Autowired
	    private TeacherMapper teacherMapper;
	    @Transactional
	    public int createStudent(Student student) 
	    {
	        studentMapper.insertSelective(student);
	        //后边的都是测试是否事务错误回滚，建议试一下，请先插入一条teacher数据，以确保出错！哈哈
	        Teacher teacher = new Teacher();
	        teacher.setTid(1);
	        teacher.setTname("小王");
	        teacher.setTusername("11111");
	        teacher.setTpassword("11111");
	        teacherMapper.insertSelective(teacher);
	        return 0;
	    }
}
