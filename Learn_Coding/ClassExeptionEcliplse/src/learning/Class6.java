package learning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Class6{
	public static void main(String[] args) {
		try(final BufferedReader br = new BufferedReader(new FileReader("alin")))
		{ 
			// error br = new BufferedReader(new FileReader("outuput.txt"));
			//beouse by default br is final implicitly 
		}
		//br.close() will be closed automatically and the resourse will be closed	
		catch(IOException e)
		{
			
		}
	}
}