<!DOCTYPE html>
<html lang="en">
<link rel="stylesheet" href="style.css">
<head>
    <meta charset="UTF-8">
    <title>Student Feedback</title>
</head>

<body style="text-align: center;margin-top: 40px">
<h4>Rate according to the performance:1.very bad 2.Satisfactory 3.Good 4.Very Good 5.Excellent</h4><br>
<form action="./sf" method='POST'>
        <select name="selectionstud" target='_parent' required>
            <option value="">Select Option</option>
            <option value="<%=application.getInitParameter("first") %>"><%=application.getInitParameter("first") %></option>
            <option value="<%=application.getInitParameter("second") %>"><%=application.getInitParameter("second") %></option>
            <option value="<%=application.getInitParameter("third") %>"><%=application.getInitParameter("third") %></option>
            <option value="<%=application.getInitParameter("fourth") %>"><%=application.getInitParameter("fourth") %></option>
            <option value="<%=application.getInitParameter("fifth") %>"><%=application.getInitParameter("fifth") %></option>
            

            </select>&nbsp;&nbsp;&nbsp;<input type="submit"  value="submit"/><br><br>
            
            </form>
           

</body>
</html>