package morgocialin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	final static transient int year = 2006;
	int age = 17;
	String name = "Alin";
	public Student() {
		System.out.println("Constructing is executing");
	}
	
	@Override
	public String toString() {
		return "Age : " + age + " Name : " + name + " Year : " + year;
	}
}
public class SerealizationExample {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Student s1 = new Student();

		FileOutputStream fos = new FileOutputStream("Serealization.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		System.out.println("Type");
		System.in.read();
		
		FileInputStream fis = new FileInputStream("Serealization.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s = (Student)ois.readObject();
		System.out.println(s);
	}
}
