<!DOCTYPE html>
<html lang="en">

<script type="text/javascript" src="script.js"></script>
<head>
    <meta charset="UTF-8">
    <title>College_Event_Admin_Home</title>

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
    <a href="College_Event_Org_Home.jsp" name="collegeeventorghome" >College-Event-Org_Home</a>
    <a href="College_Event_Staff_Create.jsp" name="collegeeventorgstaffcreate"  >College-Event-Org-Staff-Create</a>
    <a href="./ks" name="CollegeParticipationCertificate">College_Eve_Participation_Certificate</a>
    <a href="College_Logout1.jsp" name="Log_Out" class="logout" style="">Log Out</a>
</div>
<br><br><br><br>

<table border="1" align="center" style="border: 4px solid black;font-size: 30px;width: 1000px  ">

    <thead>
    <th style="text-align: center;"colspan="7">Event Organisers Staff Details Create</th>

    </thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Gender</th>
        <th>Mobile No</th>
        <th>Event Type</th>
        <th>Org Id</th>
        <th>Department</th>
    </tr>
	<form action="./rd" method="POST">
    <tr>
    	<%@ page import='java.util.*' %>
    	<%@ page import='java.io.*' %>
    	<%@ page import='java.sql.*' %>
    	<%@ page import='com.prudhvi.aj.ConnectionFactory' %>
        <td><select id='firststaff' name='firststaff' required>
        		<option value=''>Select Option</option>
        		<%
        			try{
        			Connection con=ConnectionFactory.getMyConnection();
        			Statement st=con.createStatement();
        			ResultSet rs=st.executeQuery("select * from fest_staff_ids order by id");
        			while(rs.next()){%>
        				<option value='<%out.println(rs.getString("id"));%>'><%out.println(rs.getString("id"));%></option>
        			<%}
        			}
        			catch(SQLException se){
        				se.printStackTrace();
        			}
        		%>
        </select></td>
        <td><input type='text' name='namefirst' required></td>
        <td><select id='genderfirst' name='gender' required>
        	<option value=''>---Select Gender---</option>
        	<option value='Male'>Male</option>
        	<option value='Female'>Female</option>
        </select></td>
        <td><input type='text' name='mobilenofirst' min=1 maxlength=10 required></td>
        <td><input type='text' value='<%=application.getAttribute("event")%>' name='eventfirst' required></td>
        <td><select name='orgid1' required>
			<option value=''>-----</option>
			<option value='<%=session.getAttribute("orgid") %>'><%=session.getAttribute("orgid") %></option>        
        </select></td>
            <td><select id="department" name='department' required>

    <option value="">--Select Department--</option>
    <option value="<%=application.getAttribute("dept")%>"><%=application.getAttribute("dept")%></option>
   


</select></td>
        <td><input type='submit' name='submit'/></td>
    </tr>
    </form>
    
</table>
<br><br><br><br><br>
<footer>
    <hr color="#7fff7c" width="80%">
    <center><p>
        &copy; Designed &amp; Developed by PrudhviNath &amp; Approved by, Dept. of CSE
    </p></center>
</footer>

</body>
</html>
<style>
.tophead{
    border:5px solid goldenrod;
    border-radius: 9px;
}


header{

    text-align: center;
    font-family: "Century Gothic";
    color:white;
    font-size: 40px;
    border: 5px solid lightslategrey;
    background-color: #374566;
    border-radius: 4px;
    padding:20px;
}

#action a{
    text-align: center;
    text-space: 20px;
    text-decoration: none;
    outline: none;
    background-color:firebrick;
    color: whitesmoke;
    font-style: normal;
    font-family: Cambria;
    padding:13px;
    padding-right: 75px;
    padding-left: 75px;
    margin-left:5px;
    font-size: 20px;

    border: 1.5px solid black;
    border-spacing: 2px;
    border-radius: 3px;


    overflow: hidden;

}
#action a:hover{
    background-color: red;
    color: yellow;
}
#action #optiontag1{
    background-color: darkred;
    color:yellow ;
}
#action #optiontag2{
    background-color: darkred;
    color:yellow ;
}
::placeholder {

    font-size: 18px;
    font-family: Calibri;
}


input[type="submit"]{
    text-align: center;
    
    border: 3px solid royalblue;
    background-color: white;
    color:black;
    font-size: 18px;
    width: 150px;
    height: 50px;
    font-family: "Berlin Sans FB";
}
input[type="submit"]:hover{
    background-color: royalblue;
    color: white;
}
footer{

    margin-top: 100px;
}
img{
    float: left;
    padding: 10px;
    margin-left:90px;
    height: 120px;
    width: 170px;

}

h2{

    display: inline-block;
    margin-left: 160px;
}
.logout{
    border: 4px solid darkgrey;
    border-radius: 100%;
    background-color:white;
    color: darkred;
    font-family: "Cooper Black";
    font-size: medium;
    outline: none;

}
.logout:hover{
    background-color: darkred;
    color: blue;
}
.logout:active{
    background-color: darkred;
    color: yellow;
    box-shadow: 0 5px #666;

    cursor: progress;
    transform: translateY(6px);
}
#orgstaff{
    text-align: center;
    padding:20px;
    border:2px solid black;
    border-radius:15px;
    width: 300px;
    font-size: 20px;
    margin-left:40%;
    font-family: "Josefin Sans";
    outline: none;
}
#orgstaffdept{
    text-align: center;
    padding:20px;
    border:2px solid black;
    border-radius:15px;
    width: 280px;
    height: 60px;
    font-size: 15px;
    margin-left:40%;
    font-family: "Josefin Sans";

    outline: none;
    margin-left: 600px;
    margin-top: 30px;

}
#orgstaffevent{
    text-align: center;
    padding:20px;
    border:2px solid black;
    border-radius:15px;
    width: 280px;
    height: 60px;
    font-size: 15px;
    margin-left:40%;
    font-family: "Josefin Sans";

    outline: none;
    margin-left: 600px;
    margin-top: 30px;

}
button{
    text-align: center;
    margin-left: 670px;
    border: 3px solid royalblue;
    background-color: white;
    color:black;
    font-size: 18px;
    width: 150px;
    height: 50px;
    font-family: "Berlin Sans FB";
}
button:active{
    background-color: darkred;
    color: white;
}
@media screen and (max-width:7009px) {
    #action {
        width: 101%;
    }
}


</style>