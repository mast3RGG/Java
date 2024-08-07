package jdbcbatchupdate;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import morgocialinutil.ClassJDBCUtil;

public class BatchUpdateUsingPreparedStatement {
	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement prstm = null;
		ResultSet resultSet = null;

		Scanner scan = null;
		try {
			connection = ClassJDBCUtil.getConnectionJDBC();

			String sqlQuery = "insert into employee (name , age , adress) values(?,?,?)";
			if (connection != null) {
				prstm = connection.prepareStatement(sqlQuery);
			}

			if (prstm != null) {
				scan = new Scanner(System.in);

				while (true) {

					System.out.print("Enter the name :: ");
					String name = scan.next();

					System.out.print("Enter the age :: ");
					Integer age = scan.nextInt();

					System.out.println("Enter the adress");
					String adress = scan.next();

					prstm.setString(1, name);
					prstm.setInt(2, age);
					prstm.setString(3, adress);
					prstm.addBatch();

					System.out.println("Do you want to add more persons ? (yes , no)");

					String ans = scan.next();
					if (ans.equalsIgnoreCase("no"))
						break;

				}
				
				prstm.executeBatch();
				System.out.println("Recorded added succesfully ....");

			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ClassJDBCUtil.closeAllResourses(connection, prstm, resultSet);
				scan.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
