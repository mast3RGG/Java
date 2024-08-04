package morgocialin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	private static final String FILE = "ALIN.txt";
	private static final String FILEJAVAIO = "D:\\Java\\Learn_Coding\\JavaIO";

	public static void main(String[] args) throws IOException {
		final String dirFile = "FileWriterExample";
		File dir = new File(dirFile);
		dir.mkdir();
		File f10 = new File(dirFile,FILE);
		f10.createNewFile();
		System.out.println(f10.getAbsolutePath());
		
		FileWriter fileWriter = new FileWriter(f10,true);
		fileWriter.write(97);
		fileWriter.write("Omg ");
		fileWriter.close();
		
//		File f12 = new File(FILEJAVAIO);
//		String [] listOfFiles = f12.list();
//		for (String string : listOfFiles) {
//			System.out.println(string);
//		}
		
		
	}
}
