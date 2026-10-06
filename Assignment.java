import java.util.Scanner;

public class Assignment{
	public static void main (String[] args){
	Scanner voice = new Scanner (System.in);
	
	System.out.print ("Enter your practice: ");
	String practice=voice.next();
	voice.nextLine();
	
	System.out.print ("My age is ");
	int age= voice.nextInt();
	
	System.out.print ("enter your gender");
	char gender = voice.next().charAt(0);
	
	System.out.printf (" Oh hello prayer this is your practice %s ", practice);
	
	System.out.printf(" And you have been doing this practice for %d years" , age);
	
	System.out.println("You are an a " + gender);	
	}
}