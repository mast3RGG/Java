package morgocialin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Excerisise2 {
	public static void main(String... args) throws IOException {
		final String file1 = "file1.txt";
		final String file2 = "file2.txt";
		final String file3 = "file3.txt";
		File f1 = new File(file1);
		File f2 = new File(file2);
		File f3 = new File(file3);
		BufferedReader bf = new BufferedReader(new FileReader(f1));
		BufferedReader bf2 = new BufferedReader(new FileReader(f2));
		PrintWriter pr = new PrintWriter(f3);
		
		String read1 = bf.readLine(); 
		String read2 = bf2.readLine();
		
		while(read1 != null || read2 != null)
		{
			if(read1 != null) {
			pr.println(read1);
			read1 = bf.readLine();
			}
			if(read2 != null) {
			pr.println(read2);
			read2 = bf2.readLine();
		}}
		
		bf.close();
		bf2.close();
		pr.close();
		
	}
}
