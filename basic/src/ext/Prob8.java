package ext;

import java.util.Scanner;

public class Prob8 
{
	void oddEven(int x) 
	{
		if(x%2==0)
		{
			System.out.println(x+"is even number");
		}
		else
		{
			System.out.println(x+"is odd number");
		}
			
		
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		
		Prob8 b=new Prob8();
		int rem=0;
		
		while(a>0)
		{
			rem=a%10;
			b.oddEven(rem);
			a=a/10;
			
		}
		
	}
	
	
	
}
