package in.morgoci.persistence;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.morgoci.dto.Student;
import morgoci.in.JDBCUtil.ClassJDBCUtil;

public class StudentDaoImp implements IStudentDao {

	Connection connection = null;
	PreparedStatement prstm = null;

	@Override
	public String addStudent(String sname, Integer sage, String adress) {
		try {
			connection = ClassJDBCUtil.getConnectionJDBC();

			String sqlInsertQuery = "insert into student(sname , sage ,adress) values (?,?,?)";

			if (connection != null) {
				prstm = connection.prepareStatement(sqlInsertQuery);
			}

			if (prstm != null) {

				prstm.setString(1, sname);
				prstm.setInt(2, sage);
				prstm.setString(3, adress);

				int rowsAffected = prstm.executeUpdate();

				if (rowsAffected == 1)
					return "succes";
			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}

		return "failure";
	}

	@Override
	public Student searchStudent(Integer sid) {

		Connection connection = null;
		PreparedStatement pstatm = null;
		ResultSet resultSet = null;

		Student std = null;
		
		try {
			if (connection == null)
				connection = ClassJDBCUtil.getConnectionJDBC();

			String selectByIdQuery = "select id , sname ,sage ,adress from student where id = ?";

			if (connection != null) {
				pstatm = connection.prepareStatement(selectByIdQuery);
			}

			if (pstatm != null) {
				pstatm.setInt(1, sid);
				resultSet = pstatm.executeQuery();
			}
			
			if (resultSet != null) {
				if(resultSet.next()) {
					std = new Student();
					
					std.setSid(resultSet.getInt(1));
					std.setSname(resultSet.getString(2));
					std.setSage(resultSet.getInt(3));
					std.setSadress(resultSet.getString(4));
			
			}
		}} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ClassJDBCUtil.closeAllResourses(connection, pstatm, resultSet);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return std;
	}
	
	@Override
	public String updateStudent(Integer sid, String sname, Integer sage, String adress) {
		return null;
	}

	@Override
	public String deleteStudent(Integer sid) {
		return null;
	}

}
