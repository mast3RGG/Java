package in.morgoci.controller;

import java.util.Scanner;

import in.morgoci.service.IStudentService;
import in.morgoci.servicefactory.StudentServiceFactory;

public class TestApp {

	public static void main(String[] args) {
		
		IStudentService studentService = StudentServiceFactory.getStudentService();

			Scanner scan = new Scanner(System.in);
			
			System.out.print("Enter your name : ");
			String sname = scan.next();
			
			System.out.print("Enter your age : ");
			Integer sage = scan.nextInt();
			
			System.out.print("Enter your adress : ");
			String adress = scan.next();
		
		
		String msg = studentService.addStudent(sname, sage, adress);
		 if(msg.equals("succes"))
		 {
			 System.out.println("Record inserted succesfully");
		 } else {
			 System.out.println("Recored insertion failed ....");
		 }
	}

}
