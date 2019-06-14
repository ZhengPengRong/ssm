package com.itheima.entity;

import java.util.List;

public class Teacher 
{
	private Integer tid;
	private String tname;
	private String tusername;
	private String tpassword;
	private List<Student> student;
	public Integer getTid() 
	{
		return tid;
	}
	public void setTid(Integer tid) 
	{
		this.tid = tid;
	}
	public String getTname() 
	{
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTusername() 
	{
		return tusername;
	}
	public void setTusername(String tusername) 
	{
		this.tusername = tusername;
	}
	public String getTpassword() 
	{
		return tpassword;
	}
	public void setTpassword(String tpassword) 
	{
		this.tpassword = tpassword;
	}
	public List<Student> getStudent()
	{
		return student;
	}
	public void setStudent(List<Student> student) 
	{
		this.student = student;
	}	
}
