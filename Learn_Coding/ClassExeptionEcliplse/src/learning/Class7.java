package learning;

import java.io.IOException;

class A{
	public void m1() throws Exception {
		
	}
}

class B extends A{
	@Override
	public void m1()  throws Exception{
	}
}

class C extends B {
	@Override
	public void m1() throws IOException{

	}
}
public class Class7 {
	public static void main(String[] args) {
		Boolean b = Boolean.valueOf("TRUE");
		boolean b1 = b.booleanValue();
		System.out.println(b + " " + b1);
	}
}
