import java.util.Scanner;

public class DoubleSelection{
	public static void main (String[] args){
		
		Scanner scan =new Scanner (System.in);
		
		
		System.out.println("Enter Fullname: ");
		String name = scan.nextLine();
		
		
		System.out.println("Enter Username: ");
		String username = scan.next();
		
		
		System.out.println("Enter Password: ");
		String password = scan.next();
		
	
		
		if (username.equals("Johnnydeep") && password.equals("12345")){
			System.out.println ("Access Granted");
			System.out.println (name + "you are welcome"\n);
	}
	else{
		System.out.println ("ACESSS DENIED");
	}
	}
}