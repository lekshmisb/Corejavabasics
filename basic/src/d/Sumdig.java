package d;

import java.util.Scanner;

public class Sumdig 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=sc.nextInt();
		int n=0;
		int rem;
		int sum=a;
		
		while(n>0) 
		{
			rem=a%10;
			sum=sum+rem;
			n=n/10;
			
		}
		System.out.println("Sum of digits is"+n);
		
	}

}
