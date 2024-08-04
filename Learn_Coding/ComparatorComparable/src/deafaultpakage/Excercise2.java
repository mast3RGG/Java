package deafaultpakage;

import java.util.TreeSet;

class Book implements Comparable<Book>
{
	int id;
	String title;
	String author;
	
	public Book(int id , String title , String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Id : "+ id + " Title : " + title + " Author : " + author + "\n";
	}
	
	@Override 
	public int compareTo(Book b)
	{
		String s1 = this.author;
		String s2 = b.author;
		return s1.compareTo(s2);
	}
}

public class Excercise2 {
	public static void main(String[] args) {
		Book b1 = new Book(3 , "Alba ca Zapada" , "Alin");
		Book b2 = new Book(1 , "Cei trei purcelsui" , "Adrian");
		Book b3 = new Book(2 , "Harap Alb" , "Maxim");
		Book b4 = new Book(10 , "Harap Alb" , "AAMAXIM");
		TreeSet ts = new TreeSet();
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		System.out.println(ts);
		
	}
}
