package morgocialin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicInput {
	public static void main(String[] args) throws ClassNotFoundException , SQLException , IOException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Class got loaded");
		String url = "jdbc:mysql://localhost:3306/training";
		String usr = "root";
		String pass = "mastergigi2006";
		
		Connection connection = DriverManager.getConnection(url , usr , pass);
		System.out.println("Connected to Db....");
		
		Statement statement = connection.createStatement();
		System.out.println("Statement object got created");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the name of studenet : ");
		String name = scan.next();
		System.out.print("Enter age of student : ");
		Integer age = scan.nextInt();
		System.out.print("Enter the adress of student : ");
		String adress = scan.next();
		
		//String SQLQuery = "insert into student (sname , sage , sadress) values ('"+name+"' ,"+age+" ,'"+adress+"')";
		String SQLQuery = String.format("insert into student(sname , sage, sadress ) values('%s', %d , '%s')",
															 name  , age,  adress);
		System.out.println(SQLQuery);
		int rowsAffected = statement.executeUpdate(SQLQuery);
		System.out.println("Rows Affected " + rowsAffected);
		System.in.read();
		SQLQuery = "select sid , sname , sage ,sadress from student";
		ResultSet resultSet = statement.executeQuery(SQLQuery);
		while(resultSet.next())
		{
			Integer id = resultSet.getInt("sid");
			String namee = resultSet.getString("sname");
			Integer agee = resultSet.getInt("sage");
			String adresss = resultSet.getString("sadress");
			System.out.println(id + "\t" + namee + "\t" + agee + "\t" + adresss );
					
		}
		resultSet.close();
		statement.close();
		connection.close();
		System.out.println("Resourses closed");
	}
}
