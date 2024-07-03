package learning;

import java.util.Scanner;

class AgeOlderInputException extends Exception
{
	public AgeOlderInputException(String msg) {
		super(msg);
	}
	
}

class AgeYougerInputException extends Exception
{
	public AgeYougerInputException(String msg) {
		super(msg);
	}
}

class Aplicant 
{
	int age;
	
	public void input() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		age = scan.nextInt();
	}
	
	public void verfication() throws AgeOlderInputException , AgeYougerInputException
	{
		if(age < 18)
		{
			AgeYougerInputException ayie = new AgeYougerInputException("You are to yung");
			System.out.println(ayie.getMessage());
			throw ayie;
		}
		else if(age > 60){
			AgeOlderInputException aoie = new  AgeOlderInputException("You are to old");
			System.out.println(aoie.getMessage());
			throw aoie;
		}	 
		else {
			System.out.println("You can get a license");
		}
	}
}

public class Rto {
	public void intitate() {
		Aplicant a = new Aplicant();
		try
		{
		a.input();
		a.verfication();
	}catch(AgeOlderInputException | AgeYougerInputException ee) {
		try
		{
		a.input();
		a.verfication();
	}catch(AgeOlderInputException | AgeYougerInputException e) {
		try
		{
		a.input();
		a.verfication();
	}catch(AgeOlderInputException | AgeYougerInputException eee) {
		System.out.println("YOu just can t");
	}
	}
	}
}
	public static void main(String[] args) {
		Rto rto = new Rto();
		rto.intitate();
	}
}
