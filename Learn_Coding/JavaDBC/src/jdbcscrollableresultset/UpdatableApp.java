package jdbcscrollableresultset;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import morgocialinutil.ClassJDBCUtil;

public class UpdatableApp {
	public static void main(String[] args) {

		Connection connection = null;
		Statement statm = null;
		ResultSet resultSet = null;

		try {
			connection = ClassJDBCUtil.getConnectionJDBC();

			if (connection != null) {
				statm = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE , ResultSet.CONCUR_UPDATABLE);
			}
			
			String sqlSelectQuery = "SELECT * FROM STUDENT";
			if (statm != null) {
				resultSet = statm.executeQuery(sqlSelectQuery);
			}
			
			if (resultSet != null) {
				System.out.println("ID\tName\tAge\tAdress");
			
				while(resultSet.next())
				{
					System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3) + "\t" + resultSet.getString(4));
				}
			}
			
			System.in.read();
			
			//resultSet.absolute(6);
			//resultSet.deleteRow();
			
			resultSet.moveToInsertRow();
			resultSet.updateString(2, "Curry");
			resultSet.updateInt(3, 34);
			resultSet.updateString(4, "US");
			resultSet.insertRow();
			
			if (resultSet != null) {
				System.out.println("ID\tName\tAge\tAdress");
				resultSet.beforeFirst();
				while(resultSet.next())
				{
					resultSet.refreshRow();
					System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3) + "\t" + resultSet.getString(4));
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
