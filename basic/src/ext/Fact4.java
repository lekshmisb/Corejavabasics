package ext;

import java.util.Scanner;

public class Fact4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Finding largest of three numbers");
		System.out.println("2:Odd or even");
		System.out.println("3:Multiplication table");
		System.out.println("Please enter the option");
		int a=sc.nextInt();
		
		
		Fact4 p = new Fact4();
		switch(a)
		{
		
		case 1:
			p.largeNum();
			break;
			
		case 2:
			p.oddEven();
			break;
			
		case 3:
			p.multiTable();
			break;
			
		}	
		
		}
		
		void largeNum()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the first number");
			int a=sc.nextInt();
			System.out.println("Enter the second number");
			int b=sc.nextInt();
			System.out.println("Enter the third number");
			int c=sc.nextInt();
			
			if((a>b)&&(a>c))
			{
				System.out.println(a +"is greater");
				
			}
			else if(b>c)
			{
				System.out.println(b +"is greater");
			}
			else 
			{
				System.out.println(c +"is greater");
				
			}
		}
			
			void oddEven()
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number");
				int a=sc.nextInt();
				
				if(a%2==0) 
				{
					System.out.println("The number is even");
				
				}
				
				
				else
				
				{
					System.out.println("The number is odd");
					
				}
				
			}
			
			void multiTable()
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the value");
				int a=sc.nextInt();
				int b=0;
				System.out.println(a+"*"+(++b)+"="+(a*b));
				System.out.println(a+"*"+(++b)+"="+(a*b));
				System.out.println(a+"*"+(++b)+"="+(a*b));
				System.out.println(a+"*"+(++b)+"="+(a*b));
				System.out.println(a+"*"+(++b)+"="+(a*b));
				System.out.println(a+"*"+(++b)+"="+(a*b));
				System.out.println(a+"*"+(++b)+"="+(a*b));
				System.out.println(a+"*"+(++b)+"="+(a*b));
				System.out.println(a+"*"+(++b)+"="+(a*b));
				System.out.println(a+"*"+(++b)+"="+(a*b));
			}
		
			
			
			}
			
			
			
			
		
		
		
		



