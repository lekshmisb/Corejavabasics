package ext;

import java.util.Scanner;

public class Fact1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Adding numbers ");
		System.out.println("2:Subtrcting nmbers");
		System.out.println("3:Multiplying numbers");
		System.out.println("4:Dividing numbers");
		System.out.println("Enter the options");
		int a=sc.nextInt();
		
	Fact1 s=new Fact1();
	switch(a)
	{
	case 1:
		s.addNum();
		break;
		
	case 2:
		s.subNum();
		break;
		
	case 3:
		s.mulNum();
		break;
		
	case 4:
		s.divNum();
		break;
		
		default:
			System.out.println("Invalid");
			break;
		
	}
	
	}
	
	void addNum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int p=sc.nextInt();
		System.out.println("Enter the second number");
		int q=sc.nextInt();
		System.out.println("Result is "+(p+q));
		
		
	}
	void subNum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int p=sc.nextInt();
		System.out.println("Enter the second number");
		int q=sc.nextInt();
		System.out.println("Result is "+(p-q));
		
		
		
	}
	
	void mulNum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int p=sc.nextInt();
		System.out.println("Enter the second number");
		int q=sc.nextInt();
		System.out.println("Result is "+(p*q));
		
		
		
	}
	void divNum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int p=sc.nextInt();
		System.out.println("Enter the second number");
		int q=sc.nextInt();
		System.out.println("Result is "+(p/q));
		
		
		
	}
	




}
