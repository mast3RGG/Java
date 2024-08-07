package JDBCCollableStatementApp;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

import morgocialinutil.ClassJDBCUtil;

public class StoredProcudereApp2 {
	private static final String sqlProcedure = "{call GET_PRDUCT_BY_NAME(?,?)}";

	public static void main(String[] args) {

		Connection connection = null;
		CallableStatement cstatm = null;
		ResultSet resultSet = null;
		
		Scanner scan = null;
		String pname1 = null;
		String pname2 = null;
		boolean flag = false;
		
		try {
			connection = ClassJDBCUtil.getConnectionJDBC();
			if (connection != null) {
				cstatm = connection.prepareCall(sqlProcedure);
			}

			scan = new Scanner(System.in);

			if (scan != null) {
				System.out.print("Enter your first pname1 :: ");
				pname1 = scan.next();
				
				System.out.print("Enter your second pname2 :: ");
				pname2 = scan.next();
			}

			if (cstatm != null) {
				cstatm.setString(1, pname1);
				cstatm.setString(2, pname2);
			}


			if (cstatm != null) {
				cstatm.execute();
			}

			if (cstatm != null) {
				resultSet = cstatm.getResultSet();
			}

			if(resultSet != null){
				while(resultSet.next()) {
					
					if(flag == false) {
					System.out.println("PID\tPNAME\tPRICE\tQTY");
					}
					
					System.out.println(resultSet.getInt(1) + "\t" +resultSet.getString(2) + "\t" +resultSet.getInt(3) + "\t" + resultSet.getInt(4));
					flag  = true;
				}
			}
			
			if (flag) {
				System.out.println("Recored available and displayed");
			} else {
				System.out.println("Record not available");
			}
			
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ClassJDBCUtil.closeAllResourses(connection, cstatm, resultSet);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
