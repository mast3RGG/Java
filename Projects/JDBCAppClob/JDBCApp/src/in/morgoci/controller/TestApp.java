package in.morgoci.controller;

import java.util.Scanner;

import in.morgoci.dto.Student;
import in.morgoci.service.IStudentService;
import in.morgoci.servicefactory.StudentServiceFactory;

public class TestApp {

	public static void main(String[] args) {

		extracted();
	}

	private static void extracted() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the id of student to be deleted : ");
		Integer id = scan.nextInt();

		IStudentService studentService = StudentServiceFactory.getStudentService();
		String msg = studentService.deleteStudent(id);

		if (msg.equalsIgnoreCase("succes")) {
			System.out.println("Record deleted sucesfully");
		} else if (msg.equalsIgnoreCase("not found")) {
			System.out.println("There is no student with this id : " + id);
		} else {
			System.out.println("Record failed ....");
		}
		scan.close();
	}

	@SuppressWarnings("unused")
	private static void selectById() {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the id : ");
		Integer id = scan.nextInt();

		IStudentService studentService = StudentServiceFactory.getStudentService();

		Student std = studentService.searchStudent(id);

		if (std != null) {
			System.out.println(std);

			System.out.println("ID\tNAME\tAGE\tADRESS");
			System.out.println(std.getSid() + "\t" + std.getSname() + "\t" + std.getSage() + "\t" + std.getSadress());
		} else {
			System.out.println("Record not found for the respective id");
		}

		scan.close();
	}

	@SuppressWarnings("unused")
	private static void insertOperation() {
		IStudentService studentService = StudentServiceFactory.getStudentService();

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your name : ");
		String sname = scan.next();

		System.out.print("Enter your age : ");
		Integer sage = scan.nextInt();

		System.out.print("Enter your adress : ");
		String adress = scan.next();

		String msg = studentService.addStudent(sname, sage, adress);
		if (msg.equals("succes")) {
			System.out.println("Record inserted succesfully");
		} else {
			System.out.println("Recored insertion failed ....");
		}

		scan.close();
	}

}
