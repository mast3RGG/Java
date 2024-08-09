package csvandexcel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectExcel {
	private static String ExcelUrl = "jdbc:Excel:///D:\\Exerciutiu";
	private static String excelQuery = "select * from ExcelData.Student15";

	public static void main(String[] args) {
		
		
		try(Connection connection = DriverManager.getConnection(ExcelUrl ))
		{
			try(Statement statm = connection.createStatement()){
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Enter id");
				int id = scan.nextInt();
				
				System.out.println("Enter name");
				String name = scan.next();
				
				System.out.println("Enter adress");
				String adress = scan.next();
				
				int rowAffected = statm.executeUpdate("insert into ExcelData.Student15 values("+id+",'"+ name+"' ,'"+adress+"')");
				System.out.println("insert into ExcelData.Student15 values("+id+",'"+ name+"' ,'"+adress+"')");
				System.out.println("Row affected : " +  rowAffected);
				try(ResultSet resultSet = statm.executeQuery(excelQuery)){
					while(resultSet.next())
					{
						System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3));
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
