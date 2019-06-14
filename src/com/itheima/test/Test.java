package com.itheima.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.itheima.interceptor.Interceptor;
public class Test 
{
	public static void main(String[] args) 
	{
		HttpServletRequest request;
		HttpServletResponse response;
		Object obj1;
		Exception obj2;
		Interceptor icp=new Interceptor();
		try 
		{
			//icp.afterCompletion(request, response, obj1, obj2);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
