public class PrimeNumber{
	public boolean isNumberPrime(int number){

		for(int count = 1;count <= number;count++){

			if(number % count == 0 && number != 1){

			return true;

			}


			

		}

		
		return false;

	}

	public static void main(String... args){

		int value = 1;

		PrimeNumber numbers = new PrimeNumber();

		 System.out.print(numbers.isNumberPrime(value));
		


	}



}

