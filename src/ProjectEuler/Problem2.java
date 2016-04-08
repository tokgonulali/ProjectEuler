package ProjectEuler;

public class Problem2 {
	public static void main (String args[]){
		int first = 1;
		int second = 2;
		int sum = 0;		
		int evenSum = 2; // second'ı sum'a dahil etmediğim için 2'den başlıyorum..
		for ( int i = 2; i < 150; i++ ) {
			sum = first + second;
			if (sum > 4000000) {
				System.err.println(sum - second + "  4.000.000 " + second);
				break;
			}
			if((sum % 2) == 0){
				evenSum = evenSum + sum;
				System.out.println(evenSum);
			}				
			first = second;			
			second = sum;
		}
		System.out.println("Even sum : "+evenSum );
	}
}
