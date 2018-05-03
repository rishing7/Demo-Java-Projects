import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TypeIV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
			System.out.println("Coonnection Established Successfully!!!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		}
	}
}
