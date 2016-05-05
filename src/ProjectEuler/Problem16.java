package ProjectEuler;

import java.math.BigInteger;

public class Problem16 {

	public static void main(String[] args) {
//		What is the sum of the digits of the number 2^1000?
		BigInteger num = new BigInteger("2");
		
		for (int i = 1; i < 1000; i++){
			num = num.multiply(new BigInteger("2"));
		}		
		System.out.println("2^1000 = " + num);
		long result = 0;
		for (int i = 0; i < String.valueOf(num).length(); i++){
			result = result + Character.getNumericValue(String.valueOf(num).charAt(i));
		}
		System.out.println("result : "+ result);
	}

}
