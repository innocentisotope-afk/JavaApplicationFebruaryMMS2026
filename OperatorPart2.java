public class OperatorPart2{
	public static void main(String[] args){
		
		int num1 = 50;
		int num2 = 80;
		int num3 = 30;
		//AND
		boolean isAND = (num1 > num2) && (num1 > num3);
		//OR
		boolean isOR = (num1 > num2) || (num1 > num3);
		//NOT
		boolean isNOT = !((num1 > num2) || (num1 > num3));
		
		System.out.println ("-----------------------------------------\n");
		
		System.out.printf ("Is (%d > %d) && (%d > %d): %b%n",num1,num2,num1,num3, isAND);//false
		
		System.out.printf ("Is (%d > %d) || (%d > %d): %b%n",num1,num2,num1,num3, isOR);//true
		
		System.out.printf ("Is !((%d > %d) && (%d > %d)): %b%n", num1,num2,num1,num3, isNOT);//false
		
		System.out.println ("-----------------------------------------\n");
		
		int x = 5;
		int y = 2;
		
		//pre-increment
		++x; 
		++y;
		System.out.println ("-----------------------------------------\n");
		System.out.println ("The value of x is " + ++x);
		System.out.println ("The value of x is " + ++y);
		System.out.println ("-----------------------------------------\n");
		//post-increment
		
		System.out.println ("The value of x is " + x++);
		System.out.println ("The value of y is " + y++);
		System.out.println ("The value of x is " + x);
		System.out.println ("The value of y is " + y);
		System.out.println ("-----------------------------------------\n");
		
		
		
		//pre-decrement
		--x; 
		--y;
		System.out.println ("-----------------------------------------\n");
		System.out.println ("The value of x is " + --x);
		System.out.println ("The value of x is " + --y);
		System.out.println ("-----------------------------------------\n");
		
		//post-decrement
		
		System.out.println ("The value of x is " + x--);
		System.out.println ("The value of y is " + y--);
		System.out.println ("The value of x is " + x);
		System.out.println ("The value of y is " + y);
		System.out.println ("-----------------------------------------\n");
	}
}