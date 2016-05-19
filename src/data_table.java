

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class data_table
 */
@WebServlet("/data_table")
public class data_table extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public data_table() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out = response.getWriter();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exercise_4","root","root");
			Statement st = con.createStatement();
			String sql = "SELECT * from sign_up";
			ResultSet rs;
			rs = st.executeQuery(sql);
			out.println("<center>");
			out.println("<h3>Data in Table</h3>");
			out.println("<table border='2'>");
			out.println("<tr><th>User Name</th><th>Email ID</th><th>Phone Number</th></tr>");
			while(rs.next())
			{
				out.println("<tr>");
				out.println("<td>"+rs.getString("User_Name")+"</td>");
				out.println("<td>"+rs.getString("Email_ID")+"</td>");
				out.println("<td>"+rs.getString("Phone Number")+"</td>");
				out.println("</tr>");
			}
			rs.close();
			out.println("</table>");
			out.println("</center>");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
