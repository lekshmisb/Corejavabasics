package ext;

import java.util.Scanner;

public class Fact6 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		
		if(a<0)
		{
			System.out.println("The number is negative");
			
		}
		else if(a==0)
		{
			
			System.out.println("The number is zero");
		}
		else
		{
			System.out.println("The number is positive");
		}
		
	}

}
