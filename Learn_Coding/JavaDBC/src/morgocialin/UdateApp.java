package morgocialin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UdateApp {
	public static void main(String[] args) throws ClassNotFoundException , SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Class got loaded");
		String url = "jdbc:mysql://localhost:3306/training";	
		String usr = "root";	
		String pass = "Alinroot123";	
		Connection connection = DriverManager.getConnection(url , usr , pass);
		Statement statement = connection.createStatement();
		String sqlQuery = "select sid , sname ,sage , sadress from student";
		ResultSet resultSet = statement.executeQuery(sqlQuery);
		while(resultSet.next())
		{
			Integer id = resultSet.getInt("sid");
			String name = resultSet.getString("sname");
			Integer age = resultSet.getInt("sage");
			String adress = resultSet.getString("sadress"); 
			
			System.out.println(id +"\t" + name +"\t" +age +"\t" +adress );
		}
	}
}
