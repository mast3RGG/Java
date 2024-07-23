package deafaultpakage;

import java.util.TreeSet;


class Employee implements Comparable
{
	int id ;
	String name;
	int age;
	
	public Employee(int id , String name , int age)
	{
		this.id = id ;
		this.name = name;
		this.age = age;
	}
	
	@Override 
	public String toString(){
		return "Id : " + id + " Name : " +name + " Age : " + age + "\n";
	}
	@Override
	public int compareTo(Object o) {
		Integer i = this.id;
		Employee e = (Employee) o;
		Integer i2 = e.id;
		return i.compareTo(i2);
		
	}
	
	
}
public class ClassSorting {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Morgoci Alin" , 17);
		Employee e2 = new Employee(2, "Morgoci Adrian" , 47);
		Employee e3 = new Employee(3, "Morgoci Maxim" , 16);
		
		TreeSet ts1 = new TreeSet();
		ts1.add(e1);
		System.out.println();
		ts1.add(e2);
		ts1.add(e3);
		System.out.println(ts1);
	}
}
