<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet" %>
<portlet:defineObjects />

<% String pitch = (String) renderRequest.getParameter("pitch"); %>

<jsp:useBean id="userName" class="java.lang.String" scope="request" />


<p>This is the Hello You portlet.</p>
<p>Hello <%= userName %>!</p>
<br/>
<p><%
	if(pitch!=null){
	%>
		<%= pitch %>!
	<%
	} else{
	%>	...waiting for pitch!
	<%
	}
%></p>