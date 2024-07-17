package ext;

import java.util.Scanner;

public class Area 
{
	public static void main(String[] args) 
	{
		double area;
		double radious=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=sc.nextInt();
        
		area=Math.PI*radious*radious;
		System.out.println("The result is "+area);
	}

}
