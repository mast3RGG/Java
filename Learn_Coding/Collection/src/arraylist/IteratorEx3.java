package arraylist;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.LinkedList;
public class IteratorEx3 {
	public static void main(String[] args) {
		ArrayDeque aq = new ArrayDeque();
		aq.add(10);
		aq.add(14);
		aq.add(89);
		aq.add(11);
		aq.add(2);
		aq.add(4);
		System.out.println(aq);
		aq.push(100);
		System.out.println(aq);
		aq.pop();
		System.out.println(aq);
		
		Iterator iterator = aq.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		LinkedList ll = new LinkedList();
		ll.addAll(aq);
		
		ListIterator li = ll.listIterator(ll.size());
		
		while(li.hasPrevious())
		{
			System.out.print(li.previous() + " ");
		}
	}
}
