package h;

import java.util.Scanner;

public class S4 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int len=name.length()-1;
		int count=0;
		while(len>0)
		{
		if((name.charAt(len)=='W')||(name.charAt(len)=='w'))
		{
			count++;
		
		}
		
	    len--;
		}
		System.out.println("found");
		
		System.out.println(count);
		
	}

}
