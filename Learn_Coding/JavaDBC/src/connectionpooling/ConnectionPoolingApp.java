package connectionpooling;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

public class ConnectionPoolingApp {
	public static void main(String[] args) {
		MysqlConnectionPoolDataSource dataSource = new MysqlConnectionPoolDataSource();

		String URL = "jdbc:mysql://localhost:3306/training";
		String user = "root";
		String pass = "Alinroot123";

		dataSource.setUrl(URL);
		dataSource.setUser(user);
		dataSource.setPassword(pass);

		try {
			Connection connection = dataSource.getConnection();

			Statement statm = connection.createStatement();

			ResultSet resultSet = statm.executeQuery("select * from student");

			System.out.println("ID\tName\tAge\tAdress");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3) + "\t"
						+ resultSet.getString(4));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
