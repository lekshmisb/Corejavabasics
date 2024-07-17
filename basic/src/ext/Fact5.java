package ext;

import java.util.Scanner;

public class Fact5 
{
	public static void main(String[] args) 

	{
        Scanner sc=new Scanner(System.in);
        System.out.println("1:Multiplicationtable \n2:Factotial");
		System.out.println("Enter the option");
		int a=sc.nextInt();
		
		
		Fact5 s=new Fact5();
		switch(a)
		{
		case 1:
			s.multiTab();
			
			break;
			
		case 2:
			s.factNum();
			break;
			
			default:
				System.out.println("Invalid");
				break;
		
		
		
		}
	}
		
		
		void multiTab()
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int b=1;
		while(a<=12)
		{
			System.out.println(a+"*"+b+"="+(a*b));
			a++;
		}
			
		}
		
		
		
		
		
		void factNum()
		{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int b=1, fact=1;
		
		while(b<=a)
		{
		
			fact=fact*b;
			b++;
			
		}
		System.out.println(fact);
	}

	
}