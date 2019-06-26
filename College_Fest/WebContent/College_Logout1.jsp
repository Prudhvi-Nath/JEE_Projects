		
		<%
		session.invalidate();
		application.removeAttribute("stname");
       application.removeAttribute("gender"); 
        application.removeAttribute("dept"); 
        
        application.removeAttribute("mobileno"); 
        application.removeAttribute("event");
        application.removeAttribute("count");
        application.removeAttribute("namestaffing");
        
        application.removeAttribute("staffid");
		application.removeAttribute("namestaffing");
		application.removeAttribute("gend");
		application.removeAttribute("mobilen");
		application.removeAttribute("evnt");
		application.removeAttribute("orgid1");
		application.removeAttribute("depts1");
		application.removeAttribute("staffid1");
		application.removeAttribute("namestaffing1");
		application.removeAttribute("gend1");
		application.removeAttribute("mobilen11");
		application.removeAttribute("evnt1");

		application.removeAttribute("orgid2");
		application.removeAttribute("depts2");
		
		application.removeAttribute("staffid2");
		application.removeAttribute("namestaffing2");
		application.removeAttribute("gend2");
		application.removeAttribute("mobilen12");
		application.removeAttribute("evnt2");
		application.removeAttribute("orgid3");
		application.removeAttribute("depts3");
		application.removeAttribute("staffid3");
		application.removeAttribute("namestaffing3");
		application.removeAttribute("gend3");
		application.removeAttribute("mobilen13");
		application.removeAttribute("evnt3");

		application.removeAttribute("orgid4");
		application.removeAttribute("depts4");
		application.removeAttribute("staffid4");
		application.removeAttribute("namestaffing4");
		application.removeAttribute("gend4");
		application.removeAttribute("mobilen14");
		application.removeAttribute("evnt4");
		application.removeAttribute("orgid5");
		application.removeAttribute("depts5");
		
		
	response.sendRedirect("College_Login.html");
%>