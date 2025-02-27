public class TwoSmallestNumbers{

	public int[] getTwoSmallestNumber(int[] numbers){

		int[] smallestNumbers = new int[2];

		int smallest = numbers[0];

		int secondSmallest = numbers[0];

		for(int number: numbers){

			if(number < smallest){


				smallest = number;


			}

			if(number < secondSmallest && number > smallest){

				secondSmallest = number;



			}


		}

		smallestNumbers[0] = smallest;

		smallestNumbers[1] = secondSmallest;		

		return smallestNumbers;


	}

	


}