package ThursdayLab;

public class Number {
	public static void main(String [] args)
	
	{
		int number=123;
		int firstDigit=0;
		int lastDigit=0;
		
		// to find the last digit of the number
		
		lastDigit=number%10;
		System.out.println("Last digit:"+lastDigit);
		
		// to find the first digit of the number
		
		while(number!=0)
		{
			firstDigit=number%10;
			number/=10;
		}
		
		System.out.println("First digit:"+firstDigit);
	}
}
   

