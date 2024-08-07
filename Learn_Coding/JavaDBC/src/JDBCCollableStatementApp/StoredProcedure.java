package JDBCCollableStatementApp;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

import morgocialinutil.ClassJDBCUtil;

public class StoredProcedure {

	private static final String sqlProcedure = "{Call GET_PRODUC_DETAILS_BY_ID(?,?,?,?)}";
	
	public static void main(String[] args) {

		Connection connection = null;
		CallableStatement cstatm = null;

		Scanner scan = null;
		
		try {
			connection = ClassJDBCUtil.getConnectionJDBC();
			if (connection != null) {
				cstatm = connection.prepareCall(sqlProcedure);
			}	
			
			scan = new Scanner(System.in);
			int id = 0;
			
			if (scan != null) {
				System.out.print("Enter your id :: ");
				id = scan.nextInt();
			}
			
			if (cstatm != null) {
				cstatm.setInt(1, id);
			}
			
			if(cstatm != null){
				
				cstatm.registerOutParameter(2, Types.VARCHAR);
				cstatm.registerOutParameter(3, Types.INTEGER);
				cstatm.registerOutParameter(2, Types.INTEGER);
			}
			
			if(cstatm != null){
				cstatm.execute();
			}
			
			if (cstatm != null) {
				System.out.println("The name of the prduct is :: " + cstatm.getString(2));
				System.out.println("The price of the prduct is :: " + cstatm.getInt(3));
				System.out.println("The qty of the prduct is :: " + cstatm.getInt(4));
			}
			
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ClassJDBCUtil.closeAllResourses(connection, cstatm, null);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
