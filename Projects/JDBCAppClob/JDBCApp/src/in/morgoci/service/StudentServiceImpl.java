package in.morgoci.service;

import in.morgoci.daofactory.StudentDaoFactory;
import in.morgoci.dto.Student;
import in.morgoci.persistence.IStudentDao;
import in.morgoci.servicefactory.StudentServiceFactory;

public class StudentServiceImpl implements IStudentService {

	IStudentDao studentDao;
	
	@Override
	public String addStudent(String sname, Integer sage, String adress) {
		studentDao = StudentDaoFactory.getStudentDao();
		
		if(studentDao != null)
			return studentDao.addStudent(sname, sage, adress);
		else
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
