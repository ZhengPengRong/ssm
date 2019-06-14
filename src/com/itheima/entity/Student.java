package com.itheima.entity;
public class Student 
{
	private Integer sid;
	private String sname;
	private Integer ssex;
	private Integer sage;
	private Integer steacherid;
	private Teacher teacher;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) 
	{
		this.sname = sname;
	}
	public Integer getSsex() 
	{
		return ssex;
	}
	public void setSsex(Integer ssex) 
	{
		this.ssex = ssex;
	}
	public Integer getSage() 
	{
		return sage;
	}
	public void setSage(Integer sage) 
	{
		this.sage = sage;
	}
	public Integer getSteacherid() 
	{
		return steacherid;
	}
	public void setSteacherid(Integer steacherid) {
		this.steacherid = steacherid;
	}
	public Teacher getTeacher() 
	{
		return teacher;
	}
	public void setTeacher(Teacher teacher) 
	{
		this.teacher = teacher;
	}
	
}
