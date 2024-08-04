package morgocialin2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import morgocialinutil.ClassJDBCUtil;

public class JDBCDateInsertionApp {
	public static void main(String[] args) {
		
		Connection connection = null;
		PreparedStatement prstm = null;
		ResultSet resultSet = null;
		
		try {
			connection = ClassJDBCUtil.getConnectionJDBC();
			
			String SQLSelectQuery = "select id , name , dob , dom from clients where id = ?";
			
			if (connection != null) {
				prstm = connection.prepareStatement(SQLSelectQuery);
				prstm.setInt(1 , 1);
			}
			
			if(prstm != null)
			{
				resultSet = prstm.executeQuery();
				
				if(resultSet.next())
				{
					int i = resultSet.getInt(1);
					String name = resultSet.getString(2);
					java.sql.Date dob = resultSet.getDate(3);
					java.sql.Date dom = resultSet.getDate(4);
					
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					
					String dateofb = sdf.format(dob);
					String dateOfM = sdf.format(dom);
					
					System.out.println("ID \t Name \t\t DOB \t\t DOM \t");
					System.out.println(i + "\t" +name + "\t"+ dateofb + "\t" +dateOfM);
				}
				else {
					System.out.println("There is no such client");
				}
			}
			
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ClassJDBCUtil.closeAllResourses(connection, prstm, resultSet);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
