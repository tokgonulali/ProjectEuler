package ProjectEuler;

public class Problem7 {
	
	public static void main (String[] args){
		int i = 0;
		int number = 1;		
		while (i < 10001){
			number++;
			if (isPrimeNumber(number)){
				i++;
			}			
		}
		System.out.println(number);
	}
	
	public static boolean isPrimeNumber(int num){
		boolean result = true;
		for (int i = 2; i < num; i++){
			if(num % i == 0){
				result = false;
				break;
			}
		}
		return result;
	}
}
