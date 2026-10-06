public class TypeCasting{
	public static void main(String[] args){
		double price= 765;
		// what the result showed in .00000 meaning the number went from whole number to integer
		System.out.printf("The price of fuel is %f %n",price);
		//the value has to be appropriate for the datatype, now to change it from integer to whole number by using double we sign that we want to loose that part of the remaining number
		double quantity = 632.50;
		//by using the int we are saying that is okay to sign off to the compiler that the quantity is not whole number but we want the result to be whole
		int convertedQuantity= (int)quantity;
		System.out.printf("Ordered %d loaves of bread yesterday",convertedQuantity);
	}
}