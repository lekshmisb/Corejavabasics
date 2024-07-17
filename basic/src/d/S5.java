package d;

public class S5 
{
public static void main(String[] args) 
{
	String stri="  Hello";
	String stri1="";
	
	String stri2="lekshmi";
	String stri3="lekshmi";
	
	
	// contain
	System.out.println(stri.contains("Hel"));
	System.out.println(stri.contains("lo"));
	System.out.println(stri.contains("Good night"));
	
	// isEmpty
	System.out.println(stri.isEmpty());
	System.out.println(stri1.isEmpty());
	
	// replace
	System.out.println(stri.replace('l', 'i'));
	
	//trim
	System.out.println(stri.trim());
	
	//uppercase
	System.out.println(stri.toUpperCase());
	
	//lowercase
	System.out.println(stri.toLowerCase());
	
	//substring
	System.out.println(stri.substring(2,3));
	
	//equals
	System.out.println(stri2.equals(stri3));
	System.out.println(stri2.equals(stri));
	
	//split
	System.out.println();
	
}
}
