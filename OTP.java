package com.ourdoctor;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oudoctor.Model;

public class OTP extends HttpServlet 
{


	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
			HttpSession session =request.getSession();
			int otp=Integer.parseInt(request.getParameter("OTP"));
			String phone=(String) session.getAttribute("phonenumber");
			String name=(String) session.getAttribute("name");
			String email=(String) session.getAttribute("email");
			String password=(String) session.getAttribute("password");
			int temp = (int) session.getAttribute("otp");

			if(temp==otp)
			{
				Model m1=new Model();
				m1.setOtp1(otp);
				boolean tempo= m1.otp();
				if(tempo==true)
				{
					m1.setName(name);
					m1.setEmail(email);
					m1.setPhonenumber(phone);
					m1.setPassword(password);
					m1.setOtp(otp);
					boolean temp1=m1.register();
					if(temp1==true)
					{
						response.sendRedirect("SuccessRegister.jsp");
						session.removeAttribute("otp");
					}
				}
				else {
					response.sendRedirect("failureRegister.jsp");
					session.removeAttribute("otp");
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
