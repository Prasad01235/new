/*package com.oudoctor;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Appointment extends HttpServlet 
{
 private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException 
	{
		
		try {
			
		String Patientname=request.getParameter("name2");
		String phonenumber2=request.getParameter("phone2");
		String age=request.getParameter("age");
		String sex=request.getParameter("sex");
		String address=request.getParameter("add");
		
		
		Model m=new Model();
		m.setPatientname(Patientname);
		m.setPhonenumber2(phonenumber2);
		m.setAge(age);
		m.setSex(sex);
		m.setAddress(address);
		
		boolean temp=m.Appointment();
		
		if(temp==true)
		{
			response.sendRedirect("SuccessAppointmnet.jsp");
		}
		else
		{
			response.sendRedirect("FaiureAppointment.jsp");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
}*/
