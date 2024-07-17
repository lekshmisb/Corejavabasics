package h;

import java.util.Scanner;

public class H 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Check whether it is Palindrome");
		int a=sc.nextInt();
		
		
		int rev=0;
		int rem;
		int a1=a;
		
		
		
		while(a>0)
		{
	      rem=a%10;
	      rev=rev*10+rem;
	      a=a/10;
			
		}
		System.out.println(a);
		
		if(a==rev) 
		{
			
			System.out.println("The number is Palindrome");
			
			
		}
		else
		{
			System.out.println("The number is not Palindrome");
			
		}
		
		
		
		
	}

}
