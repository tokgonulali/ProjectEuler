package ProjectEuler;

public class Problem6 {
	
	public static void main (String[] args){
		int square = 1;
		int sumOfSquare = 0;
		int sumOfNumbers = 0;
		for (int i = 1; i <= 100; i++){
			sumOfNumbers = sumOfNumbers + i;
			square = i * i;
			sumOfSquare = sumOfSquare + square;
		}
		System.out.println((sumOfNumbers * sumOfNumbers) - sumOfSquare);
	}

}
