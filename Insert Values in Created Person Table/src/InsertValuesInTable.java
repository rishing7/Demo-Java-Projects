import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertValuesInTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
			java.sql.Statement stmt = con.createStatement();
			stmt.executeUpdate("insert into person values('Ram','m',23)");
			stmt.executeUpdate("insert into person values('Sita','f',23)");
			stmt.executeUpdate("insert into person values('Anu','f',20)");
			System.out.println("Values inserted Successfully!!!");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		}
	}
}
