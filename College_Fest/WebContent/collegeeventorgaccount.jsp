<!DOCTYPE html>
<html lang="en">
<link rel="stylesheet" href="style2.css">

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
    <a href="./sb" name="collegeeventorg">College-Event-Organisers</a>
    <a href="CollegeEventOrgStaff.jsp" name="collegeeventorgstaff">College-Event-Org Staff</a>


    <a href="collegeeventorgaccount.jsp" name="collegeeventorgacccreate" id="optiontag1">College-Eve-Org-Acc-Create</a>
    <a href="College_Event_Sup_admin.jsp" name="collegeeventorgsupervisoradmin" >College-Event-Supervisor-Admin</a>
    <a href="College_Logout.jsp" name="Log_Out" class="logout" style="">Log Out</a>
</div><br><br>
<form action='./st' method='post'>
    <input type="text" name="id" class="sid" pattern="(?=.*\d)(?=.*[A-Z]).{4}" placeholder="Enter Your Id" required>
    <input type="text" name="name" class="name" placeholder="Enter your Name" onkeyup=lettersonly(this) required><br>
    <br>
    <input type="password" name="pwd" class="pwd" placeholder="Enter your Password" required>
<select id="orgstaffdept" name='gender' required>

    <option value="">--Select Gender--</option>
    <option value="Male">Male</option>
    <option value="Female">Female</option>


</select><br><br>
<input type="text" id="mobileno" maxlength="10" name="mobileno" placeholder='Enter Your Mobile No' pattern="[0-9]{3}[0-9]{3}[0-9]{2}[0-9]{2}"  required><br><br>

<select id="orgstaffdept" name='dept' required>

    <option value="">--Select Department--</option>
    <option value="Computer Science and Engineering">Computer Science and Engineering</option>
    <option value="Electronics and Communication Engineering">Electronics and Communication Engineering</option>
    <option value="Electrical and  Electronics Engineering">Electrical and  Electronics Engineering</option>
    <option value="Civil Engineering">Civil Engineering</option>
    <option value="Mechanical Engineering">Mechanical Engineering</option>


</select><br>
<select id="orgstaffevent" name='event' required>
    <option value="">--Select Event--</option>

    <option value="Coding Test">Coding Test</option>
    <option value="Paper Presentation">Paper Presentation</option>
    <option value="Code Error Detection Test">Code Error Detection Test</option>
    <option value="Idea Start Up">Idea Start Up</option>
    <option value="Project Seminar">Project Seminar</option>


</select><br><br><br>



<input type="submit" name="submit" value="Submit">
</form>
<br><br>




<footer>
    <hr color="#7fff7c" width="80%">
    <center><p>
        &copy; Designed &amp; Developed by PrudhviNath &amp; Approved by, Dept. of CSE
    </p></center>
</footer>

</body>
</html>
