package it.ariadne.prova.helloyou.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Event;
import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletMode;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.PortletURL;
import javax.portlet.ProcessEvent;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class HelloYouPortlet extends GenericPortlet{
	private final static Log _log = LogFactory.getLog(HelloYouPortlet.class);
	private final static String DEFAULT_USER ="Guest";
	protected String editJSP;
	protected String viewJSP;

	public void init() throws PortletException {
		if(_log.isInfoEnabled()){
			_log.info("init method with parameters " + getInitParameter("view-jsp") + " and " + getInitParameter("edit-jsp"));
		}
		editJSP = getInitParameter("edit-jsp");
		viewJSP = getInitParameter("view-jsp");
	}

	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		if(_log.isInfoEnabled()){
			_log.info("doView method getting information from PortletPreferences");
		}
		PortletPreferences prefs = renderRequest.getPreferences();
		String username = (String) prefs.getValue("name", "no"); // Sets username to the property value "name", otherwise it is set to "no" (thus, username is empty)
		if (username.equalsIgnoreCase("no") || username.equals("")) {
			if(_log.isInfoEnabled()){
				_log.info("username value is " + username + ", setting default user name");
			}
			username = DEFAULT_USER;
		}
		renderRequest.setAttribute("userName", username);
		include(viewJSP, renderRequest, renderResponse);
	}


	protected void include(String path, RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		PortletRequestDispatcher portletRequestDispatcher =	getPortletContext().getRequestDispatcher(path);
		if (portletRequestDispatcher == null) {
			_log.error(path + " is not a valid include");
		}
		else {
			portletRequestDispatcher.include(renderRequest, renderResponse);
		}
	}

	public void doEdit(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		if(_log.isInfoEnabled()){
			_log.info("doEdit method, setting actionURL");
		}
		renderResponse.setContentType("text/html");
		PortletURL addNameURL = renderResponse.createActionURL();
		addNameURL.setParameter("addName", "addName");
		renderRequest.setAttribute("addNameURL", addNameURL.toString());
		include(editJSP, renderRequest, renderResponse);
	}
	
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		if(_log.isInfoEnabled()){
			_log.info("processAction method");
		}		
		String addName = actionRequest.getParameter("addName");
		if (addName != null) {
			PortletPreferences prefs = actionRequest.getPreferences();
			prefs.setValue("name", actionRequest.getParameter("username"));
			prefs.store();
			actionResponse.setPortletMode(PortletMode.VIEW);
		}
	}
	
	@ProcessEvent(qname="{it.ariadne.politi.ipc-baseball.event}ipc.pitch")
	public void catchBall(EventRequest request, EventResponse response) {
		Event event = request.getEvent();
		String pitch = (String) event.getValue();
		if(_log.isInfoEnabled()){
			_log.info("catchBall method with event: " + pitch);
		}
		response.setRenderParameter("pitch", pitch);
	}

}