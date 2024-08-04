package morgocialin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import morgocialinutil.ClassJDBCUtil;

public class JavaAppDelete {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Connection connection = null;
		PreparedStatement prstm = null;
		
		try {
			connection = ClassJDBCUtil.getConnectionJDBC();
		if (connection != null)
		{
			
			String mySQlQuery = "delete from student where sid = ?";
			prstm = connection.prepareStatement(mySQlQuery);
			
			System.out.println("Enter the id to delete from db");
			int id = scan.nextInt();
			prstm.setInt(1, id);
			int rowCount = prstm.executeUpdate();
			System.out.println("The row affected are :: " + rowCount);
			
		}
		} catch (SQLException sql) {
			sql.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			try {
			System.out.printf("\n \n%15s", "Closing the resourses");
			ClassJDBCUtil.closeAllResourses(connection, prstm, null);
			}catch(SQLException sql)
			{
				sql.printStackTrace();
			}
			}

	}
}
