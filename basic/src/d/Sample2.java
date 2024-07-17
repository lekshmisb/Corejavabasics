package d;

import java.util.Scanner;

public class Sample2 

{
		
	
	void factotialNum() 
	{
		System.out.println("Enter the number");
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int b=1,fact=1;
		 
		
		
		while(b<=a) 
		{
			fact=fact*b;
			b++;
			
		}
		System.out.println(fact);
		
		
	}
	void multiTable()
	{
		System.out.println("Enter the number");
		Scanner obj=new Scanner(System.in);
		
		int b=obj.nextInt();
		int a=1;
		{
		
		while(a<12)
		{
			
			System.out.println(a+"*"+b+"="+(a*b));
			a++;
		}
			
			
			
		}
		
		
	}
	public static void main(String[] args)
	{
		System.out.println("1:Factorial of Number\n2:Multiplicationtable");
		
		System.out.println("Enter the option");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	Sample2 p= new Sample2();
	switch(a)
	{
	case 1:
		p.factotialNum();
	break;
	
	
	case 2:
	    p.multiTable();
	break;
	default:
		System.out.println("Invalid option");
	break;
	
	
	
	}
		
	
	
	}
}
	

