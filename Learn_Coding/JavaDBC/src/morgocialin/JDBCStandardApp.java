package morgocialin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import morgocialinutil.ClassJDBCUtil;

public class JDBCStandardApp {
	public static void main(String[] args) throws SQLException, IOException, InterruptedException {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		connection = ClassJDBCUtil.getConnectionJDBC();

		try {

			if (connection != null) {
				statement = connection.createStatement();
			}

			if (statement != null) {
				resultSet = statement.executeQuery("select * from student");
			}

			if (resultSet != null) {
				System.out.printf("%-15s %-15s %-15s %13s", "SID", "SNAME", "SAGE", "SADRESS");
				while (resultSet.next()) {
					System.out.println();
					System.out.printf("%2d %16s %15d %25s", resultSet.getInt(1), resultSet.getString(2),
							resultSet.getInt(3), resultSet.getString(4));
				}
			}
		} catch (SQLException sql) {
			sql.printStackTrace();
		} finally {
			System.out.printf("\n \n%15s", "Closing the resourses");
			ClassJDBCUtil.closeAllResourses(connection, statement, resultSet);
		}

	}
}
