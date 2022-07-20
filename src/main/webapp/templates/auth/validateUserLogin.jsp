<%
	if(session.getAttribute("user") == null) pageContext.forward("login.jsp");
%>