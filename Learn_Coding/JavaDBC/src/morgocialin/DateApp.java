package morgocialin;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateApp {
	private static long time;

	public static void main(String[] args) throws ParseException {
//		java.util.Date date = new java.util.Date();
//		System.out.println(date);
//		time = date.getTime();
//		System.out.println(time);
//		java.sql.Date datee = new java.sql.Date(time);
//		System.out.println(datee);
//		
//		System.out.println("Enter the date the format is : dd-yyyy-MM");
		Scanner scan = new Scanner(System.in);
//		String dateString = scan.next();
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-yyyy-MM");
//		java.util.Date d = sdf.parse(dateString);
//		long data = d.getTime();
//		java.sql.Date datesql = new java.sql.Date(data);
//		System.out.println(datesql);
//		System.out.println(d);
		
		System.out.println("Enter the date in the formal : yyyy-mm-dd");
		String dateFormat = scan.next();
		java.sql.Date valueOff = java.sql.Date.valueOf(dateFormat);
		System.out.println(dateFormat);
		System.out.println(valueOff);
	}
}
