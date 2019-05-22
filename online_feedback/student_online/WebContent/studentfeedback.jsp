<!DOCTYPE html>
<html lang="en">
<link rel="stylesheet" href="style.css">
<head>
    <meta charset="UTF-8">
    <title>Student Feedback</title>
</head>

<body style="text-align: center;margin-top: 40px">
<h4>Rate according to the performance:1.very bad 2.Satisfactory 3.Good 4.Very Good 5.Excellent</h4><br>
<form action="./stfeed">
	<select name='stuid'>
		<option value="<%=session.getAttribute("id")%>"><%=session.getAttribute("id")%><option>
	</select><br><br><br>
<table border="2">
    <thead>
        <th colspan="6" style="font-size: 30px;font-family: Calibri;">Student Feedback</th>

    </thead>
    <th>Subjects</th>
    <th>Is your Lecturar clarifying doubts that you arising:</th>
    <th>Is your Lecturer explaining all the  topics without any exception:</th>
    <th>Is your Lecturer explaining in student understandable language  </th>
    <th>Is your Lecturer explaining topics with various different examples </th>
    <th>Is your Lecturer refering textbooks to explain different problems </th>
    <tr>
        <td>
        Computer Programming
        </td>
        <td><select name="cp1" required>
            <option value="">select rate</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select> </td>
        <td><select name="cp2"required>
            <option value="">select rate</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select> </td>
        <td><select name="cp3" required>
            <option value="">select rate</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select> </td>
        <td><select name="cp4" required>
            <option value="">select rate</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select> </td>
        <td><select name="cp5" required>
            <option value="">select rate</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select> </td>

    </tr>
    <tr>
        <td>
            JAVA
        </td>
        <td><select name="java1" required>
            <option value="">select rate</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select> </td>
        <td><select name="java2" required>
            <option value="">select rate</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select> </td>
        <td><select name="java3" required>
            <option value="">select rate</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select> </td>
        <td><select name="java4" required>
            <option value="">select rate</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select> </td>
        <td><select name="java5" required>
            <option value="">select rate</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select> </td>

    </tr>
    <tr>
        <td>
            Data Structures
        </td>
        <td><select name="ds1" required>
            <option value="">select rate</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select> </td>
        <td><select  name="ds2" required>
            <option value="">select rate</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select> </td>
        <td><select name="ds3" required>
            <option value="">select rate</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select> </td>
        <td><select name="ds4" required>
            <option value="">select rate</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select> </td>
        <td><select name="ds5" required>
            <option value="">select rate</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select> </td>

    </tr>
    <tr>
        <td>
            Operating System
        </td>
        <td><select name="os1" required>
            <option value="">select rate</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select> </td>
        <td><select name="os2" required>
            <option value="">select rate</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select> </td>
        <td><select name="os3" required>
            <option value="">select rate</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select> </td>
        <td><select name="os4" required>
            <option value="">select rate</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select> </td>
        <td><select name="os5" required>
            <option value="">select rate</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select> </td>

    </tr>
    <tr>
        <td>
            Web Technology
        </td>
        <td><select name="wt1" required>
            <option value="">select rate</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select> </td>
        <td><select name="wt2" required>
            <option value="">select rate</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select> </td>
        <td><select name="wt3" required>
            <option value="">select rate</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select> </td>
        <td><select name="wt4" required>
            <option value="">select rate</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select> </td>
        <td><select name="wt5" required>
            <option value="">select rate</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select> </td>

    </tr>
</table>

<span style="color: black;font-size: 18px;">Your Comment:</span><textarea rows="10" cols="60" name="cmt" placeholder="please mention your feedback" style="font-size: 20px;font-family: Arial;margin-top: 40px;border-radius: 10px;background-color: cadetblue;outline: none ">


</textarea><br><br>
<input type="submit"  value="submit"/>
</form>
</body>
</html>
<style>
    table,th,td,tr{
        width: 550px;
        height: 200px;
        text-align: center;
        border-radius: 4px;
        border: 2px solid black;
        padding: 10px;
        margin-left: 410px;
    }

</style>