package morgocialin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Exercises {
	public static void main(String[] args) throws IOException {
		//fil1.txt and file2.txt copy al to file 3
		final String file1 = "file1.txt";
		final String file2 = "file2.txt";
		final String file3 ="file3.txt";
		File f1 = new File(file1);
		File f2 = new File(file2);
		File f3 = new File(file3);
		BufferedReader bf = new BufferedReader(new FileReader(f1));
		BufferedReader bf2 = new BufferedReader(new FileReader(f2));
		PrintWriter pr = new PrintWriter(f3);
		String bfS = bf.readLine();
		while(bfS != null)
		{
			pr.println(bfS);
			bfS = bf.readLine();
		}
		
		String bfS2 = bf2.readLine();
		while(bfS2 != null)
		{
			pr.println(bfS2);
			bfS2 = bf2.readLine();
		}
		pr.flush();
		bf.close();
		bf2.close();
		pr.flush();
		
		
	}
}
