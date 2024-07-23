package deafaultpakage;

import java.util.TreeSet;

class Person implements Comparable<Person> {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Name : " + name + " Age : " + age + "\n";
	}
	
	@Override
	public int compareTo(Person that) {
		String s1 = this.name;
		String s2 = that.name;
		return s1.compareTo(s2);
	}
}

public class Exercises {
	public static void main(String[] args) {
		Person p1 = new Person("Alin" , 17);
		Person p2 = new Person("Maxim" , 12);
		Person p3 = new Person("Adrian" , 23);
		
		TreeSet ts1 = new TreeSet();
		ts1.add(p1);
		ts1.add(p2);
		ts1.add(p3);
		System.out.println(ts1);
	}
}
