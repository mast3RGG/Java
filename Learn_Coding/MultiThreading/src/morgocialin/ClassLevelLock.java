package morgocialin;

public class ClassLevelLock {
	public static void main(String[] args) {
		String s = "a  ssadas  ";
		s = s.trim();
		if(s.contains(" ")) {
			System.out.println("true");}
		else {
			System.out.println("false");
		}
	}
}
