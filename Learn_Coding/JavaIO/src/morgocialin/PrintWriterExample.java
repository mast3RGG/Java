package morgocialin;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
public class PrintWriterExample {
	public static void main(String[] args) throws IOException{
		
	
	File f1 = new File("Test.txt");
	PrintWriter pw = new PrintWriter(f1);
	pw.println("alin");
	pw.println(true);
	pw.println('a');
	pw.println(10.5);
	pw.flush();
	}
}
