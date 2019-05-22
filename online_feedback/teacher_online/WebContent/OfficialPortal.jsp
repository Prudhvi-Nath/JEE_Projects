<%
	String line;
    if((line=(String)session.getAttribute("teacid"))!= null)
    {
    	request.getSession().invalidate();
    	ServletContext st=request.getServletContext();
    	st.removeAttribute("sidteac");
		
		
    	
    	
    	st.removeAttribute("name");
    	st.removeAttribute("password");
		st.removeAttribute("gender");
		st.removeAttribute("date");
		st.removeAttribute("ug");
		st.removeAttribute("spec");
		st.removeAttribute("socialpro");
		
		st.removeAttribute("link");
		st.removeAttribute("january");
		st.removeAttribute("febuary");
		st.removeAttribute("march");
		st.removeAttribute("april");
		st.removeAttribute("may");
		st.removeAttribute("june");
		st.removeAttribute("july");
		st.removeAttribute("augest");
		st.removeAttribute("september");
		st.removeAttribute("october");
		st.removeAttribute("november");
		st.removeAttribute("december");
		st.removeAttribute("total");
		st.removeAttribute("telugu");
		st.removeAttribute("hindi");
		st.removeAttribute("english");
		st.removeAttribute("maths");
		st.removeAttribute("science");
		st.removeAttribute("social");
		st.removeAttribute("total");
		st.removeAttribute("percentage");
		st.removeAttribute("id");
		st.removeAttribute("first");
		st.removeAttribute("two");
		st.removeAttribute("three");
		st.removeAttribute("four");
		st.removeAttribute("five");
		st.removeAttribute("six");
		st.removeAttribute("seven");
		st.removeAttribute("eight");
		st.removeAttribute("nine");
		st.removeAttribute("ten");
		st.removeAttribute("eleven");
		st.removeAttribute("twelve");
		st.removeAttribute("thirteen");
		st.removeAttribute("fourteen");
		st.removeAttribute("fiveteen");
		st.removeAttribute("sixteen");
		st.removeAttribute("seventeen");
		st.removeAttribute("eighteen");
		st.removeAttribute("nineteen");
		st.removeAttribute("twenty");
		st.removeAttribute("twentyone");
		st.removeAttribute("twentytwo");
		st.removeAttribute("twentythree");
		st.removeAttribute("sidteac");
		st.removeAttribute("name");
		st.removeAttribute("dob");
		st.removeAttribute("gender");
		st.removeAttribute("dept");
		st.removeAttribute("branch");
		st.removeAttribute("bloodgrp");
		st.removeAttribute("join");
		st.removeAttribute("obj");
		st.removeAttribute("obj1");
		st.removeAttribute("obj2");
		st.removeAttribute("obj3");
		st.removeAttribute("pass");
		
		st.removeAttribute("twentyfour");
		st.removeAttribute("twentyfive");
		st.removeAttribute("tid");
		st.removeAttribute("cmt");
		st.removeAttribute("dateoff");
	
	
		
		
		
       
    }
%>
<% response.sendRedirect("OfficialPortal.html"); %>