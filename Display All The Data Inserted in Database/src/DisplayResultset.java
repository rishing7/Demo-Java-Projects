import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DisplayResultset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
			java.sql.Statement stmt = con.createStatement();
			ResultSet  rs = stmt.executeQuery("SELECT * from person");
			ResultSetMetaData rm = rs.getMetaData();//to know about the column number.
			int cols = rm.getColumnCount();
			for(int i=1; i<=cols; i++)
			{
				System.out.print(rm.getColumnName(i)+'\t');
			}
			while(rs.next())
			{
				for(int i=1; i<=cols; i++)
				{
					System.out.print(rs.getString(i)+'\t');
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		}
	}
}
