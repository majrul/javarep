package lti;
import java.sql.*;
import java.time.LocalDate;
public class Demo2 { 
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="hr";
		String password="hr";
		// establish connection
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("connected");
		CallableStatement cst=con.prepareCall("{call findbalance(?,?)}");
		cst.setInt(1, 101);
		cst.registerOutParameter(2, Types.DOUBLE);
		boolean ch=cst.execute();
		System.out.println("Procedure called successfully "+ch);
		
		double bal=cst.getDouble(2);
		System.out.println("Balance of accno 101 is Rs."+bal);
		con.close();
	}

}
