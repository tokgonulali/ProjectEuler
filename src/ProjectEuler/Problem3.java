package ProjectEuler;

import java.math.BigInteger;

public class Problem3 {
	public static void main (String args[]){
		
		BigInteger num = BigInteger.valueOf(600851475143L);
		BigInteger i = new BigInteger("2");
		
		while (i.compareTo(num) == -1 || i.compareTo(num) == 0){		
	        while (num.mod(i) == BigInteger.valueOf(0L)) {	          
	          num = num.divide(i);
	          System.out.println(i);
	        }
	        i = i.add(BigInteger.ONE);
	    }
	}

}
