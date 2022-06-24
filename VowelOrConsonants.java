package ThursdayLab;
import java.util.Scanner;

public class VowelOrConsonants {
	
	public static void main(String[] args)
	{
		char ch;//variable declaired
		Scanner sc=new Scanner(System.in);//scanner object
		System.out.println("Enter the Alphabet to check: ");
		ch=sc.next().charAt(0);
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(ch+ " is vowel");
			break;
			default:
				System.out.println(ch+ " is consonent");	
			
		}
		
	}

}
