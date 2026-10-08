import java.util.Scanner;

public class Mine{
	public static void main(String[] args){
		Scanner one = new Scanner (System.in);
		
		System.out.print("Enter Username: ");
		String username = one.nextLine();
		
		System.out.print("Enter Full Name: ");
		String FullName = one.nextLine();
		
		System.out.print("Enter Password: ");
		String Password = one.nextLine();
		
		System.out.print("Enter Age: ");
		String Age = one.nextLine();
		
		
		System.out.printf ("Hello %s%n ", FullName);
		System.out.println ("This is your brand new username: " + username);
		System.out.println ("This is your password "+ Password + " please do not share with anyone");
		System.out.println ("This is your age " + Age);
		
	}
}