package morgocialin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoadRegister {	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Class got loaded");
		String url = "jdbc:mysql://localhost:3306/training";
		String user = "root";
		String pass = "mastergigi2006";
		connection = DriverManager.getConnection(url , user , pass);
		
		String sqlQuery = "select * from student";
		statement = connection.createStatement();
		resultSet = statement.executeQuery(sqlQuery);
		
		System.out.println("sid \t sname \t age \t adress");
		while(resultSet.next()){
			Integer id = resultSet.getInt(1);
			String name = resultSet.getString(2);
			Integer age = resultSet.getInt(3);
			String adress = resultSet.getString(4);
			System.out.println(id + "\t" + name + "\t" + age + "\t" + adress);
		}
		resultSet.close();
		statement.close();
		connection.close();
		
		}
}

