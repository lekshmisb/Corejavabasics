package avesham;

public class Biodata {
	
	void personal()
	{
	System.out.println("Name:Lekshmi SB");
	System.out.println("DOB:11/02/2002");
	System.out.println("Age:22");
	System.out.println("Guardian:Santhosh Kumar G");
	 
	}
	void Education() 
	{
	System.out.println("Qualification:B - Tech");
	System.out.println("College:College of Engineering Pathanapuram");
	System.out.println("Stream:Computer Science and Engineering");
	
	}
	public static void main(String[] args)
	{
		// create object
		
	Biodata a = new Biodata();
	
	// call function
	a.personal();
	a.Education();
	
    
			}
	
	
	
}
