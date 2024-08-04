package morgocialinclobblob;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import morgocialinutil.ClassJDBCUtil;

public class BlobOpeartionApp {
	public static void main(String[] args) {
	
		Connection connection = null;
		PreparedStatement prstm = null;
		
		Scanner scan = null;
		
		String name = null;
		String locImage = null;
		
		try {
			connection = ClassJDBCUtil.getConnectionJDBC();
		
			String SQLQuery = "insert into person(name , image) values (?,?)";
			if (connection != null) {
				prstm = connection.prepareStatement(SQLQuery);
			}
			
			if(prstm != null) {
				scan = new Scanner(System.in);
			
				if(scan != null)
				{
					System.out.print("Enter name :: ");
					name = scan.next();
			
					System.out.print("Enter the location of the image :: ");
					locImage = scan.next();
				}
				
				prstm.setString(1, name);
				prstm.setBinaryStream(2, new FileInputStream(new File(locImage)));
			
				Integer nrRows = prstm.executeUpdate();
				
				System.out.println("Saved succesfully, number of rows affected are :: " + nrRows);
			}
			
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ClassJDBCUtil.closeAllResourses(connection, prstm, null);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
