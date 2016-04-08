package ProjectEuler;

public class Problem5 {

	public static void main (String[] args){
		int total = 2520;
		
		for (int i = 11; i <= 20; i++){
			if (total % i != 0){
				for (int j = 2; j < i; j++){
					if (i % j == 0){
						i = i / j;
					}
				}
				total = total * i;
			}
		}
		System.out.println(total);
	}
}
