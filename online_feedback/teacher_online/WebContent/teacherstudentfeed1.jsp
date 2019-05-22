<html>
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
            
            <td><%=application.getAttribute("one") %></td>
            <td><%=application.getAttribute("two") %></td>
            <td><%=application.getAttribute("three") %> </td>
            <td><%=application.getAttribute("four") %></td>
            <td><%=application.getAttribute("five") %> </td>

        </tr>
        <tr>
            <td>
                JAVA
            </td>
            <td><%=application.getAttribute("six") %> </td>
            <td><%=application.getAttribute("seven") %> </td>
            <td><%=application.getAttribute("eight") %> </td>
            <td><%=application.getAttribute("nine") %> </td>
            <td><%=application.getAttribute("ten") %> </td>

        </tr>
        <tr>
            <td>
                Data Structures
            </td>
            <td><%=application.getAttribute("eleven") %> </td>
            <td><%=application.getAttribute("twelve") %> </td>
            <td><%=application.getAttribute("thirteen") %> </td>
            <td><%=application.getAttribute("fourteen") %> </td>
            <td><%=application.getAttribute("fiveteen") %> </td>

        </tr>
        <tr>
            <td>
                Operating System
            </td>
            <td><%=application.getAttribute("sixteen") %> </td>
            <td><%=application.getAttribute("seventeen") %> </td>
            <td><%=application.getAttribute("eighteen") %> </td>
            <td><%=application.getAttribute("nineteen") %></td>
            <td><%=application.getAttribute("twenty") %> </td>

        </tr>
        <tr>
            <td>
                Web Technology
            </td>
            <td><%=application.getAttribute("twentyone") %> </td>
            <td><%=application.getAttribute("twentytwo") %> </td>
            <td><%=application.getAttribute("twentythree") %> </td>
            <td><%=application.getAttribute("twentyfour") %> </td>
            <td><%=application.getAttribute("twentyfive") %></td>

        </tr>
    </table>

    <span style="color: black;font-size: 18px;margin-left: 410px;">Student Comment:</span><textarea rows="10" cols="60"  style="font-size: 20px;font-family: Arial;margin-top: 40px;border-radius: 10px;background-color: cadetblue;outline: none ">


<%=application.getAttribute("cmt") %></textarea><br><br>
    

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


</html>