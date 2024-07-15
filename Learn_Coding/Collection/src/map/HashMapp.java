package map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class HashMapp {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(10 , "Morgoci Alin");
		hm.put(7, "Cristiano Ronaldo");
		hm.put(11 , "Morgoci Maixm");
		System.out.println(hm);
		System.out.println("x".repeat(100));
		
		Collection c = hm.values();
		Iterator i1 = c.iterator();
		while(i1.hasNext())
		{
			System.out.print(i1.next() + " | ");
		}
		System.out.println(); 
		Set s = hm.keySet();
		Iterator i2 = s.iterator();
		while(i2.hasNext())
		{
			System.out.print(i2.next() + " | ");
		}
		System.out.println();
		Set s2 = hm.entrySet();
	    Iterator i3 = s2.iterator();
	    while(i3.hasNext())
	    {
	    	System.out.print(i3.next() + " | ");
	    }
	    System.out.println();
	    System.out.println("=========================================");
	    System.out.println();
	    Set s3 = hm.entrySet();
	    Iterator i4 = s3.iterator();
	    while(i4.hasNext())
	    {
	    Map.Entry data = (Entry) i4.next();
	    System.out.println("The key is : "+ data.getKey() + " and the value is : " + data.getValue());
	    Integer i =(Integer) data.getKey();
	    }
	}}
