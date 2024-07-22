package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Airoport{
	String name;
	String adress;
	int age;
	
	public Airoport(String name , String adress , int age) {
		this.name = name;
		this.adress = adress;
		this.age = age;
	}
	public Airoport()
	{
		
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString()
	{
		return "Name : " + name + "\n"
				+"Adress : " + adress + "\n"
				+"Age : " + age;
	}
	public void intentify(HashMap hm)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please introduce the ID : ");
		int num = scan.nextInt();
		boolean flag = false;
		Set set = hm.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext())
		{
			Map.Entry data = (Entry) i.next();
			Integer key = (Integer) data.getKey();
			if(key == num)
			{
				System.out.println("Your data is : \n" + data.getValue());
				flag = true;
			}	
		}
		if(!flag)
		{
			System.out.println("Dont have this ID in DB");
		}
		
	}

}
public class AiropartBasicEnyty {
	public static void main(String[] args) {
		Airoport run = new Airoport();
		Airoport p1 = new Airoport("Morgoci Alin ","Telenesti", 17);
		Airoport p2 = new Airoport("Morgoci Adrian ","Sarateni Vechi", 47);
		Airoport p3 = new Airoport("Morgoci Maxim ","Chisinau", 15);
		
		HashMap hm = new HashMap();
		hm.put(1, p1);
		hm.put(2,p2);
		hm.put(3, 3);
		run.intentify(hm);
	}
}
