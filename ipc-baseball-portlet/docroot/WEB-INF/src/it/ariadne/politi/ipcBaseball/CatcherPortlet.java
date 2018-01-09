package it.ariadne.politi.ipcBaseball;

import java.io.IOException;

import javax.portlet.Event;
import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.ProcessEvent;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CatcherPortlet extends GenericPortlet {

	protected String viewJSP;
	private static Log _log = LogFactory.getLog(CatcherPortlet.class);

	public void init() throws PortletException {
		if(_log.isInfoEnabled()){
			_log.info("init method with parameter " + getInitParameter("view-jsp"));
		}
		viewJSP = getInitParameter("view-jsp");
	}

	public void doView(RenderRequest req, RenderResponse res) throws IOException, PortletException {
		if(_log.isInfoEnabled()){
			_log.info("doView method- rendering " + CatcherPortlet.class);
		}
		include(viewJSP, req, res);
	}

	protected void include(String path, RenderRequest req, RenderResponse res) throws IOException, PortletException {
		PortletRequestDispatcher prd = getPortletContext().getRequestDispatcher(path);
		if (prd == null) {
			_log.error(path + " is not a valid include");
		}
		else {
			prd.include(req, res);
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
