package Katas;

public class Calculator {
	public static int add(String numbers) 

	{
		numbers.replace(","," ");
	  /// result = Integer.parseInt(numbers);			
		//System.out.println(result);
        
		int result = 0;
		
		for (int n = 0; n <numbers.length(); n++) 
		{
		   char c =numbers.charAt(n);	
		   result =+ Character.getNumericValue(c);  
		   
		}
		
	  return result;	
	}

	
	
}
