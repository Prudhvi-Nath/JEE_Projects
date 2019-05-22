package com.prudhvi.aj;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Struct;
import java.util.Arrays;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class DBUtils implements Serializable{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		private String id;
		private String name;
		private String passwrd;
		private String gender;
		private String date;
		private String ug;
		private String spec;
		private String socialpro;
		private String link;
		private String[] object;
		private String[] object1;
		private String[] object2;
		private String[] object3;
		private String[] object4;
		
		public String getObject() {
			return object[0];
		}

		public void setObject(String[] object) {
			this.object = object;
		}
		public String getObject1() {
			return object1[1];
		}

		public void setObject1(String[] object1) {
			this.object1 = object1;
		}

		public String getObject2() {
			return object2[2];
		}

		public void setObject2(String[] object2) {
			this.object2 = object2;
		}

		public String getObject3() {
			return object3[3];
		}

		public void setObject3(String[] object3) {
			this.object3 = object3;
		}

		public String getObject4() {
			return object4[4];
		}

		public void setObject4(String[] object4) {
			this.object4 = object4;
		}

		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPasswrd() {
			return passwrd;
		}
		public void setPasswrd(String passwrd) {
			this.passwrd = passwrd;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getUg() {
			return ug;
		}
		public void setUg(String ug) {
			this.ug = ug;
		}
		public String getSpec() {
			return spec;
		}
		public void setSpec(String spec) {
			this.spec = spec;
		}
		public String getSocialpro() {
			return socialpro;
		}
		public void setSocialpro(String socialpro) {
			this.socialpro = socialpro;
		}
		public String getLink() {
			return link;
		}
		public void setLink(String link){
			this.link = link;
		}
		
		
	public DBUtils()throws ClassNotFoundException,SQLException{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora5pm","oracle");
		
		
	

	}
	public void m1() throws SQLException {
		
		ps=con.prepareStatement("select * from student_details where sid=?");
		System.out.println(id);
		ps.setString(1,this.getId());
		rs=ps.executeQuery();
		while(rs.next()) {
			Struct st=(Struct)rs.getObject(9);
			Object o[]=st.getAttributes();
			String s[] = Arrays.asList(o)
					.toArray(new String[o.length]);
					//.toArray(new String[objectArray.length]);
			this.setId(rs.getString("sid"));
			
			this.setPasswrd(rs.getString("password"));
			this.setName(rs.getString("name"));
			this.setGender(rs.getString("gender"));
			this.setDate(rs.getString("dob"));
			this.setUg(rs.getString("ug"));
			this.setSocialpro(rs.getString("social"));
			this.setSpec(rs.getString("SPECILIZATION"));
			this.setLink(rs.getString("link"));
			this.setObject(s);
			this.setObject1(s);
			this.setObject2(s);
			this.setObject3(s);
			this.setObject4(s);
			
			System.out.println(rs.getString(1)+"---------"+rs.getString(2)+"------"+rs.getString(3)+"------"+rs.getString(4)+"-----"+rs.getString(5)+"-----"+rs.getString(6)+"-----"+rs.getString("social")+"------"+rs.getString(8)+"-------"+s[0]+"------"+s[1]+"----------"+s[2]+"--------"+s[3]+"--------"+s[4]+"--------"+rs.getString("dob"));
			
			
			System.out.println(this.getObject());
			System.out.println(this.getObject1());
			System.out.println(this.getObject2());
			System.out.println(this.getObject3());
			System.out.println(this.getObject4());
			
		
					
			
	         }
	}

}
