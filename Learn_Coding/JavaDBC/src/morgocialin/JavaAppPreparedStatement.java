package morgocialin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import morgocialinutil.ClassJDBCUtil;

public class JavaAppPreparedStatement {
	
	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		Connection connection = null;
		PreparedStatement prstm = null;
		
		try {
			connection = ClassJDBCUtil.getConnectionJDBC();
		if (connection != null)
		{
			System.out.print("Enter the name of studenet : ");
			String name = scan.next();
			System.out.print("Enter age of student : ");
			Integer age = scan.nextInt();
			System.out.print("Enter the adress of student : ");
			String adress = scan.next();
			String mySQlQuery = "insert into student(sname , sage, sadress) values (?,?,?)";
			prstm = connection.prepareStatement(mySQlQuery);
			prstm.setString(1, name);
			prstm.setInt(2, age);
			prstm.setString(3, adress);
			int rowCount = prstm.executeUpdate();
			System.out.println("The row affected are :: " + rowCount);
			
		}
		} catch (SQLException sql) {
			sql.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			System.out.printf("\n \n%15s", "Closing the resourses");
			ClassJDBCUtil.closeAllResourses(connection, prstm, null);
		}

	}
}
