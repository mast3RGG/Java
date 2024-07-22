package enumm;
enum Compass {
	NORTH(0) , SOUTH(180) , WEST(90) , EAST(360);
	final int coordonates;
	private Compass(int coordontaes) {
		this.coordonates = coordontaes;
	}
}

enum Result
{
	PASS , FAIL ;
}

enum Example {
	SSST,STST ,SSTST;
	Example ()
	{
		System.out.println("Contrstrcutor : ");
	}
	
}
public class Enumeration {
	public static void main(String[] args) {
		Compass north = Compass.NORTH;
		System.out.println(north.coordonates);
		
	}
}
