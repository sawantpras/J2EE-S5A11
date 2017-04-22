

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
        
public class myServlet extends HttpServlet
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
    {
        // receive request from html client
        String cname = request.getParameter("username"); //in this case, parameter username's value = Ram
 
        //process it
        
        //Give response back to html client
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<h1 style='color:green'>Hello " + cname + "</h1>");
    }
}
