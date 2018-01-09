<%@include file="/init.jsp" %>

<portlet:actionURL name="addRegistration" var="registerURL" windowState="maximized" />

<form action="<%= registerURL.toString() %>" id="<portlet:namespace/>RegisterForm" method="post">
    <input type="submit" value="Register" name="RegisterButton" />
</form>

<liferay-ui:search-container emptyResultsMessage="there-are-no-products" delta="5">
	<liferay-ui:search-container-results>
	<%
	List<PRRegistration> tempResults = ActionUtil.getRegistration(renderRequest);
	results = ListUtil.subList(tempResults, searchContainer.getStart(), searchContainer.getEnd());
	total = tempResults.size();
	pageContext.setAttribute("results", results);
	pageContext.setAttribute("total", total);
	%>
	</liferay-ui:search-container-results>
	
	<liferay-ui:search-container-row className="it.ariadne.prova.registration.model.PRRegistration" keyProperty="registrationId" modelVar="registration">
		<liferay-ui:search-container-column-text name="product-type" value="<%= PRProductLocalServiceUtil.getPRProduct(registration.getProductId()).getProductName() %>"/>
		<liferay-ui:search-container-column-text name="product-id" property="productId"/>
		<liferay-ui:search-container-column-text name="registration-serial" property="serialNumber"/>
		<liferay-ui:search-container-column-text name="where-purchase" property="wherePurchased"/>
		<liferay-ui:search-container-column-text name="how-hear" property="howHear"/>
		<liferay-ui:search-container-column-date name="date-purchased" value="<%= registration.getDatePurchased() %>" />
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator/>

</liferay-ui:search-container>