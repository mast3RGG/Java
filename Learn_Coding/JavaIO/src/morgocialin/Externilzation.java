package morgocialin;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class StudentT implements Externalizable
{
	String usr;
	String pass;
	String name ;
	int age;
	
	public StudentT() {}
	public StudentT (String usr , String pass , String name , int age)
	{
		this.usr = usr;
		this.pass = pass;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(usr);
		out.writeObject(name);
		out.writeInt(age);
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		String usr = (String)in.readObject();
		this.usr = usr;
		String name = (String) in.readObject();
		this.name = name;
		int age =  in.readInt();
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User : " + usr + " Password : " + pass + " Name : " + name + " Age : " + age;
	}
}
public class Externilzation {
	public static void main(String[] args) throws Exception {
		StudentT s1 = new StudentT("alin" , "123123" , "Morgoci asli" , 17);
		FileOutputStream fos = new FileOutputStream("Serealization.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		System.out.println("Type");
		System.in.read();
		
		FileInputStream fis = new FileInputStream("Serealization.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		StudentT s = (StudentT)ois.readObject();
		System.out.println(s);
		ois.close();
		oos.close();
	}
}
