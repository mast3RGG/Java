package map;
import java.util.*;
import java.util.Map.Entry;
class Student {
	String name;
	String surname;
	int age;
	
	public Student(String name , String surname , int age)
	{
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return "Name : " + name + " | Surname : " + surname + " | Age :" + age;
	}
}
public class MapComplex {
	public static void main(String[] args) {
		Student s1 = new Student("Morgoci", "Alin", 17);
		Student s2 = new Student("Morgoci", "Maxim", 15);
		Student s3 = new Student("Morgoci", "Adrian",46);
		
		HashMap hm2 = new HashMap();
		hm2.put(1,s1);
		hm2.put(2,s2);
		hm2.put(3,s3);
		
		Collection c1 = hm2.values();
		Iterator i5 = c1.iterator();
		while(i5.hasNext())
		{
			System.out.println(i5.next() + " ");
		}
		
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");
		Set ss = hm2.keySet();
		Iterator i6 = ss.iterator();
		while(i6.hasNext())
		{
			Integer i = (Integer) i6.next();
			System.out.print(i + " ");
		}
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		Set ss2 = hm2.entrySet();
		Iterator i7 = ss2.iterator();
		while(i7.hasNext())
		{
			Map.Entry data  = (Entry) i7.next();
			System.out.println("The code of the Student is :" + data.getKey());
			System.out.println("And The actual data is : " + data.getValue());
			
		}
	}	
}
