package morgocialin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
	Cat c1 = new Cat();
}

class Cat implements Serializable{
	Rat r1 = new Rat();
}

class Rat implements Serializable{
	Alin a1 =new Alin();
}
class Alin implements Serializable{
	int j = 10;
}

public class GraphObject {
	public static void main(String[] args) throws IOException , ClassNotFoundException{
		Dog d1 = new Dog();
		FileOutputStream fos = new FileOutputStream("graphobject.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis = new FileInputStream("graphobject.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog o  = (Dog ) ois.readObject();
		System.out.println(o.c1.r1.a1.j);
		
		
	}
}
