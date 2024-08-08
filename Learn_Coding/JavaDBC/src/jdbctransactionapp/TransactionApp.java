package jdbctransactionapp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import morgocialinutil.ClassJDBCUtil;

public class TransactionApp {
	public static void main(String[] args) {

		Connection connection = null;
		Statement statm = null;
		ResultSet resultSet = null;
		ResultSet rsSet = null;

		Scanner scan = null;

		try {
			connection = ClassJDBCUtil.getConnectionJDBC();

			if (connection != null)
				statm = connection.createStatement();

			String sqlSelectQuery = "select name , balance from accounts";
			if (statm != null)
				resultSet = statm.executeQuery(sqlSelectQuery);

			System.out.println("DB before transaction :");

			if (resultSet != null) {
				System.out.println("Name\tBalance");

				while (resultSet.next()) {
					System.out.println(resultSet.getString("name") + "\t" + resultSet.getInt("balance"));
				}
			}

			System.out.println("Transaction started ....");
			connection.setAutoCommit(false);

			statm.executeUpdate("update accounts set balance = balance - 5000 where name = 'alin'");
			statm.executeUpdate("update accounts set balance = balance + 5000 where name = 'maxim'");

			System.out.print("Type yes if you confirm the transcation for 5000 $ ...(YES / NO) : ");
			scan = new Scanner(System.in);
			String ans = scan.next();

			if (ans.equalsIgnoreCase("yes")) {
				connection.commit();
			} else {
				connection.rollback();
			}

			System.out.println("DB after transaction :");

			rsSet = statm.executeQuery("select * from accounts");
			if (rsSet != null) {
				System.out.println("Name\tBalance");

				while (rsSet.next()) {
					System.out.println(rsSet.getString("name") + "\t" + rsSet.getInt("balance"));
				}
			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ClassJDBCUtil.closeAllResourses(connection, statm, resultSet);
				ClassJDBCUtil.closeAllResourses(null, null, rsSet);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
