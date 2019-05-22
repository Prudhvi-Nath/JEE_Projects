<!DOCTYPE html>
<html lang="en">
<link rel="stylesheet" href="style.css">
<head>
    <meta charset="UTF-8">
    <title>Faculty login</title>

</head>
<body>

<div id="studentlogin">
    <h1 style="text-align: center">Faculty Login Form</h1>
    <form action="./teachlog" method="POST" target='_parent'>
        <span>Enter Faculty ID:  </span><input type="text" name="facultyid"  placeholder="enter your id" required><br><br>
        <span>Enter Faculty Password:  </span><input type="password" name="facultypassword" placeholder="enter your password" required><br><br>
        <input type="checkbox" id="checkbox" name="rememberpassword">Remember password<br>
        <input type="submit" value="Log In" name="submit"/>
    </form>
</div>
</body>
</html>