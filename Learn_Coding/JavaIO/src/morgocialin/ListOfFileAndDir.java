package morgocialin;

import java.io.File;

public class ListOfFileAndDir {
	public static void main(String[] args) {
		int txtFileJpg = 0;
		int txtFile = 0;
		final String FileName = "C:\\Users\\morgo";
		File f1 = new File(FileName);
		String [] list = f1.list();
		for (String string : list) {
			File f2  = new File(FileName , string);
			if(f2.isFile())
				{
					if(string.endsWith(".jpg"))
					{
						txtFileJpg++;
					}
					else if (string.endsWith(".txt"))
					{
						txtFile++;
					}
				}
			System.out.println(string);
		}
		
		System.out.println("JPG : " + txtFileJpg);
		System.out.println("Txt : " + txtFile);
		
	
		}
}
