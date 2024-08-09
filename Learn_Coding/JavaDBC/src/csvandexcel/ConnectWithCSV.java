package csvandexcel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.concurrent.locks.ReadWriteLock;

public class ConnectWithCSV {
	private static String textUrl = "jdbc:Text:///D:\\Exerciutiu";
	private static String csvText = "select * from data.csv";

	public static void main(String[] args) {
		
		
		try(Connection connection = DriverManager.getConnection(textUrl ))
		{
			try(Statement statm = connection.createStatement()){
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Enter id");
				int id = scan.nextInt();
				
				System.out.println("Enter name");
				String name = scan.next();
				
				System.out.println("Enter age");
				int age = scan.nextInt();
				
				int rowAffected = statm.executeUpdate("insert into data.csv values("+id+",'"+ name+"' ,"+age+")");
				System.out.println("Row affected : " +  rowAffected);
				try(ResultSet resultSet = statm.executeQuery(csvText )){
					while(resultSet.next())
					{
						System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3));
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
