package d;

import java.util.Scanner;

public class Case 
{
	public static void main(String[] args) 
	
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("1:adding number");
		System.out.println("2:subtracting number");
		System.out.println("3:multiplying number");
		System.out.println("4:dividing number");
		System.out.println("Please enter the options");
		int value=obj.nextInt();
	
	
	
	
	switch(value)
	{
		case 1:
			Case s=new Case();
			s.addNumber();
		
		break;
		
		
		case 2:
		Case p=new Case();
		p.subNumber();
		break;
			
			
		case 3:
			Case q=new Case();
			q.mulNumber();
			break;
			
			
		case 4:
			Case r=new Case();
			r.divNumber();
			
			break;
			
			
			
		
	}

	}
	
	
	void addNumber()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=obj.nextInt();
		int b=obj.nextInt();
		System.out.println("Result is"+(a+b));
	}
	
	void subNumber()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int c=obj.nextInt();
		int d=obj.nextInt();
		System.out.println("Result is"+(c-d));
		
		
		
	}
	void mulNumber()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int e=obj.nextInt();
		int f=obj.nextInt();
		System.out.println("Result is"+(e*f));
		
		
		
	}
	void divNumber()
	{
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int g=obj.nextInt();
		int h=obj.nextInt();
		System.out.println("Result is"+(g/h));
		
	}
	
	
}
