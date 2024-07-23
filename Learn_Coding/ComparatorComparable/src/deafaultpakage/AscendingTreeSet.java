package deafaultpakage;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparable implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		int l1 = s1.length();
		int l2 = s2.length();
		if(l1 < l2)
			return -1;
		else if(l1 > l2)
			return 1;
		else
			return s1.compareTo(s2);
	}
	
}
public class AscendingTreeSet {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComparable());
		ts.add("AB");
		ts.add("A");
		ts.add("ABCD");
		ts.add("ACD");
		ts.add("AA");
		ts.add("B");
		System.out.println(ts);
	}
}
