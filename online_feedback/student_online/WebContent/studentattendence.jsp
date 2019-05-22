<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Student Attendence</title>

</head>
<body style="text-align: center">
   <table border="1" align="center" style="border: 4px solid black;font-size: 30px;width: 1000px ">

        <thead>
        <th>Studence Attencence</th>

        </thead>


        
       <tbody>
            <tr>
                <th>Month</th>
                <th>Percentage</th>
            </tr>
        </tbody>
        <tbody>
            <tr>
                <td>January</td>
                <td><%=application.getAttribute("january") %></td>
            </tr>
            <tr>
                <td>Febuary</td>
                <td><%=application.getAttribute("febuary") %></td>

            </tr>
            <tr>
                <td>March</td>
                <td><%=application.getAttribute("march") %></td>

            </tr>
            <tr>
                <td>April</td>
                <td><%=application.getAttribute("april") %></td>

            </tr>
            <tr>
                <td>May</td>
                <td><%=application.getAttribute("may") %></td>

            </tr>
            <tr>
                <td>June</td>
                <td><%=application.getAttribute("june") %></td>

            </tr>
            <tr>
                <td>July</td>
                <td><%=application.getAttribute("july") %></td>

            </tr>
            <tr>
                <td>August</td>
                <td><%=application.getAttribute("augest") %></td>

            </tr>
            <tr>
                <td>September</td>
                <td><%=application.getAttribute("september") %></td>

            </tr>
            <tr>
                <td>October</td>
                <td><%=application.getAttribute("october") %></td>

            </tr>
            <tr>
                <td>November</td>
                <td><%=application.getAttribute("november") %></td>

            </tr>
            <tr>
                <td>December</td>
                <td><%=application.getAttribute("december") %></td>

            </tr>
        <th>Total Percentage per anum</th>
        <td><%=application.getAttribute("total") %></td>
        </tbody>


   </table>
</body>
</html>