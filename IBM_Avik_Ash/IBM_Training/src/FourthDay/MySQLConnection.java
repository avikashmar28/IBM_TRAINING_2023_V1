package FourthDay;
import java.sql.*;
public class MySQLConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/IBM_Training_Avik","root","123456789");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from Employee");
		System.out.println(rs.next());
		//System.out.println(rs.get);
		while(rs.next()) {
			System.out.println("Employee ID is:" +rs.getInt(1));
			System.out.println("FirstName is:" +rs.getString(2));
			System.out.println(rs.getString("FirstName"));
			System.out.println(rs.getInt(1) + ":" + rs.getString(2) + ":" +rs.getString(3) + ":" + rs.getString(4));
		}
		
		//Creating the table
		//Statement s=con.createStatement();
		//String query="Create table Avik_IBM1 (ID integer,FirstName Varchar(30))";
		String query1="insert into Avik_IBM1 values(10,'AvikAsh')";
		String query2="update Avik_IBM1 set id=20 where FirstName='AvikAsh'";
		//int ret=stmt.executeUpdate(query1);
		int ret=stmt.executeUpdate(query2);
		System.out.println(ret);
	}

}
