import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest1_CalculateMethod {

	@Test
	public void testCalculate()
	{
		//fail("Test of Test Run"); //Test of JUnit functionality 
		long sum = Fibonacci.calculate(7);
		assertEquals(13, sum);
	}

	//Test to see whether the Fibonacci calculator returns
	//the right value from the given input
	//(in this case returns 13 from an input of 7)
}
