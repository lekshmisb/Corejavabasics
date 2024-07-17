package avesham;

import java.security.DomainCombiner;

public class Jackson
{
	void personal()
	{
	System.out.println("Name:Michael Joseph Jackson ");	
	System.out.println("DOB:23/04/1958");
	}
	void known() 
	{
		System.out.println("Contributions:music, dance, and fashion");
		System.out.println("Music video:Thriller");
		
				
		
	}
	void awards()

	{
		
		System.out.println("Awards:Grammy Awards,Brit Awards");
        System.out.println("Albums:The Way You Make Me Feel, Man in the Mirror");	
	}   
     	
	void death()	
	{
		
		System.out.println("Death:25/06/2009");
    
	}
	
	public static void main(String[] args) 
	{
		// create object
		
		Jackson a=new Jackson();
		
		// call function
		
		a.personal();
		a.awards();
		a.death();
		
	}
	
	
	}
	


