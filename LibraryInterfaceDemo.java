package ThursdayLab;

//interface
interface LibraryUser
{
	void registerAccount();
	void  requestBook();
}
///end of LibraryUser

class KidUser implements LibraryUser//child class
{
	int age;
	String bookType;
	public KidUser(int age, String bookType) {
		this.age=age;
		this.bookType=bookType;
	}
	@Override
	public void registerAccount() {
		if (age<12)
		{
			System.out.println("you have succesfully registered under a Kids Account");
		}
		else
		{
			System.out.println("Sorry Age must be less than 12 to register as a kid");
		}
	}
	@Override
	public void requestBook() 
	{
		if (bookType=="Kids")
		{
			
			System.out.println("Book issued successfully");
		}
		else
		{
			System.out.println("Opps you are allowed to take only kids book");
		}
	
	}
}
///end of child class

class Adultuser implements LibraryUser{//adult class
	int age;
	String bookType;
	public Adultuser(int age, String bookType) {
		this.age=age;
		this.bookType=bookType;
	}
	@Override
	public void registerAccount() {
		if (age>12)
		{
			System.out.println("you have succesfully register under an Adult Account");
			
		}
		if(age<12)
		{
			System.out.println("Sorry Age must be greter than 12 to register as an adult");
		}
	
	}
	@Override
	public void requestBook() {
		if (bookType=="Fiction")
		{
			System.out.println("Book issued succesfully,please return the book within 7 days");
		}
		else
		{
			System.out.println("oops,you agre allowed to take only adult Fiction book");
		}
		
	}
	
}
///end of Adult class
//main Method start
public class LibraryInterfaceDemo{
	public static void main(String[] args)
	{
		KidUser ku=new KidUser(10,"kids");// instance kids user
		ku.registerAccount();
		ku.requestBook();
		Adultuser au= new Adultuser(23,"Fiction");//instance adult user
		au.registerAccount();
		au.requestBook();
	}
}
	