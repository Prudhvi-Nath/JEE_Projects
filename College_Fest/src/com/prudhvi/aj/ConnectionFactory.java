package com.prudhvi.aj;
import java.sql.*;
import java.util.*;
import java.io.*;
public class ConnectionFactory{
//ConnectionFacotory uses multiple times,on behalf of having multiple connections in multiple files
	private Properties p;
	private File f;
	private FileInputStream fis;
	private String driverName;	
	private String urlName;
	private String username;
	private String password;
	private  Driver driver;//oracle driver
	private static ConnectionFactory connectionFactory=null;
	private static Connection con=null;
	ConnectionFactory()throws IOException,ClassNotFoundException,InstantiationException,IllegalAccessException{
		f=new File("C:\\Users\\prudh\\jsppractice\\College_Fest\\WebContent\\mydb.properties");
		fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
		driverName=p.getProperty("drivername");
		urlName=p.getProperty("urlname");
		username=p.getProperty("username");
		password=p.getProperty("password");
		p.setProperty("user",username);
		p.setProperty("passwrd",password);
		Class cls=Class.forName(driverName);
		Object o=cls.newInstance();//creating object for driver in object class
		driver=(Driver)o;//by downcasting can access the driver class data from object class//it has two method acceptURL(-),connect()
		}
	
		public static Connection getMyConnection()throws ClassNotFoundException,InstantiationException,IllegalAccessException,IOException,SQLException
/*connection class having getMyConnection method*/
		{
			if(connectionFactory==null){
		 connectionFactory=new ConnectionFactory();//calling the constructor for creating connection
				con=connectionFactory.driver.connect(connectionFactory.urlName,connectionFactory.p);
				return con;
				}
			else	
				return con;//second time executing directly it returns connected object not executing again			
		}
	}
	
		
		