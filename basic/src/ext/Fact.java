package ext;

import java.util.Scanner;

public class Fact 
{
	
	void addNum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();		
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		System.out.println("result is "+(a+b));
	}
	
	void subNum()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number");
	int a=sc.nextInt();		
	System.out.println("Enter the second number");
	int b=sc.nextInt();
	System.out.println("result is "+(a-b));

	}

	
  void mulNum()
  
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number");
	int a=sc.nextInt();		
	System.out.println("Enter the second number");
	int b=sc.nextInt();
	System.out.println("result is "+(a*b));
  }
  
	void divNum()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number");
	int a=sc.nextInt();		
	System.out.println("Enter the second number");
	int b=sc.nextInt();
	System.out.println("result is "+(a/b));
	
	}
	
	public static void main(String[] args) 
	{
		Fact obj=new Fact();
		
		obj.addNum();
		obj.subNum();
		obj.mulNum();
		obj.divNum();
		
		
		
		
	}
	
	
	
	
}
