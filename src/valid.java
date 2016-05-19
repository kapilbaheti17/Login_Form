

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class valid
 */
@WebServlet("/valid")
public class valid extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public valid() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println("<h2>Session Created</h2><br />");
		String s = (String)request.getAttribute("uname");
		pw.print("<h4>Welcome: "+s+"</h4>");
		pw.println("<form action='logout.jsp' method='post'>");
		pw.println("<input type='submit' value='Logout' name='log_button'><br />");
		pw.println("</form>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
