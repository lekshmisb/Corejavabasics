package h;

import java.util.Scanner;

public class Oddeven 
{
	public static void main(String[] args) 
	{    
		Scanner sc=new Scanner(System.in);
		
	     System.out.println("Please enter a limit");
	     
	     int limit=sc.nextInt();
		  int a=1;
		  while(a<=limit)
		  {
			  
			  System.out.println(a);
			  a++;
			  
		  }
		  Scanner obj=new Scanner(System.in);
		  System.out.println("Enter the number");
		     
		     int d=sc.nextInt();
		     
		     
	 if(d%2==0) 
	      {
		 
		System.out.println("The number is even");
		
		
	}
	else 
	{
		
	System.out.println("The number is odd");
	}
	
	 
	}
}