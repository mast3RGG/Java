package morgocialinutil;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ClassJDBCUtil {
	private ClassJDBCUtil() {}
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		}
		
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		}
	
	public static Connection getConnectionJDBC() throws SQLException , IOException
	{
		FileInputStream fi = new FileInputStream("D:\\Java\\Learn_Coding\\JavaDBC\\app.properties");
		Properties p = new Properties();
		p.load(fi);
		Connection connection = DriverManager.getConnection(p.getProperty("url") , p.getProperty("user") , p.getProperty("pass"));
		return connection;
	}
	
	public static void closeAllResourses(Connection con , Statement statement , ResultSet resSet) throws SQLException
	{
		if(con!= null)
		{
			con.close();
		}
		if(statement != null)
		{
			statement.close();
		}
		if(resSet != null)
		{
			resSet.close();
		}
	}
	
	
}
