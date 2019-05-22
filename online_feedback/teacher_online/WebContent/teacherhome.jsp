<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>StudentHome</title>

</head>
<body style="text-align: center;background-color: lightslategrey">
<hr><h1><%=application.getAttribute("name") %></h1></hr><br>
<article>

    <h2><%=application.getAttribute("sidteac") %><br>
        Date of birth:<%=application.getAttribute("dob") %><br>

        Gender:<%=application.getAttribute("gender") %><br>
        Department:<%=application.getAttribute("dept") %><br>
        Branch:<%=application.getAttribute("branch") %><br>
        Blood grounp:<%=application.getAttribute("bloodgrp") %><br>
        Joined:<%=application.getAttribute("join") %><br>
       Profienciency in:<%=application.getAttribute("obj") %>,<%=application.getAttribute("obj1") %>,<%=application.getAttribute("obj2") %>,<%=application.getAttribute("obj3") %><br>




    </h2>

</article>

</body>
</html>
<style>

    article{

        color: black;
        font-family: "Bookman Old Style";
    }

</style>