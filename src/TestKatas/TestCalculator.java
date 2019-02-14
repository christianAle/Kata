package TestKatas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Katas.Calculator;


public class TestCalculator {
   
	@Test
	public void testReturnResult() 
	{
		String numbers = "2,2";
		int result = Calculator.add(numbers);
				
	     
		assertEquals(4,result,"the result should be 4");
	}
	
}
