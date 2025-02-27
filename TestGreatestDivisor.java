import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class TestGreatestDivisor{

	@Test

	public void testGreatestDivisorExist(){

		
		GreatestDivisor greatestDivisor = new GreatestDivisor();

		greatestDivisor.getGreatestDivisor(4, 2);
		

	}

	@Test

	public void testGreatestDivisorReturnsGreatestDivisor(){

		
		GreatestDivisor greatestDivisor = new GreatestDivisor();

		int actual = greatestDivisor.getGreatestDivisor(4, 2);

		int expected = 2;

		assertEquals(actual, expected);

		

		
		

	}

	@Test

	public void testGreatestDivisorReturnsGreatestDivisorIfTheSecondNumberIsGreaterThanThefirst(){

		
		GreatestDivisor greatestDivisor = new GreatestDivisor();

		int actual = greatestDivisor.getGreatestDivisor(16, 24);

		int expected = 8;

		assertEquals(actual, expected);

		int actual = greatestDivisor.getGreatestDivisor(25, 125);

		int expected = 25;

		assertEquals(actual, expected);

		

		
		

	}

}