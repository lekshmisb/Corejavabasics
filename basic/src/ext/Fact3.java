package ext;

import java.util.Scanner;

public class Fact3 
{
	public static void main(String[] args) {
		
	
    Scanner sc=new Scanner(System.in);
	int a;
	int b;
	System.out.println("Enter the First number");
	int c=sc.nextInt();
	System.out.println("Enter the second number");
	int d=sc.nextInt();
	System.out.println("Eneter the third number");
	int e=sc.nextInt();
	
	
	
	
	if((c>d)&&(c>e)) 
	{
		
		System.out.println(c+ " is grater");
		
		
	}
	else if(d>e)
	{
		System.out.println(d+ " is greater");
		
		
	}
	else 
	{
		System.out.println(e+ "is greater");
		
	}
	


}
}