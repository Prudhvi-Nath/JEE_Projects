<!DOCTYPE html>
<html lang="en">
<link rel="stylesheet" href="style2.css">
<link rel="stylesheet" href="style1.css">
<script type="text/javascript" src="script.js"></script>
<head>
    <meta charset="UTF-8">
    <title>College_Event_Admin</title>

</head>
<body style="alignment: center">


<div class="tophead">
    <img src="img/dhan.png" alt="can't load image">
    <header>

        Dhanekula Institute of Engineering and Technology<br>
        <small>Affiliated by JNTU Kakinada</small>
    </header>
</div>


<br>
<div id="action">
    <a href="./sb" name="collegeeventorg" id="optiontag1">College-Event-Organisers</a>
    <a href="CollegeEventOrgStaff.jsp" name="collegeeventorgstaff">College-Event-Org Staff</a>


    <a href="collegeeventorgaccount.jsp" name="collegeeventorgacccreate">College-Eve-Org-Acc-Create</a>
    <a href="College_Event_Sup_admin.jsp" name="collegeeventorgsupervisoradmin" >College-Event-Supervisor-Admin</a>
    <a href="College_Logout.jsp" name="Log_Out" class="logout" style="">Log Out</a>
</div>
<br><br><br><br>
<table border="1" align="center" style="border: 4px solid black;font-size: 30px;width: 1500px  ">

    <thead>
    <th style="text-align: center;"colspan="6">Event Organisers Details</th>

    </thead>
 <%@ page import='com.prudhvi.aj.*' %>
 
 
 
 
    <tr>
        <th>Id</th>
        <th>Name</th>
        
        <th>Gender</th>
        <th>Mobile No</th>
        <th>Department</th>
        <th>Event Type</th>
    </tr>
    <tr>
    <%@ page import ='java.util.*' %>
    <%@ page import='java.lang.*' %>
	<%@ page import='java.sql.*' %>
	<%@ page import='java.io.*' %>
	<%@ page import='com.prudhvi.aj.EventOrgnisers' %>
		<%
		
		try {
			Connection con=ConnectionFactory.getMyConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from fest_event_org_create");
			ResultSetMetaData rsmd = rs.getMetaData();
			int NumOfCol=rsmd.getColumnCount();
			System.out.println(NumOfCol);
			
			
			while(rs.next()) {%>
		<td><% out.println(rs.getString(1));%></td>
		<td><% out.println(rs.getString(2));%></td>
		
		<td><% out.println(rs.getString(4));%></td>
		<td><% out.println(rs.getLong(5));%></td>
		<td><% out.println(rs.getString(6));%></td>
		<td><% out.println(rs.getString(7));%></td>
		<td><a href="http://localhost:9002/College_Fest/del?user=<% out.println(rs.getString(1));%>" >Delete</a>
		</tr>
				<%
			}
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	%>    
    
       
    </table>

    <footer>
    <hr color="#7fff7c" width="80%">
    <center><p>
        &copy; Designed &amp; Developed by PrudhviNath &amp; Approved by, Dept. of CSE
    </p></center>
</footer>

</body>
</html>
