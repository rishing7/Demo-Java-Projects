import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
			java.sql.Statement stmt = con.createStatement();
			stmt.execute("create table person(Name char(10),Gender char(5),Age number(10))");
			System.out.println("Table Created Successfully!!!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		}
	}
}
