<!DOCTYPE html>
<html lang="en">
<link rel="stylesheet" href="style1.css">
<head>
    <meta charset="UTF-8">
    <title>Student</title>


</head>


<div id="head">
    <img src="dhan.png" id="image" alt="cant load image">

    <header>

        <h1>Dhanekula Institute Of Engineering and Technology</h1>

        <h3>Affiliated by JNTU,Kakinada</h3>




    </header>
</div>

<a href="#" target="_parent" onclick="change()" name="down">Home</a>

<a href="#" target="_parent" onclick="change1()" name="down">Student Marks</a>

<a href="#" target="_parent" onclick="change2()" name="down">Student Attendence</a>

<a href="#" target="_parent" onclick="change3()" name="down">Student Feedback</a>
<a href="OfficialPortal.jsp" class="logout" target="_top">Log Out</a>
<iframe id="myframe" style="height: 473px;width: 1520px;position:relative"></iframe>

</body>
</html>
<script type="text/javascript">
    function change() {
        document.getElementById("myframe").src = "studenthome.jsp";
    }
    function change1() {
        document.getElementById("myframe").src = "studentmarks.jsp";
    }
    function change2() {
        document.getElementById("myframe").src = "studentattendence.jsp";
    }
    function change3() {
        document.getElementById("myframe").src = "studentfeedback.jsp";
    }


</script>
