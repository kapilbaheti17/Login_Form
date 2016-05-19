

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class valid_with_cookie
 */
@WebServlet("/valid_with_cookie")
public class valid_with_cookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public valid_with_cookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<h2>Cookie is Set</h2>");
		out.println("<h2>Session Created</h2><br />");
		String s = (String)request.getParameter("username");
		out.println("<h3>Welcome: "+s+"</h3>");
		out.println("<form action='logout.jsp' method='post'>");
		out.println("<input type='submit' value='Logout' name='log_button'><br />");
		out.println("</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
