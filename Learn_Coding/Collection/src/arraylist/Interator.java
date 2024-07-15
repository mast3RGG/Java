package arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Interator {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		
		Iterator iterator = al.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		System.out.println("Reverse");
		
		ListIterator ll = al.listIterator(al.size());
		while(ll.hasPrevious())
		{
			System.out.println(ll.previous());
		}
		
		
	}
}
