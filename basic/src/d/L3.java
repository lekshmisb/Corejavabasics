package d;

import java.util.Scanner;

public class L3 

{
	public static void main(String[] args) 
	
	{
		System.out.println("1:largest of three numbers");
		System.out.println("2:odd or even");
		System.out.println("3:Multiplicationtable");
		System.out.println("Enter the option");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		
		L3 s=new L3();

		switch(a) 
		{
		case 1:
			
			s.largerNum();
			
			
			
			break;
			
			
		case 2:
			
			s.oddEven(); 
			
			
			break;
			
			
			
		case 3:
			s.multi();	
			
			
			break;
		
		
		
		
		}
	}
		void largerNum() 
		{
			Scanner sc=new Scanner(System.in); 
			System.out.println("Enter three numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();	
			int c=sc.nextInt();
			if((a>b)&&(a>c))
			{
				System.out.println(a+"is greater");
				
				
				
			}
			else if(b>c) 
			{
				System.out.println(b+"is greater");
				
				
			}
			else
			{
				System.out.println(c+"is greater");
				
			}
			}
			
			void oddEven()
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number");
				int a=sc.nextInt();
				if(a%2==0) 
				{
					System.out.println("The number is Even");
					
					
				}
				else 
				{
					System.out.println("The number is odd");
				
				
			}
				
		}
			
			void multi()
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number");
				int a=sc.nextInt();
				int d=1;
				System.out.println(d+"*"+a+"="+(d++*a));
				System.out.println(d+"*"+a+"="+(d++*a));
				System.out.println(d+"*"+a+"="+(d++*a));
				System.out.println(d+"*"+a+"="+(d++*a));
				System.out.println(d+"*"+a+"="+(d++*a));
				System.out.println(d+"*"+a+"="+(d++*a));

				
				
				
			}
			
			
		
		
}
	


