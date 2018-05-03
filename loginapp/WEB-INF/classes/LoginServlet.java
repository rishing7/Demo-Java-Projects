import java.io.*;
import java.sql.*;
import javax.servlet.*;
public class LoginServlet extends GenericServlet
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
			PrintWriter pw=res.getWriter();
			  String s1=req.getParameter("uname");
			 String s2=req.getParameter("pword");
			PreparedStatement pstmt=con.prepareStatement("select * from uinfo where uname=? and pword=?");
			pstmt.setString(1,s1);
			pstmt.setString(2,s2);
			ResultSet rs=pstmt.executeQuery();
			
			pw.println("<html><body bgcolor=yellow text=red></h1>");
			if(rs.next())
			{
				pw.println("Welcome     "   +   s1);
			}
			else
			{
				pw.println("Invalid uname/pword");
			}
			pw.println("</h1></body></html>");
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}
}