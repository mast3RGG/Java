package learning;

import java.util.Scanner;

class UserDataException extends Exception{
	public UserDataException(String message) {
		super(message);
	}
}

class Atm{
	int id = 1111;
	int pass = 2222;
	int idU;
	int pwU;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Id : ");
		idU = scan.nextInt();
		System.out.print("Password : ");
		pwU = scan.nextInt();
	}
	
	public void verfciation() throws UserDataException
	{
		if(idU == id  && pass == pwU)
		{
			System.out.println("Take your money");
		}
		else {
			UserDataException ude = new UserDataException("Input wrong , please try again");
			System.out.println( ude.getMessage());
			throw ude;
		}
	}}
	



class Bank{
	public void date() {
		Atm atm = new Atm();
		try {
		atm.input();
		atm.verfciation();
		}
		catch(UserDataException e) {
			try {
				atm.input();
				atm.verfciation();
				}
				catch(UserDataException ee) {
					try {
						atm.input();
						atm.verfciation();
						}
						catch(UserDataException eee) {
						System.out.println("Oh you are trying to steal a card");	
						}
				}
		}
		}
	
}

public class AtmProgram{
	public static void main(String[] args) {
		Bank bank =  new Bank();
		bank.date();
	}
}