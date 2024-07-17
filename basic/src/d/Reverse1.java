package d;

import java.util.Scanner;

public class Reverse1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Check whether it is palindrome");
		int a1=sc.nextInt();
		
		
		int rev=0;
		int rem=0;
		int a=a1;
		
		
		while(a1>0)
		{
			rem=a1%10;
			rev=rev*10+rem;
			a1=a1/10;
		}
		System.out.println(rev);
		
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
