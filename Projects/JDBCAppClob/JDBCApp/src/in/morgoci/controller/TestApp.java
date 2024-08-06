package in.morgoci.controller;

import in.morgoci.service.IStudentService;
import in.morgoci.servicefactory.StudentServiceFactory;

public class TestApp {

	public static void main(String[] args) {

		IStudentService studentService = StudentServiceFactory.getStudentService();
		
		String msg = studentService.addStudent("Alin", 17, "Telenesti");
		 if(msg.equals("succes"))
		 {
			 System.out.println("Record inserted succesfully");
		 } else {
			 System.out.println("Recored insertion failed ....");
		 }
	}

}
