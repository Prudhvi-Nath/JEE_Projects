<!DOCTYPE html>
<html lang="en">
<link rel="stylesheet" href="style2.css">
<link rel="stylesheet" href="style1.css">
<script type="text/javascript" src="script.js"></script>
<head>
    <meta charset="UTF-8">
    <title>College_Event_Admin_Sup_Acc</title>

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
    <a href="./sb" name="collegeeventorg" >College-Event-Organisers</a>
    <a href="CollegeEventOrgStaff.jsp" name="collegeeventorgstaff">College-Event-Org Staff</a>


    <a href="collegeeventorgaccount.jsp" name="collegeeventorgacccreate">College-Eve-Org-Acc-Create</a>
    <a href="College_Event_Sup_admin.jsp" name="collegeeventorgsupervisoradmin" id="optiontag1">College-Event-Supervisor-Admin</a>
    <a href="College_Logout.jsp" name="Log_Out" class="logout" style="">Log Out</a>
</div>
<br><br><br><br>
<aside style="text-align: center"><h1>
    Id:<%=session.getAttribute("id") %><br>
    Name:<%=application.getAttribute("name") %><br>
    Gender:<%=application.getAttribute("gender") %><br>
    Age:<%=application.getAttribute("age") %><br>
    Blood Group:<%=application.getAttribute("blood_grp") %><br>
    Qualification:<%=application.getAttribute("qualification") %><br>
    Department:<%=application.getAttribute("department") %><br>
    Role:<%=application.getAttribute("role") %><br>
    Experience:<%=application.getAttribute("exp") %> years<br>
   
</h1>



</aside>

<footer>
    <hr color="#7fff7c" width="80%">
    <center><p>
        &copy; Designed &amp; Developed by PrudhviNath &amp; Approved by, Dept. of CSE
    </p></center>
</footer>

</body>
</html>
