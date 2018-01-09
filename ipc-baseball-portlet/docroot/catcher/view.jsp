<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />
<%
String pitch = (String) renderRequest.getParameter("pitch");
%>
<p>And the pitch is....</p>
<p><%
	if (pitch != null) {
		%>
		<%= pitch %>!
		<%
	} else {
		%>
		... waiting for pitch.
		<%
	}
%></p>