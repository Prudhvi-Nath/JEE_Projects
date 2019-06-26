<!DOCTYPE html>
<html lang="en">
<link rel="stylesheet" href="style2.css">

<script type="text/javascript" src="script.js"></script>
<head>
    <meta charset="UTF-8">
    <title>College_Event_Org_staff</title>

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
   <a href="./sb" name="collegeeventorg">College-Event-Organisers</a>
    <a href="CollegeEventOrgStaff.jsp" name="collegeeventorgstaff"  id="optiontag1">College-Event-Org Staff</a>


    <a href="collegeeventorgaccount.jsp" name="collegeeventorgacccreate">College-Eve-Org-Acc-Create</a>
    <a href="College_Event_Sup_admin.jsp" name="collegeeventorgsupervisoradmin" >College-Event-Supervisor-Admin</a>
    <a href="College_Logout.jsp" name="Log_Out" class="logout" style="">Log Out</a>
</div><br><br>
<%@ page import='java.util.*' %>
<%@ page import='java.sql.*' %>
<%@ page import='java.io.*' %>
<%@ page import='com.prudhvi.aj.ConnectionFactory' %>

<form name="form1" action="./ty" method="post">
<select id="orgstaff" name="orgstaff" onchange="myFunction()" required>
    <option value="">--Select Event Org Id--</option>
    <option value="EVO1">EVO1</option>
    <option value="EVO2">EVO2</option>
    <option value="EVO3">EVO3</option>
    <option value="EVO4">EVO4</option>
    <option value="EVO5">EVO5</option>
    


</select><br><br><br>

</form>

<h1><center><p id="demo"></p></center></h1>
<script>
    
    function myFunction() {
    	

    	var x = document.getElementById("orgstaff").value;
        document.getElementById("demo").innerHTML = "You selected: " + x;
        <%Thread.sleep(1000);%>
        javascript:document.form1.submit();        
    
    }
</script>
<br><br><br><br>
<table border="1" align="center" style="border: 4px solid black;font-size: 30px;width: 1000px  ">

    <thead>
    
    
    <th style="text-align: center;"colspan="5">Event Organisers Staff Details</th>

    </thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Gender</th>
        <th>Mobile No</th>
        <th>Event Type</th>
    </tr>
    <%
    
    	String orgid=(String)application.getAttribute("orgstaff");
    System.out.println("********"+orgid+"------");
    	Connection con=ConnectionFactory.getMyConnection();
    	PreparedStatement ps=con.prepareStatement("select sid,name,gender,mobileno,event from fest_event_staff_create where orgid=?");
    	ps.setString(1,orgid);
    	ResultSet rs=ps.executeQuery();
    	while(rs.next()){
    		System.out.println(rs.getString("sid")+"--------"+rs.getString("name")+"-------"+rs.getString("gender")+"-------"+rs.getLong("mobileno")+"--------"+rs.getString("event"));
    %>
    <tr>
        <td><% out.println(rs.getString("sid")) ;%></td>
        <td><%out.println(rs.getString("name")); %></td>
        <td><%out.println(rs.getString("gender")); %></td>
        <td><%out.println(rs.getLong("mobileno")); %></td>
        <td><% out.println(rs.getString("event")); %></td>
    </tr>
    <%} %>
    </table>

<footer>
    <hr color="#7fff7c" width="80%">
    <center><p>
        &copy; Designed &amp; Developed by PrudhviNath &amp; Approved by, Dept. of CSE
    </p></center>
</footer>

</body>
</html>
