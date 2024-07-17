package h;

import java.util.Scanner;

public class Self 

{
	public static void main(String[] args) 
	
	{
		System.out.println("1:Largest of three numbers");
		System.out.println("2:odd or even");
		System.out.println("3:Multiplicationtable");
		System.out.println("Please enter the option");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		Self obj=new Self();
		switch(a)
		{
		case 1:
			obj.largerNum();
			break;
			
		case 2:
			obj.oddEven();
			 break;
		case 3:
			obj.multitable();
			break;
		}
		
	}
		void largerNum()
		{
			Scanner a=new Scanner(System.in);
			System.out.println("Enter three numbers");
			int p=a.nextInt();
			int q=a.nextInt();
			int r=a.nextInt();
			
			
		
		if((p>r)&&(q>r))
			
		{
			System.out.println(p+"is greater number");
			
			
			
		}
		else if(q>r)
		{
			System.out.println(q+"is greater number");
			
			
		}
		else
		{
			System.out.println(r+"is greater number");
			
		}
		
		}
		
		void oddEven() 
		{
			Scanner b=new Scanner(System.in);
			System.out.println("Enter the number");
			int a1=b.nextInt();
			
			
			
			
		
		if((a1%2)==0) 
		{
			System.out.println("The number is even");
			
			
			
		}
		else
		{
			
			System.out.println("The number is odd");
			
			
		}
		}
		void multitable() 
		{
			
			Scanner a=new Scanner(System.in);
			int d=a.nextInt();
			int s=1;
			System.out.println(d+"*"+(s)+"="+(d*s));
			System.out.println(d+"*"+(++s)+"="+(d*s));
			System.out.println(d+"*"+(++s)+"="+(d*s));
			System.out.println(d+"*"+(++s)+"="+(d*s));
			System.out.println(d+"*"+(++s)+"="+(d*s));
			System.out.println(d+"*"+(++s)+"="+(d*s));
			System.out.println(d+"*"+(++s)+"="+(d*s));
			System.out.println(d+"*"+(++s)+"="+(d*s));
			System.out.println(d+"*"+(++s)+"="+(d*s));
			System.out.println(d+"*"+(++s)+"="+(d*s));
			
			
			
			
		}
		
		}
		


