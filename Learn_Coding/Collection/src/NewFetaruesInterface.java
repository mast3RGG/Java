interface Alin{
	void eat();
	void playingBasketball();
	default void reading()
	{
		System.out.println("Alin is reading");
		sleeping();
		mouse();
	}
	
	static void writing()
	{
		System.out.println("Alin is writing");
		mouse();
	}
	private void sleeping()
	{
		System.out.println("Alin is sleeping");
	}
	private static void mouse()
	{
		System.out.println("cat catch mouse");
	}
}
public class NewFetaruesInterface implements Alin {
	public void eat()
	{
		System.out.println("Alin is eating");
	}
	@Override
	public void playingBasketball() {

		System.out.println("Today alin will play baskeball");
	}
	public static void main(String[] args) {
		NewFetaruesInterface nfi = new NewFetaruesInterface();
		nfi.reading();
		Alin.writing();
	}
}
