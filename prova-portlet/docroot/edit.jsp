<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet" %>
<jsp:useBean id="addNameURL" class="java.lang.String" scope="request" />

<portlet:defineObjects />
<form id="<portlet:namespace />helloForm" action="<%= addNameURL %>" method="post">
	<table>
		<tr>
			<td>Name:</td>
			<td><input type="text" name="<portlet:namespace />username"></td>
		</tr>
	</table>
	<input type="submit" id="nameButton" title="Add Name" value="Add Name">
</form>