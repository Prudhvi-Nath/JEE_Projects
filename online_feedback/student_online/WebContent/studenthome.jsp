<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>StudentHome</title>

</head>
<body style="text-align: center;background-color: lightslategrey">
<hr><h1>Mr.<%=application.getAttribute("stname") %></h1></hr><br>
<article>
    <h2>ID:<%=session.getAttribute("id") %><br>
        Date of birth:<%=application.getAttribute("date") %><br>
        Gender:<%=application.getAttribute("gender") %><br>
        UG:<%=application.getAttribute("ug") %><br>
        Specialization:<%=application.getAttribute("spec") %><br>
        Techonlogies You known:<%=application.getAttribute("obj") %>,<%=application.getAttribute("obj1") %>,<%=application.getAttribute("obj2") %>,<%=application.getAttribute("obj3") %>,<%=application.getAttribute("obj4") %><br>
        Social Profiles:<img src="github.png" width="30px" height="30px"><a href="https://github.com/Prudhvi-Nath<%=application.getAttribute("link") %>" style="text-decoration: none;color: black" target="_parent"><%=application.getAttribute("socialpro") %></a>



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
