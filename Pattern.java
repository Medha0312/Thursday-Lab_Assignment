package ThursdayLab;

public class Pattern {
	public static void main (String[] args) {
		int i,j,k;//i=row,j=space,k=star
		for(i=1;i<=9;i=i+2)//row+2
		{
			for(j=9;j>=i;j--) //condition test//j>=i,j=9& i=1
			{ 
				System.out.print(" ");
			}
			for (k=1;k<=i;k++)//k=1,k<=1,
			{
				System.out.print("* ");
				
			}
			System.out.println();//new line 
		}
		
			
			
	}

}
