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
		
	//注入studentservice
	@Autowired
	private StudentService studentService;
	@RequestMapping("/demo")//此处测试springmvc是否工作
	public String request(HttpServletRequest request)
	{
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		return "demo";
	}
	@RequestMapping("/modelmap")//测试modelmap传参给页面
	public String modelMap(ModelMap modelMap)
	{
		User u=new User();
		u.setId(1);
		u.setName("xiaoming");
		modelMap.addAttribute("use",u);
		return "demo";
	}
	/*此处用于测试json
	 * 在studentServiceImpl中把这个方法插入了一个teacher
	 * 为了验证事物出错的回滚，如果之前teacher表中没有数据则不会回滚
	 * 
	 * */
	@RequestMapping("/json")
	public String json(@RequestBody Student student)
	{
		studentService.createStudent(student);//此处打断点debug查看student是否传入
		return "demo";
	}
}		