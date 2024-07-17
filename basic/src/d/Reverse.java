package d;

public class Reverse 

{
	public static void main(String[] args) 
	{
		
	    int rev = 0;
		int a = 98;
		int remainder=a%10;
		rev=remainder+rev*10;
		int q=a/10;
		rev=q+rev*10;
		System.out.println("reverse is: "+rev);
		
		

}
}





