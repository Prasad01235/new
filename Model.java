package com.oudoctor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Model {
	private Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet res=null;
	
	private String name="null";
	private String email="null";
	private String password="null";
	private String phonenumber="null";
	private String PatientId="null";
	
	private String Patientname="null";
	private String phonenumber2;
	private String age="null";
	private String sex="null";
	private String address="null";
	private String phonenumber3;
	
	private int otp;
	private int otp1;
	
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	public int getOtp1() {
		return otp1;
	}
	public void setOtp1(int otp1) {
		this.otp1 = otp1;
	}
	public String getPhonenumber3() 
	{
		return phonenumber3;
	}
	public void setPhonenumber3(String phonenumber3) 
	{
		this.phonenumber3 = phonenumber3;
	}
	public String getPatientname() {
		return Patientname;
	}
	public void setPatientname(String Patientname) {
		this.Patientname = Patientname;
	}
	public String getPhonenumber2() {
		return phonenumber2;
	}
	public void setPhonenumber2(String phonenumber2) {
		this.phonenumber2 = phonenumber2;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPatientId() {
		return PatientId;
	}
	public void setPatientId(String patientId) {
		PatientId = patientId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhonenumber() {
	return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
		}
	
	public Model()
	{
		try
		{
		DBConnector dbc=new DBConnector();
		con=dbc.giveConnection();
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
		public boolean register() {
			try
			{
				
				pstmt=con.prepareStatement("Insert into OURDOCTOR values(?,?,?,?,?,?)");
				pstmt.setString(1,phonenumber);
				pstmt.setString(2,name);
				pstmt.setString(3,email);
				pstmt.setString(4,password);
				pstmt.setString(5, phonenumber);
				pstmt.setInt(6, otp);
				int num=pstmt.executeUpdate();
				if(num==0)
				{
					return false;
				}
				else {
					return true;
				}
			}
			catch(Exception e)
			{
			   e.printStackTrace();
			}
			return true;
		}
		
		
	public boolean login()
		{
			try
			{
				
			pstmt=con.prepareStatement("select*from OURDOCTOR where patientid=? and password=?");
			pstmt.setString(1, phonenumber);
			pstmt.setString(2,password);
			res=pstmt.executeQuery();
				while(res.next()==true)
				{
					name=res.getString("name");
					return true;
				}
				}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return false;
		}
	
		public boolean duplicate() {
			try {
				 pstmt=con.prepareStatement("select* from OURDOCTOR where phonenumber=?");
					pstmt.setString(1, phonenumber);
					res=pstmt.executeQuery();
					while(res.next()==true)
					{
						phonenumber=res.getString("PHONENUMBER");
						if(phonenumber==phonenumber)
						{
						return false;
					}
						else
						{
							return true;
						}
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return true;
		}
		
		/*public boolean Appointment()
		{
			try
			{
				pstmt=con.prepareStatement("Insert into Appointment values(?,?,?,?,?)");
				pstmt.setString(1,Patientname);
				pstmt.setString(2,phonenumber2);
				pstmt.setString(3,age);
				pstmt.setString(4, sex);
				pstmt.setString(5, address);
				int num=pstmt.executeUpdate();
				if(num==0)
				{
					return false;
				}
				else {
					return true;
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return true;
		}*/
		public boolean forgetPassword()
		{
			try
			{
			 	 pstmt=con.prepareStatement("UPDATE OURDOCTOR SET PASSWORD=? WHERE PHONENUMBER=?");
			 	 pstmt.setString(1,password);
			 	 pstmt.setString(2,phonenumber3);
			 	 int num=pstmt.executeUpdate();
			 	 if(num==0)
			 	 {
			 		 return false;
			 	 }
			 	 else
			 	 {
			 		 return true;
			 	 }
			}
			 	 catch(Exception e)
			 	 {
			 		 e.printStackTrace();
			 	 }
			 	 return true;
			 	 }
		
		public boolean otp()
		{
			try
			{
				pstmt=con.prepareStatement("select* from OURDOCTOR where otp=?");
				pstmt.setInt(1, otp1);
				res=pstmt.executeQuery();
				while(res.next()==true)
				{
					otp1=res.getInt("Otp");
					if(otp1==otp1)
					{
						return false;
					}
					else
					{
						return true;
					}
					}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return true;
		}
		
		}
	
