package map;
import java.util.*;
class Test {
	int key ;
	public Test (int key)
	{
		this.key = key;
	}
	public String toString()
	{
		return "key " + key;
	}
}
public class Ex4 {
	public static void main(String[] args) {
		HashMap htt = new HashMap();
		htt.put(new Test(11) , "alin");
		System.out.println(htt);
//		htt.containsKey(htt);
		
	}
}
