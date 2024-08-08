package jdbctransactionapp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Scanner;

import morgocialinutil.ClassJDBCUtil;

public class JDBCSavepointApp {
	public static void main(String[] args) {

		Connection connection = null;
		Statement statm = null;
		ResultSet resultSet = null;

		try {
			connection = ClassJDBCUtil.getConnectionJDBC();
			
			if (connection != null) 
				statm = connection.createStatement();
			
			System.out.println("Transaction has started ....");
			connection.setAutoCommit(false);
			
			statm.executeUpdate("insert into politicians(name , party) values ('Sandu' , 'Solidaritate')");
			statm.executeUpdate("insert into politicians(name , party) values ('Dodon' , 'Socialist')");
			
			Savepoint setSavepoint = connection.setSavepoint();
			statm.executeUpdate("insert into politicians(name , party) values ('Sor' , 'Prost')");
		
			connection.rollback(setSavepoint);
			System.err.println("Operation are rolled back to the save point");
			System.err.println("Somethin went wrong during the insertion");
			
			connection.commit();
			
			System.out.println("Transaction has ended");
			
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ClassJDBCUtil.closeAllResourses(connection, statm, null);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
