package morgocialinclobblob;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.io.IOUtils;

import morgocialinutil.ClassJDBCUtil;

public class RetrievelClob {
	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement prstm = null;
		ResultSet resultSet = null;

		String SQLSelectQuery = null;
		int id = 3;
		
		try {
			connection = ClassJDBCUtil.getConnectionJDBC();

			if (connection != null) {
				SQLSelectQuery = "select id , name ,history from cities where id = ?";

				prstm = connection.prepareStatement(SQLSelectQuery);

				prstm.setInt(1, id);
			}

			if (prstm != null) {
				resultSet = prstm.executeQuery();

				if (resultSet.next()) {
				
					int idd = resultSet.getInt(1);
					String name = resultSet.getString(2);
					Reader reader = resultSet.getCharacterStream(3);

					File file = new File("history.txt");
					FileWriter fileWriter = new FileWriter(file);

					// This is not an optimal solutution and there performance is low

//					int i = is.read();
//					
//					while(i != -1)
//					{
//						fos.write(i);
//						i = is.read();
//					}

					// This is optimal solution but hard to remember
//					byte [] b = new byte[1024];
//					
					// while(is.read(b) > 0)
//					{
//						fos.write(b);
//					}

					IOUtils.copy(reader, fileWriter);
					System.out.println("ID \t Name \t\t  FileLocation");
					System.out.println(id + "\t" + name + "\t" + file.getAbsolutePath());
				} else {
					System.out.println("There is no such city");
				}
			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ClassJDBCUtil.closeAllResourses(connection, prstm, resultSet);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
