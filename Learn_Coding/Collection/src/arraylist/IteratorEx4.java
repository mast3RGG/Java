package arraylist;
import java.util.*;
public class IteratorEx4 {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(7);
		
		Iterator i = ll.descendingIterator();
		while(i.hasNext())
		{
			System.out.print(i.next() + " ");
		}
	}
}
