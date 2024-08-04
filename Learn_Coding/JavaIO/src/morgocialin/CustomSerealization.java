package morgocialin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable
{
	String usr = "morgocialin";
	transient String pwd = "morgocialinushh";
	transient int pin = 1111;
	private void writeObject(ObjectOutputStream oos) throws Exception
	{
		oos.defaultWriteObject();
		String encrypetPwd = pwd;
		int pinn = pin;
		oos.writeObject(encrypetPwd);
		oos.writeInt(pinn);
	}
	
	private void readObject(ObjectInputStream ois) throws Exception
	{
		ois.defaultReadObject();
		String pass = (String) ois.readObject();
		int pin = ois.readInt();
		pwd = pass;
		this.pin = pin;
	}

}

public class CustomSerealization {
	public static void main(String[] args) throws Exception {
		Account acc =new Account();
		FileOutputStream fos = new FileOutputStream("Serealization.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(acc);
		System.out.println("Type");
		System.in.read();
		
		FileInputStream fis = new FileInputStream("Serealization.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account s = (Account)ois.readObject();
		System.out.println(s.usr + " " + s.pwd + " " + s.pin);
	}
}
