package in.morgoci.persistence;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
		return null;
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
