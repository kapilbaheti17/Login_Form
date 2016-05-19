

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	public String usname;
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("rem")!=null)
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exercise_4","root","root");
				usname = request.getParameter("username");
				String pass = request.getParameter("pass");
				Statement st = con.createStatement();
				String sql = "Select User_Name,Password from sign_up where User_Name='"+usname+"'and Password='"+pass+"'";
				ResultSet rs;
				rs = st.executeQuery(sql);
				if(rs.next())
				{
					HttpSession session = request.getSession(true);
					session.setAttribute(usname,pass);
					Cookie cookie = new Cookie(usname,pass);
					cookie.setMaxAge(60*60*24);
					response.addCookie(cookie);
					request.setAttribute("uname",usname);
					RequestDispatcher rd = request.getRequestDispatcher("/valid_with_cookie");
					rd.forward(request,response);
				}
				else
				{
					response.sendRedirect("invalid.jsp");
				}
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch(SQLException em) {
				em.printStackTrace();
			}
		}
		else
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exercise_4","root","root");
				usname = request.getParameter("username");
				String pass = request.getParameter("pass");
				Statement st = con.createStatement();
				String sql = "Select User_Name,Password from sign_up where User_Name='"+usname+"'and Password='"+pass+"'";
				ResultSet rs;
				rs = st.executeQuery(sql);
				if(rs.next())
				{
					HttpSession session = request.getSession();
					session.setAttribute(usname,pass);
					request.setAttribute("uname",usname);
					RequestDispatcher rd1 = request.getRequestDispatcher("/valid");
					rd1.forward(request,response);
				}
				else
				{
					response.sendRedirect("invalid.jsp");
				}
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch(SQLException em) {
				em.printStackTrace();
			}
		}
	}

}
