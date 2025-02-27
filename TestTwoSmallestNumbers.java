import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestTwoSmallestNumbers{

	@Test
	
	public void testThattwoSmallestNumberExist(){

		
		TwoSmallestNumbers twoSmallestNumber = new TwoSmallestNumbers();

		twoSmallestNumber.getTwoSmallestNumber(new int[]{2, 2, 1});
		

	}

	@Test

	public void testThattwoSmallestNumbeReturnsTwoSmallestNumbers(){

		
		TwoSmallestNumbers twoSmallestNumber = new TwoSmallestNumbers();

		int[] actual = twoSmallestNumber.getTwoSmallestNumber(new int[]{2, 2, 1});

		int[] expected = new int[]{1, 2};

		assertArrayEquals(actual, expected);


		

	}



}