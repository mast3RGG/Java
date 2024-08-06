package in.morgoci.servicefactory;

import in.morgoci.service.IStudentService;
import in.morgoci.service.StudentServiceImpl;

public class StudentServiceFactory {

	private StudentServiceFactory() {

	}
	
	private static IStudentService studentService = null;

	public static IStudentService getStudentService()
	{
		if(studentService == null) {
		studentService = new StudentServiceImpl();
		}
		
		return studentService;
	}
}
