package ProjectEuler;

public class Problem10 {

	public static void main(String[] args) {
		long sum = 2;
		

		
	 outerloop:
	    for(int i = 3; i < 2000000; i+=2){
	        for(int j = 2; j <= i; j++){
	            if(i != j && i % j == 0){
	                continue outerloop;
	            }
	            else if(j == i){
	                sum = sum + i;
	            }
	        }
	    }
	    System.out.println(sum);
	}
}
