public class OperatorsPart1{
	public static void main (String[] args){
		
		//Assignment operator and we use it for = sign so we can give a value to variables
		int num=100;
		System.out.printf ("Number is %d%n"	, num);
		//Arithmetic operator used to perform calculations eg -,+.*,/,%
		int num1 = 50;
		int num2 =200;
		int addition = num1 + num2;
		int substraction = num1 - num2;
		int multiplication =num1 * num2;
		double division = (double)num1 / num2;
		int remainder = num1 % num2;
		 
		
		
		
		
		
		System.out.println("---------------------Arithmetic Output-------------");
		
		System.out.printf ("%d + %d = %d%n", num1, num2, addition);
		System.out.printf ("%d - %d = %d%n", num1, num2, substraction);
		System.out.printf ("%d * %d = %d%n", num1, num2, multiplication);
		System.out.printf ("%d / %d = %.2f%n", num1, num2, division);
		//since double gives a decimal number then we expect to change the printf to %.2f so we can get the decimal
		System.out.printf ("%d %% %d = %d%n", num1, num2, remainder);
		
		System.out.println("---------------------Compound Assignement Output-------------");//this method is used to update the former running number
		//Compound assignment operator(+=,-=,/=,%=)
		int number1 =20;
		int number2 =2;
		//this mehtod is used to update the number known as number1
		
		
		System.out.printf ("The value of number1 has been updated to what %d%n", number1);
		number1 += number2; //this would be giving us number1 as 22
		System.out.printf ("The value of number1 has been updated to what %d%n", number1);
		number1 -= number2; // this would make number1 as 20
		System.out.printf ("The value of number1 has been updated to what %d%n", number1);
		number1 *= number2; // this would make number1 to now be 40
		System.out.printf ("The value of number1 has been updated to what %d%n", number1);
		number1 /= number2; //this would be 40 divided by 2 which is number2 and it goes back to 20
		System.out.printf ("The value of number1 has been updated to what %d%n", number1);
		number1 %= number2; // this is 20 divided by two with remainder 0  as the answer
		
		//Relational Operator (<,>,>=,=>,==,!=)
		int x= 90;
		int y= 51;
		boolean isGreater = x> y;
		boolean isLessThan =x < y;
		boolean isGreatertOrEqualTo = x >= y;
		boolean isLessOrEqualTo = x <= y;
		boolean isEqualTo = x == y;
		boolean notEqualTo = x != y;
		
		
		System.out.println ("-------Relational Output-------");
		System.out.printf ("Is %d > %d =%b%n", x, y, isGreater);
		System.out.printf ("Is %d < %d =%b%n", x, y, isLessThan);
		System.out.printf ("Is %d >= %d =%b%n", x, y, isGreatertOrEqualTo);
		System.out.printf ("Is %d <= %d =%b%n", x, y, isLessOrEqualTo);
		System.out.printf ("Is %d == %d =%b%n", x, y, isEqualTo);
		System.out.printf ("Is %d != %d =%b%n", x, y, notEqualTo);
	


 
	}
}