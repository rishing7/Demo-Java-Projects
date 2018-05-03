import java.io.*;
import java.sql.*;
import javax.servlet.*;
public class RegServlet extends GenericServlet
{
	Connection con;
	public void init()
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@Rishi:1521:XE","system","manager");

		     }catch(Exception e)
			{
				System.err.println(e);
			}
	}
	public void service(ServletRequest req,ServletResponse res)
	{
		try{
			String s1=req.getParameter("fname");
			String s2=req.getParameter("lname");
			String s3=req.getParameter("uname");
			String s4=req.getParameter("pword");
			PreparedStatement pstmt=con.prepareStatement("insert into uinfo values(?,?,?,?)");
			pstmt.setString(1,s1);
			pstmt.setString(2,s2);
			pstmt.setString(3,s3);
			pstmt.setString(4,s4);
			pstmt.executeUpdate();	
			PrintWriter pw=res.getWriter();
			pw.println("<html><body bgcolor=yellow text=black><centre>");
			pw.println("<h1>You have registered successfully</h1>");
			pw.println("<a href=login.html>Login</a>");
			pw.println("</centre></body></html>");
		      }catch(Exception e)
			{
				System.err.println(e);
			}
	}
}