package morgocialin;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) throws IOException {
		File f = new File("Test.txt");
		FileReader fr = new FileReader(f);
		int letter = fr.read();
		while(letter!= -1)
		{
			System.out.print((char)letter);
			letter = fr.read();
		}
		
		char [] list = new char[(int) f.length()];
		
		//Char constructore
		for (char c : list) {
			System.out.print(c);
		}
		
	
	}
}
