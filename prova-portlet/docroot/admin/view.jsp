<%@include file="/init.jsp" %>

<liferay-ui:success key="productSaved" message="product-saved-successfully" />
<liferay-ui:success key="productDeleted" message="productDeleted" />
<liferay-ui:success key="productUpdated" message="productUpdated" />
<liferay-ui:error key="fields-required" message="fields-required" />
<liferay-ui:error key="error-deleting" message="error-deleting" />
<liferay-ui:error key="error-updating" message="error-updating" />

<portlet:actionURL name="addProduct" var="addProductURL"/>

<aui:form name="fm" action="<%= addProductURL.toString() %>" method="post">

  <aui:fieldset>

    <aui:input name="productName" size="45" />
    <aui:input name="productSerial" size="45" />

    <aui:button-row>
      <aui:button type="submit" />
    </aui:button-row>

  </aui:fieldset>

</aui:form>

<liferay-ui:search-container emptyResultsMessage="there-are-no-products" delta="5">
	<liferay-ui:search-container-results>
	<%
	List<PRProduct> tempResults = ActionUtil.getProducts(renderRequest);
	results = ListUtil.subList(tempResults, searchContainer.getStart(), searchContainer.getEnd());
	total = tempResults.size();
	pageContext.setAttribute("results", results);
	pageContext.setAttribute("total", total);
	%>
	</liferay-ui:search-container-results>
	
	<liferay-ui:search-container-row className="it.ariadne.prova.registration.model.PRProduct" keyProperty="productId" modelVar="product">
		<liferay-ui:search-container-column-text name="product-name" property="productName"/>
		<liferay-ui:search-container-column-text name="product-serial" property="serialNumber"/>
		<liferay-ui:search-container-column-jsp path="/admin/admin_actions.jsp" align="right"/>
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator/>

</liferay-ui:search-container>