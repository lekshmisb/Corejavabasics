package avesham;

import java.util.Scanner;

public class Console 
{
	
	
		void add() 
		{
		
		System.out.println("Enter the first Number");
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		System.out.println("Enter the second number");
		int b=obj.nextInt();
		System.out.println("Result is "+(a+b));
		
		}
		
		void sub() 
		{
		
		System.out.println("Enter the first Number");
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		System.out.println("Enter the second number");
		int b=obj.nextInt();
		System.out.println("Result is "+(a-b));
		
		}
		
		void mul() 
		{
		
		System.out.println("Enter the first Number");
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		System.out.println("Enter the second number");
		int b=obj.nextInt();
		System.out.println("Result is "+(a*b));
		
		}
		
		void div() 
		{
		
		System.out.println("Enter the first Number");
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		System.out.println("Enter the second number");
		int b=obj.nextInt();
		System.out.println("Result is "+(a/b));
		
		}
	
	
	
	
		public static void main(String[] args)
		
		{
			
		
		
		Console g=new Console();
        g.add();
        g.sub();
        g.mul();
        g.div();
		 
		 
	}
}
		
		

