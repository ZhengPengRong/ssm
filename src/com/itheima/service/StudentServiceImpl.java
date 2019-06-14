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
	        //��ߵĶ��ǲ����Ƿ��������ع���������һ�£����Ȳ���һ��teacher���ݣ���ȷ����������
	        Teacher teacher = new Teacher();
	        teacher.setTid(1);
	        teacher.setTname("С��");
	        teacher.setTusername("11111");
	        teacher.setTpassword("11111");
	        teacherMapper.insertSelective(teacher);
	        return 0;
	    }
}
