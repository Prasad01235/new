package com.oudoctor;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class newPassword extends HttpServlet
{
public void service (HttpServletRequest request,HttpServletResponse response)
{
	try
	{
		String phone=request.getParameter("PHNW");
		String npw= request.getParameter("NPW");
		Model dao =new Model();
		dao.setPhonenumber3(phone);
		dao.setPassword(npw);
		boolean temp=dao.forgetPassword();
		
		if(temp==true)
		{
			response.sendRedirect("successPasswordChange.jsp");
		}
		else
		{
			response.sendRedirect("failurePasswordChange.jsp");
		}
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
}
}
