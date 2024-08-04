package morgocialin;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
	public static void main(String[] args)  throws IOException {
		FileWriter fw = new FileWriter("Test.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hey Alin");
		bw.newLine();
		char [] ch = {'M','A','X','I','M'};
		bw.write(ch);
		bw.close();
		
	}
}
