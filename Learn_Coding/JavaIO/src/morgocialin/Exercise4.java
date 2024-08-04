package morgocialin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise4 {
	public static void main(String[] args) throws IOException{
		final String file1 = "file1.txt";
		final String deleted = "file2.txt";
		final String file3 = "file3.txt";
		
		BufferedReader br = new BufferedReader(new FileReader(file1));
		PrintWriter pw = new PrintWriter(file3);
		String file1f = br.readLine();
		while(file1f != null)
		{
			boolean found = false;
			BufferedReader br2 = new BufferedReader(new FileReader(deleted));
			String deletedF = br2.readLine();
			while(deletedF != null)
			{
				if(file1f.equals(deletedF))
				{
					break;
				}
				deletedF = br2.readLine();
			}
			pw.println(file1f);
			file1f = br.readLine();
			
		}
	}
}
