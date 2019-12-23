package com.oudoctor;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Random;
public class Model2
{
private String numbers1=null;
public int otp;
	public String getNumbers1() 
	{
		return numbers1;
	}
	public void setNumbers1(String numbers1) 
	{
		this.numbers1 = numbers1;
	}

			public int sendSms() {
				try {
					// Construct data
					Random rand=new Random();
					otp=rand.nextInt(999999);
					String otp1=Integer.toString(otp);
					String apiKey = "apikey=" + "cutoQtzFUFg-sEe5PDL4htMZmGUV5H81Wpu1Yw1szF";
					String message = "&message=" + otp;
					String sender = "&sender=" + "TXTLCL";
					String numbers = "&numbers=" +"91"+numbers1;
					
					// Send data
					HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
					String data = apiKey + numbers + message + sender;
					conn.setDoOutput(true);
					conn.setRequestMethod("POST");
					conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
					conn.getOutputStream().write(data.getBytes("UTF-8"));
					final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
					final StringBuffer stringBuffer = new StringBuffer();
					String line;
					System.out.println(otp);
					while ((line = rd.readLine()) != null) {
						stringBuffer.append(line);
					}
					rd.close();
					
					return otp;
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
				return 0;
			}
		}
	

