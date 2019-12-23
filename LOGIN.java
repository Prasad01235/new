package com.oudoctor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LOGIN extends HttpServlet {
private static final long serialVersionUID = 1L;
public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
{
	try {
		String patientid=request.getParameter("Phn");
		String password=request.getParameter("PW");
		Model m=new Model();
		m.setPhonenumber(patientid);
		m.setPassword(password);
		boolean temp=m.login();
		if(temp==true)
		{
			String name=m.getName();
			HttpSession session =request.getSession(true);
			session.setAttribute("name",name);
			response.sendRedirect("Successlogin.jsp");
		}
		else
		{
			response.sendRedirect("failurelogin.jsp");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}


