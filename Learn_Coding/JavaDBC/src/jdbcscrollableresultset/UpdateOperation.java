package jdbcscrollableresultset;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import morgocialinutil.ClassJDBCUtil;

public class UpdateOperation {
	public static void main(String[] args) {

		Connection connection = null;
		Statement statm = null;
		ResultSet resultSet = null;

		try {
			connection = ClassJDBCUtil.getConnectionJDBC();

			if (connection != null) {
				statm = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			}

			String sqlSelectQuery = "SELECT * FROM EMPLOYEE";
			if (statm != null) {
				resultSet = statm.executeQuery(sqlSelectQuery);
			}

			System.out.println("Before update");
			if (resultSet != null) {
				System.out.println("ID\tName\tAge\tAdress\t\tSalary");

				while (resultSet.next()) {
					System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3)
							+ "\t" + resultSet.getString(4)+"\t" + resultSet.getInt(5));
				}
			}

			System.in.read();

			// if salary < 3000 = salary + 1000;
			resultSet.beforeFirst();
			if (resultSet != null) {
				while(resultSet.next())
				{
					Integer salary = resultSet.getInt(5);
					Integer modSalary = salary;
					
					if(salary < 3000)
						modSalary += 1000;
					
					resultSet.updateInt(5, modSalary);
					resultSet.updateRow();
				}
			}

			System.out.println("After update");
			if (resultSet != null) {
				System.out.println("ID\tName\tAge\tAdress\tc\tSalary");
				resultSet.beforeFirst();
				while (resultSet.next()) {
					resultSet.refreshRow();
					System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3)
							+ "\t" + resultSet.getString(4) +"\t"+ resultSet.getInt(5));
				}
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
