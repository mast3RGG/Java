package morgocialin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Excerise3 {
	public static void main(String[] args) throws IOException{
		//Duplicate phone number remove
		final String file1 = "file1.txt";
		final String file2 = "file3.txt";
		File f1 = new File(file1);
		BufferedReader br = new BufferedReader(new FileReader(f1));
		PrintWriter pw = new PrintWriter(file2);
		LinkedHashSet<Long> hs = new LinkedHashSet<>();
		
		String name = br.readLine();
		
		while(name != null)
		{
			String nameModified = name.trim();
			Long num = Long.parseLong(nameModified);
			hs.add(num);
			name = br.readLine();
		}
		for (Long long1 : hs) {
			pw.println(long1);
		}
		
		br.close();
		pw.close();
	}
}
