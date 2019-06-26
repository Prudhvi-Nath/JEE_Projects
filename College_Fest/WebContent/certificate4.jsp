<!DOCTYPE html>
<html lang="en">
<link rel="stylesheet" href="style3.css">
<head>
    <meta charset="UTF-8">
    <title>Certificate4</title>
</head>
<body>
<div id="border1">
    <div id="border2">
        <div id="logo">

        </div>

        <hr><h1 style="text-align: center;text-transform: capitalize;color: darkred">Dhanekula Institute of Engineering and Technology</h1><center><h2 style="text-align: center;text-transform: capitalize">Affliated bu JNTU,Kakinada</h2></center></hr>
        <h1 style="text-align: center;text-decoration: underline;color: #374566">Certification of Participation-DHANUSH-2K18</h1>
        <div id="border3">
            <h2 style="margin-left: 30px;font-size: 23px;font-family: 'Cooper Black'">This is to Certify that<span style="text-decoration: underline">________________________<%=application.getAttribute("namestaffing3")%>____________________</span>is from the branch of<span style="text-decoration: underline">_________BTECH__________</span>From the Department of<span style="text-decoration: underline">______<%=application.getAttribute("depts4") %>________</span>has participated as a <span style="text-decoration: underline">____________Fest Coordinator in <%=application.getAttribute("evnt3") %>___________</span> in the Dhanush-2K18 Fest Organised by Dhanekula Institue Of Engineering and Technology from Computer Science Of Engineering Department.</h2>
        </div>

        <div id="border4">
            <h2 style="float: right;margin-right: 20px;font-family: Calibri;text-decoration: underline">_________Signature Of Principal________</h2>
            <br>
            <h1 style="margin-left: 1170px;">Kadiyala Ravi</h1>


        </div>


    </div>

</div>
<br><br>
<button id="cert4" onclick="myFuntion()">Download Certificate4</button><br><br>
<script>
    function myFuntion() {
        window.print();
    }
</script>


</body>
</html>
<style>
    body{
        background-color:white+;
    }
    #border1{
        border:8px solid green;

        height: 690px;
        width: 1500px;
        border-radius: 2px;
        background-size: cover;


    }
    #border2{
        border:6px solid orangered;
        height: 678px;
        width: 1487px;
        background-color:lavenderblush;
    }
    #logo{


        background: url("img/logo.jpg");
        background-repeat: no-repeat;
        background-position: center;
        width: 185px;
        height: 180px;
        margin-top: 05px;
        margin-left: 620px;


    }


</style>