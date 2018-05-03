import java.io.*;
import javax.servlet.*;
public class ImageServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)
	{
	try{
		FileInputStream fis=new FileInputStream("D:/JAVAPROGRAMS/abc.JPG");
		int n=fis.available();
		byte b[]=new byte[n];
		fis.read(b);
		ServletOutputStream sos=res.getOutputStream();
		sos.write(b);
	}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}