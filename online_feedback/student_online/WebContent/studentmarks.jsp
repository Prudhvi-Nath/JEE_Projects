<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Student Attendence</title>

</head>
<body style="text-align: center">
<table border="1" align="center" style="border: 4px solid black;font-size: 30px;width: 1000px ">

    <thead>
    <th>Studence Marks</th>

    </thead>
   
    
    <tr>
        <td>Telugu</td>
        <td><%=application.getAttribute("telugu") %></td>
    </tr>
    <tr>
        <td>Hindi</td>
        <td><%=application.getAttribute("hindi")%></td>
    </tr>
    <tr>
        <td>English</td>
        <td><%=application.getAttribute("english")%></td>
    </tr>
    <tr>
        <td>Maths</td>
        <td><%=application.getAttribute("maths")%></td>
    </tr>

    <tr>
        <td>Science</td>
        <td><%=application.getAttribute("science")%></td>
    </tr>
    <tr>
        <td>Social</td>
        <td><%=application.getAttribute("social")%></td>
    </tr>
    <tr>
        <th>Total Marks</th>
        <td><%=application.getAttribute("tot")%></td>
    </tr>
    <tr>
        <td>Total Percentage</td>
        <td><%=application.getAttribute("percentage")%></td>
    </tr>







</body>
</html>