import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestTwoHighestNumber{

	@Test
	
	public void testThattwoHighestNumberExist(){

		
		TwoHighestNumber twoHighestNumber = new TwoHighestNumber();

		twoHighestNumber.getTwoHighestNumber(new int[]{1, 4, 5, 6, 9, 7, 10, 9});
		

	}

	@Test

	public void testThattwoHighestNumberReturnsTwoHighestNumbers(){

		
		TwoHighestNumber twoHighestNumber = new TwoHighestNumber();

		int[] actual = twoHighestNumber.getTwoHighestNumber(new int[]{1, 4, 5, 6, 9, 7, 10, 9});

		int[] expected = new int[]{10, 9};

		assertArrayEquals(actual, expected);


		

	}




}