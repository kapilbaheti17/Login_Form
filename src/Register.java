

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.sql.*;
import java.util.logging.Logger;
/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	Connection con;
	Statement st;
    ResultSet rs;
    public void init(ServletConfig config) throws ServletException
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exercise_4","root","root");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        } 
        catch (SQLException ex) {
        	System.out.println(ex);
        }
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            String s = request.getParameter("username");
            String pass = request.getParameter("pass");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String sql = "insert into sign_up values('"+s+"','"+pass+"','"+email+"','"+phone+"')";
            st = con.createStatement();
            st.executeUpdate(sql);
            response.sendRedirect("success.jsp");
        } finally {
            out.close();
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
           System.out.println(ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
