

<!DOCTYPE html>
<html lang="en">
<link rel="stylesheet" href="style1.css">
<body target='_parent'>
<head>
    <meta charset="UTF-8">
    <title>Teacher</title>


</head>


<div id="head">
    <img src="dhan.png" id="image" alt="cant load image">

    <header>

        <h1>Dhanekula Institute Of Engineering and Technology</h1>

        <h3>Affiliated by JNTU,Kakinada</h3>




    </header>
</div>

<a href="#" target="_self" onclick="change()" name="down">Home</a>

<a href="#" target="_self" onclick="change1()" name="down">Teach-Stud Attend</a>

<a href="#" target="_self" onclick="change2()" name="down">Teach-Stud Feed</a>

<a href="#" target="_self" onclick="change3()" name="down">Teach-Stud marks</a>

<a href="#" target="_self" onclick="change4()" name="down">Teach-Stud Acc</a>


<a href="OfficialPortal.jsp" class="logout" target="_top">Log Out</a>
<iframe id="myframe" style="height: 473px;width: 1520px;position:relative"></iframe>

</body>
</html>
<script type="text/javascript">
    function change() {
        document.getElementById("myframe").src = "teacherhome.jsp";
    }
    function change1() {
        document.getElementById("myframe").src = "teacherstudentatt.jsp";
    }
    function change2() {
        document.getElementById("myframe").src = "teacherstudentfeed.jsp";
    }
    function change3() {
    	document.getElementById("myframe").src="teacherstudent_marks.jsp";
    }
    function change4(){
        
        document.getElementById("myframe").src = "teacherstudacc.jsp";
    }


</script>
