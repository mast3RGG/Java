package morgocialin;

import java.io.File;
import java.io.IOException;

public class FileOutsideDir {
	public static void main(String[] args) throws IOException{
		String Filee = "C:\\Users\\morgo\\Documents\\FileCreation";
		File f1 =new File(Filee);
		f1.mkdir();
		File f2 = new File(Filee , "Octavian");
		f2.createNewFile();
		File f3 = new File("Alin" , "Alin");
		f3.createNewFile();
	}
}
