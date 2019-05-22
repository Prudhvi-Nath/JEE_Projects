<!DOCTYPE html>
<html lang="en">
<link rel="stylesheet" href="style.css">
<head>
    <meta charset="UTF-8">
    <title>TeacherStudentAcc</title>

</head>
<body>

<div id="studentlogin">
    <h1 style="text-align: center">Student Account Form</h1>
    <form action="./stuacc">
        <span>Enter Student ID:  </span><input type="text" name="studentid"  placeholder="enter your id" required><br><br>
        <span>Enter Student Name:  </span><input type="text" name="studentname"  placeholder="enter your name" required><br><br>
        <span>Enter Student Password:  </span><input type="password" name="studentpassword" placeholder="enter your password" required><br><br>
        <span>Enter Student Gender:  </span> <input type="radio" name="studentgender"  value="male" required> Male&nbsp;<input type="radio" name="studentgender" value="female" required>Female<br>
        <span>Date Of Birth:  </span><input type="date" name="studentbirth"   required><br><br>
        <span>Enter Student UG:  </span><input type="text" name="studentUG"  placeholder="enter your UG" required><br><br>
        <span>Enter Student Specialization:  </span><input type="text" name="studentspec"  placeholder="enter your Specialization" required><br><br>
        <span>Enter Student Social Profiles:  </span><select id="social" name="socialsite" required><option value=""></option><option value="facebook">facebook</option><option value="Linked.In">Linked.In</option>
    <option value="Youtube">youtube</option><option value="GitHub">github</option> </select><br>
        <span>Enter Student Social Link:  </span><input type="text" name="studentlink"  placeholder="place your social here" required><br><br>
        <span>Enter the Technologies:</span><br>
        <select id="first" name="first" required><option value=""></option><option value="c">CP</option><option value="c++">C++</option>
    <option value="Java">Java</option><option value="DS">DS</option><option value="HTML">HTML</option><option value="Css">CSS</option> </select>
        &nbsp;
        <select id="second" name="second" required><option value=""></option><option value="c">CP</option><option value="c++">C++</option>
    <option value="Java">Java</option><option value="DS">DS</option><option value="HTML">HTML</option><option value="Css">CSS</option> </select>
        &nbsp;
        <select id="third" name="third" required><option value=""></option><option value="c">CP</option><option value="c++">C++</option>
    <option value="Java">Java</option><option value="DS">DS</option><option value="HTML">HTML</option><option value="Css">CSS</option> </select>
        &nbsp;
        <select id="fourth" name="fourth" required><option value=""></option><option value="c">CP</option><option value="c++">C++</option>
    <option value="Java">Java</option><option value="DS">DS</option><option value="HTML">HTML</option><option value="Css">CSS</option> </select>
        &nbsp;
        <select id="fifth" name="fifth" required><option value=""></option><option value="c">CP</option><option value="c++">C++</option>
    <option value="Java">Java</option><option value="DS">DS</option><option value="HTML">HTML</option><option value="Css">CSS</option> </select>
        &nbsp;
       <br>
        <input type="checkbox"  id="checkbox" name="rememberpassword" >Do you agree all the data<br>
        <input type="submit" value="Log In" name="submit"/>
    </form>
</div>
</body>
</html>
