import java.io.File;
import java.io.IOException;

public class Filee {
	public static void main(String[] args) throws IOException {
		final String FILE = "abc.txt";
		File f1 = new File(FILE);
		System.out.println(f1.exists());
		f1.createNewFile();
		System.out.println(f1.exists());
		
		final String dirABC = "ABC";
		File f2 = new File(dirABC);
		System.out.println(f2.exists());
		f2.mkdir();
		System.out.println(f2.exists());
		File f3 = new File(dirABC , FILE);
		f3.createNewFile();
		File f4 = new File("Alin.txt");
		f4.createNewFile();
		
	}
}
