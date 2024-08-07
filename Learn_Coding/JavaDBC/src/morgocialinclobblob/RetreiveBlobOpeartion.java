package morgocialinclobblob;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.io.IOUtils;

import morgocialinutil.ClassJDBCUtil;

public class RetreiveBlobOpeartion {
	public static void main(String[] args) {
		
		Connection connection = null;
		PreparedStatement prstm = null;
		ResultSet resultSet = null;

		String SQLSelectQuery = null;
		
		try {
			connection = ClassJDBCUtil.getConnectionJDBC();
			
			
			if (connection != null) {
				SQLSelectQuery = "select id , name ,image from person where id = ?";

				prstm = connection.prepareStatement(SQLSelectQuery);
					
				prstm.setInt(1 , 1);
			}
			
			if(prstm != null)
			{
				resultSet = prstm.executeQuery();
				
				if(resultSet.next())
				{
					int id = resultSet.getInt(1);
					String name = resultSet.getString(2);
				 	
					InputStream is = resultSet.getBinaryStream(3);
					
					File file = new File("copied.jpg");
					FileOutputStream fos = new FileOutputStream(file);
					
					//This is not an optimal solutution and there performance is low
					
//					int i = is.read();
//					
//					while(i != -1)
//					{
//						fos.write(i);
//						i = is.read();
//					}
					
					//This is optimal solution but hard to remember
//					byte [] b = new byte[1024];
//					
						//					while(is.read(b) > 0)
//					{
//						fos.write(b);
//					}
					
					IOUtils.copy(is , fos);
					System.out.println("ID \t Name \t\t  FileLocation");
					System.out.println(id + "\t" + name + "\t" + file.getAbsolutePath());
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
