package in.morgoci.service;

import in.morgoci.dto.Student;
import in.morgoci.servicefactory.StudentServiceFactory;

public class StudentServiceImpl implements IStudentService {

	IStudentService studentService;
	
	@Override
	public String addStudent(String sname, Integer sage, String adress) {
		studentService = StudentServiceFactory.getStudentService();
		return studentService.addStudent(sname, sage, adress);
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
