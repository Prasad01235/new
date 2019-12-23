package com.oudoctor;

import java.io.IOException;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Register1 extends HttpServlet
	{
	private static final long serialVersionUID = 1L;

		public void service(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException 
		{
			
			try {
				
				String name=request.getParameter("name");
				String email=request.getParameter("email");
				String phonenumber=request.getParameter("phone");
				String password=request.getParameter("psw");
			   
				
				HttpSession session = request.getSession(true);
				session.setAttribute("phonenumber",phonenumber);
		        session.setAttribute("name", name);
		        session.setAttribute("email", email);
		        session.setAttribute("password", password);
		        Model m=new Model();
		        m.setPhonenumber(phonenumber);
		        boolean temp1=m.duplicate(); 
			if(temp1==false)
			{
					response.sendRedirect("duplicate.jsp");
			}
			else
			{ 
				Model2 ml2 = new Model2();  
				ml2.setNumbers1(phonenumber);
		      int temp=ml2.sendSms();
		      session.setAttribute("otp",temp);
		      response.sendRedirect("Otp.jsp");
			}
			}
		      
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			}
		 }

		 
