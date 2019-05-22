<%
	String line;
    if((line=(String)session.getAttribute("id"))!= null)
    {
    	request.getSession().invalidate();
    	ServletContext st=request.getServletContext();
    	st.removeAttribute("stname");
    	st.removeAttribute("name");
    	st.removeAttribute("password");
		st.removeAttribute("gender");
		st.removeAttribute("date");
		st.removeAttribute("ug");
		st.removeAttribute("spec");
		st.removeAttribute("socialpro");
		st.removeAttribute("obj");
		st.removeAttribute("obj1");
		st.removeAttribute("obj2");
		st.removeAttribute("obj3");
		st.removeAttribute("obj4");
		
		
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
		st.removeAttribute("tot");
		st.removeAttribute("percentage");
		st.removeAttribute("id");
		

		
		
		
       
    }
%>
<% response.sendRedirect("OfficialPortal.html"); %>