<!DOCTYPE html>
<html lang="en">
<link rel="stylesheet" href="style3.css">

<script type="text/javascript" src="script.js"></script>
<head>
    <meta charset="UTF-8">
    <title>College_Event_Org_Acc</title>

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
    <a href="College_Event_Org_Home.jsp" name="collegeeventorghome" id="optiontag1">College-Event-Org_Home</a>
    <a href="College_Event_Staff_Create.jsp" name="collegeeventorgstaffcreate">College-Event-Org-Staff-Create</a>
    <a href="./ks" name="CollegeParticipationCertificate">College_Eve_Participation_Certificate</a>
    <a href="College_Logout1.jsp" name="Log_Out" class="logout" style="">Log Out</a>
</div>
<br><br>

<aside style="text-align: center">
    <h1>
        Id:<%=session.getAttribute("orgid") %><br>
        Name:<%=application.getAttribute("stname") %><br>
        Gender:<%=application.getAttribute("gender") %><br>
        Department:<%=application.getAttribute("dept") %><br>
        
        Mobile No:<%=application.getAttribute("mobileno") %><br>
        Type of Event:<%=application.getAttribute("event") %><br>
        Event Organiser Staff Members:<%=application.getAttribute("count")%><br>


    </h1>

</aside>

<br><br><br><br><br>

<footer>
    <hr color="#7fff7c" width="80%">
    <center><p>
        &copy; Designed &amp; Developed by PrudhviNath &amp; Approved by, Dept. of CSE
    </p></center>
</footer>

</body>
</html>
