package morgocialin;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ExampleOfProperties {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("D:\\Java\\Learn_Coding\\JavaDBC\\propertiesexample.properties");
		Properties properties = new Properties();
		properties.load(fis);
		System.out.println(properties.getProperty("key"));
		System.out.println(properties.get("1"));
		
	}
}
