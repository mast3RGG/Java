package morgocialin;

public class InnerClassImplementation {
	public static void main(String[] args) {
		new Thread(new Runnable(){
			@Override 
			public void run() {
				for(int i = 0; i< 10 ; i++)
				{
					System.out.println(i);
				}
			}
		}).start();
		
		new Thread(()->{
			for(int i = 30 ; i < 50; i++)
			{
				System.out.println(i);
			}
		}).start();
		
		for(int i = 10 ; i < 20; i++)
		{
			System.out.println(i);
		}
	}

}
