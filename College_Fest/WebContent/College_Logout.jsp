

<% 

	session.invalidate();
application.removeAttribute("name");
application.removeAttribute("gender");
application.removeAttribute("age");
application.removeAttribute("blood_grp");
application.removeAttribute("qualification");
application.removeAttribute("department");

application.removeAttribute("role");
application.removeAttribute("exp");

	response.sendRedirect("College_Event_Admin.html");

	
	
			
%>
