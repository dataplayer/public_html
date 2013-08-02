package tschumacher.webapp.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 	<p>A simple servlet to hide paths that would otherwise be exposed to the public.</p>
 * 
 * 	<p>I wanted to try this out so I can make a git repo out of my webapp, but not expose the .git path!</p>
 * 
 * 	@author Timothy Schumacher, Ph.D. <schumact@gmail.com>
 */
public final class HideServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = this.getServletContext().getRequestDispatcher(NONEXISTENT_URL);
		requestDispatcher.forward(req, resp);
	}

	/**
	 * 	<p>A "fake" path so we will get the 404 error page configured for this application.</p>
	 */
	private final static String NONEXISTENT_URL = "/Nonexistent_url.error";
}
