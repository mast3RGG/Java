package jdbcscrollableresultset;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import morgocialinutil.ClassJDBCUtil;

public class ScrollableApp {
	public static void main(String[] args) {

		Connection connection = null;
		Statement statm = null;
		ResultSet resultSet = null;

		Scanner scan = null;

		try {
			connection = ClassJDBCUtil.getConnectionJDBC();

			if (connection != null)
				statm = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

			String sqlQuery = "select sid , sname , sage , sadress from student";

			if (statm != null) {
				resultSet = statm.executeQuery(sqlQuery);
			}

			if (resultSet != null) {
				
				System.out.println("Ascending records ....");
				
				System.out.println("ID\tName\t\tAge\t Adress\t");
				while (resultSet.next()) {
					System.out.println(resultSet.getInt("sid") + "\t" + resultSet.getString("sname") + "\t\t"
							+ resultSet.getInt("sage") + "\t" + resultSet.getString("sadress"));
				}

				System.out.println();
				System.out.println("Descending records ....");
				
				System.out.println("ID\tName\t\tAge\t Adress\t");
				while (resultSet.previous()) {
					System.out.println(resultSet.getInt("sid") + "\t" + resultSet.getString("sname") + "\t\t"
							+ resultSet.getInt("sage") + "\t" + resultSet.getString("sadress"));
				}
				
				System.out.println();
				resultSet.first();
				System.out.println(resultSet.getInt("sid") + "\t" + resultSet.getString("sname") + "\t\t"
						+ resultSet.getInt("sage") + "\t" + resultSet.getString("sadress"));
			
				resultSet.last();
				System.out.println(resultSet.getInt("sid") + "\t" + resultSet.getString("sname") + "\t\t"
						+ resultSet.getInt("sage") + "\t" + resultSet.getString("sadress"));
				
				resultSet.absolute(3);
				System.out.println(resultSet.getInt("sid") + "\t" + resultSet.getString("sname") + "\t\t"
						+ resultSet.getInt("sage") + "\t" + resultSet.getString("sadress"));
				
				resultSet.relative(2);
				System.out.println(resultSet.getInt("sid") + "\t" + resultSet.getString("sname") + "\t\t"
						+ resultSet.getInt("sage") + "\t" + resultSet.getString("sadress"));
			
				resultSet.absolute(7);
				System.out.println(resultSet.getInt("sid") + "\t" + resultSet.getString("sname") + "\t\t"
						+ resultSet.getInt("sage") + "\t" + resultSet.getString("sadress"));
				
				resultSet.absolute(-5);
				System.out.println(resultSet.getInt("sid") + "\t" + resultSet.getString("sname") + "\t\t"
						+ resultSet.getInt("sage") + "\t" + resultSet.getString("sadress"));
				
				resultSet.first();
				System.out.println(resultSet.getInt("sid") + "\t" + resultSet.getString("sname") + "\t\t"
						+ resultSet.getInt("sage") + "\t" + resultSet.getString("sadress"));
				
				resultSet.absolute(-2);
				System.out.println(resultSet.getInt("sid") + "\t" + resultSet.getString("sname") + "\t\t"
						+ resultSet.getInt("sage") + "\t" + resultSet.getString("sadress"));
				
				resultSet.absolute(-4);
				System.out.println(resultSet.getInt("sid") + "\t" + resultSet.getString("sname") + "\t\t"
						+ resultSet.getInt("sage") + "\t" + resultSet.getString("sadress"));
			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ClassJDBCUtil.closeAllResourses(connection, statm, resultSet);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
