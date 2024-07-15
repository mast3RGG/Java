package LinkedList;
import java.util.LinkedList;
public class Ex1 {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		System.out.println(ll);
		ll.add(2 , 10);
		ll.addFirst(1000);
		ll.remove(1);
		System.out.println(ll);
	}
}
