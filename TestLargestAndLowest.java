import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestLargestAndLowest{

	@Test
	
	public void testThatLargestAndLowestNumberExist(){

		
		LargestAndLowest largestAndLowest = new LargestAndLowest();

		largestAndLowest.getSmallestAndLargestNumbers(new int[]{1, 2, 3, 6, 9, 7, -6});
		

	}

	@Test

	public void testThattwoSmallestNumbeReturnsTwoSmallestNumbers(){

		
		LargestAndLowest largestAndLowest = new LargestAndLowest();

		int[] actual = largestAndLowest.getSmallestAndLargestNumbers(new int[]{1, 2, 3, 6, 9, 7, 90, -6});

		int[] expected = new int[]{-6, 90};

		assertArrayEquals(actual, expected);


		

	}






}