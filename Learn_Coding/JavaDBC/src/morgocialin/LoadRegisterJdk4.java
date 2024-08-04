package morgocialin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoadRegisterJdk4 {
	public static void main(String[] args) throws ClassNotFoundException , SQLException, IOException{
		String url = "jdbc:mysql:///training";
		String name = "root";
		String pass = "mastergigi2006";
		Connection connection = DriverManager.getConnection(url , name ,pass);
		Statement statement = connection.createStatement();
		//String deleteQuery = "delete from student where sid = 1";
		//int rowsAffected = statement.executeUpdate(deleteQuery);
		//String addStudentQuery = "insert into student(sname , sage , sadress) values('Alin' , 17 , 'Chisinau')";
		//Integer rowsAffected = statement.executeUpdate(addStudentQuery);
		//System.out.println("Rows affected :: " + rowsAffected);
		System.out.println("Press somethin to contiune");
		System.in.read();
		String SQLQuery = "select * from student order by sage desc";
		ResultSet resultSet = statement.executeQuery(SQLQuery);
		while(resultSet.next())
		{
			Integer id = resultSet.getInt(1);
			String namee = resultSet.getString(2);
			Integer age = resultSet.getInt(3);
			String adress = resultSet.getString(4);
		System.out.println(id + "\t" + namee + "\t" +age + "\t" +adress );	
		}
	}
}
