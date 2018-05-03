import java.io.*;
import javax.servlet.*;
public class SecondServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)
	{
	     try{
		PrintWriter pw=res.getWriter();
		pw.println("<html><body bgcolor=red text=yellow><h1>");
		pw.println("Welcome");
		pw.println("</h1><body></html>");		
	            }catch(Exception e)
		{
			System.err.println(e);
		}
	}
}