<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<jsp:useBean id="actionBaseballURL" class="java.lang.String" scope="request" />

<portlet:defineObjects />

<p>Click the link below to pitch the ball.</p>
	<a href="<%= actionBaseballURL %>">Pitch!</a>