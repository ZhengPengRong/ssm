package com.itheima.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itheima.entity.Student;
import com.itheima.entity.User;
import com.itheima.service.StudentService;
@Controller
@RequestMapping("user")
public class DemoController 
{
		
	//ע��studentservice
	@Autowired
	private StudentService studentService;
	@RequestMapping("/demo")//�˴�����springmvc�Ƿ���
	public String request(HttpServletRequest request)
	{
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		return "demo";
	}
	@RequestMapping("/modelmap")//����modelmap���θ�ҳ��
	public String modelMap(ModelMap modelMap)
	{
		User u=new User();
		u.setId(1);
		u.setName("xiaoming");
		modelMap.addAttribute("use",u);
		return "demo";
	}
	/*�˴����ڲ���json
	 * ��studentServiceImpl�а��������������һ��teacher
	 * Ϊ����֤�������Ļع������֮ǰteacher����û�������򲻻�ع�
	 * 
	 * */
	@RequestMapping("/json")
	public String json(@RequestBody Student student)
	{
		studentService.createStudent(student);//�˴���ϵ�debug�鿴student�Ƿ���
		return "demo";
	}
}		