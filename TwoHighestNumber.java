public class TwoHighestNumber{

	public int[] getTwoHighestNumber(int[] numbers){

		int[] largestNumbers = new int[2];

		int largest = numbers[0];

		int secondLargest = numbers[0];

		for(int number: numbers){

			if(number > largest){


				largest = number;


			}

			if(number > secondLargest && number < largest){

				secondLargest = number;



			}


		}

		largestNumbers[0] = largest;

		largestNumbers[1] = secondLargest;		

		return largestNumbers;




	}




}