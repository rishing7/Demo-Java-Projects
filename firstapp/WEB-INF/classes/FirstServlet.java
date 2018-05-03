import java.io.*;
import javax.servlet.*;
public class FirstServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)
	{
		try{
			PrintWriter pw=res.getWriter();
			pw.println("Welcome");
		      }catch(Exception e)
			{
				System.err.println(e);
			}
	}
}