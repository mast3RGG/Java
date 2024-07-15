import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Student {
	int age;
	String name;
	String adress;
	
	public Student(int age , String name , String adress) {
		this.age = age;
		this.name = name;
		this.adress = adress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
}
public class classGeneric {
	public static void main(String[] args) {
		Student student = new Student(17 , "Morgoci Alin" , "Chisnau");
		Student student1 = new Student(16 , "Morgoci Maxim" , "Telenesti");
		Student student2 = new Student(18 , "Botnarciu Octavian" , "Orhei");
		
		List <Student> studenti = new ArrayList<Student>();
		studenti.add(student);
		studenti.add(student1);
		studenti.add(student2);
		
		ListIterator it = studenti.listIterator(studenti.size());
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
		
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(4);
		ll.add(5);
		Iterator descending = ll.descendingIterator();
		while(descending.hasNext())
		{
			System.out.println(descending.next());
		}
	}
}
