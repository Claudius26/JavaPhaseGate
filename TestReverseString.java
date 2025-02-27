import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class TestReverseString{

	@Test
	
	public void testThatgetReverseStringFromGivenCharacterExist(){

		
		ReverseString reverString = new ReverseString();

		reverString.getReverseStringFromGivenCharacter("abcdef", "d");
		

	}

	@Test
	
	public void testThatgetReverseStringFromGivenCharacterReturnsStringsInReverse(){

		
		ReverseString reverString = new ReverseString();

		String actual = reverString.getReverseStringFromGivenCharacter("abcdefd", "d");

		String expected = "dcbaef";

		assertEquals(actual, expected);
		

	}




}