package h;

import java.util.Scanner;

public class Hw

{
	public static void main(String[] args) 
	{
        Scanner obj=new Scanner(System.in);
		System.out.println("1:adding");
		System.out.println("2:subtracting");
		
		
		System.out.println("Please enter the option");
	    int a=obj.nextInt();
	Hw ab=new Hw();
	
		
	switch(a)
	{
	case 1:
		
		ab.addNum();
		
		break;
		
		
	case 2:
		ab.subNum();
			break;
	
	
	default:
	{
	System.out.println("Invalid");	
		
	}
	}}
	void addNum()
	{
		System.out.println("Enter the numbers");
		Scanner b=new Scanner(System.in);
		int p=b.nextInt();
		int q=b.nextInt();
		System.out.println("The number is " +(p+q));
		
		
		
		
	}
	void subNum()
	{
		System.out.println("Enter the numbers");
		Scanner b=new Scanner(System.in);
		int p=b.nextInt();
		int q=b.nextInt();
		System.out.println("The number is " +(p-q));
		
		
		
		
	}
	
	}
	
	
	
	


	