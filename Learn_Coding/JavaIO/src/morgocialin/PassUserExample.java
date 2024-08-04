package morgocialin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Login implements Serializable
{
	String username = "morgocialin";
	transient String passwords = "Alin2006";
}
public class PassUserExample {
	public static void main(String[] args) throws IOException , ClassNotFoundException{
		Login l1 = new Login();
		FileOutputStream fos = new FileOutputStream("login.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(l1);
	
		FileInputStream fis = new FileInputStream("login.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Login l2 = (Login)ois.readObject();
		System.out.println("Username : " + l2.username + "\n" + "Password : " + l2.passwords);
	}
}
