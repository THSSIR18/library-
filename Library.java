import java.util.Scanner;
public class Library
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a author");
		 String author =sc.nextLine();
		 System.out.println("Enter a title");
		 String title =sc.nextLine();
		 
		 
		 Patron book1 = new Patron(title);
		  
		 if (book1.gotbook(title) == true )
		 {
		 	System.out.println("We have the book");
		 }
		 else
		 {
		 	System.out.println("We  dont have the book");
		 }
		 System.out.println("Enter a title");
		 String title2 =sc.nextLine();
		 sc.nextLine();
		  if (book1.checkbook(title2) == true )
		 {
		 	System.out.println("We have the book");
		 }
		 else
		 {
		 	System.out.println("We  dont have the book");
		 }
		 System.out.println("Enter a title");
		 String title3 =sc.nextLine();
		 sc.nextLine();
		  if (book1.returnbook(title3) == true )
		 {
		 	System.out.println("Book Returned");
		 }
		 else
		 {
		 	System.out.println("Book not Returned");
		 }
	}
}
