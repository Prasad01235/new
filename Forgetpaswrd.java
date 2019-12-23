package com.oudoctor;


import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Forgetpaswrd extends HttpServlet 
{
	
	public void service(HttpServletRequest request , HttpServletResponse response)
	{
		try
		{
			String fromEmail="prasadvasu76@gmail.com";      //sender's mail id.
			String pwd="prasadva$u777";		               //sender's mail pwd.
			String toEmail=request.getParameter("email");  //reciever's mail id.
			
			String subject="DO NOT REPLY";                            // mail subject line
			String msg="http://ourdoctor.us-east-2.elasticbeanstalk.com/newPassword.jsp"; //mail body
			
			//Creating Session Object
			
			Properties prop = new Properties();
			prop.put("mail.smtp.host", "smtp.gmail.com");
			prop.put("mail.smtp.port", 587);
			prop.put("mail.smtp.auth", "true");
			prop.put("mail.smtp.starttls.enable", "true");

			Session session = Session.getDefaultInstance(prop, new javax.mail.Authenticator()
			{
				protected PasswordAuthentication getPasswordAuthentication()
				{
					
					return new PasswordAuthentication(fromEmail, pwd);
				}
			});

			
			//Composing the Mail
			MimeMessage mesg = new MimeMessage(session);
			mesg.setFrom(new InternetAddress(fromEmail));
			mesg.addRecipient(Message.RecipientType.TO,new InternetAddress(toEmail));
			mesg.setSubject(subject);  
			mesg.setText(msg);  
			
			//Sending the Mail
			Transport.send(mesg);
		    response.sendRedirect("successPassword.jsp");
		    
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

