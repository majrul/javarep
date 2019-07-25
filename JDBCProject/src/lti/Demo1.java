package lti;
import java.sql.*;
import java.time.LocalDate;
public class Demo1 { 
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="hr";
		String password="hr";
		// establish connection
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("connected");
		Statement st=con.createStatement(); // generate Statment to execute sql
		ResultSet rs=st.executeQuery("select * from account");
		while(rs.next())  // goes to next record if exist it returns true
		{
			int id=rs.getInt("aid");
			String n=	rs.getString("aname");
			java.sql.Date dd=rs.getDate(3);
			LocalDate d=rs.getDate(3).toLocalDate();
			double bal=rs.getDouble(4);
			System.out.println(id +" "+n +" "+d +" "+bal);
			System.out.println("---------------------------------------");
		}
		con.close();
	}

}
