package ProjectEuler;

public class Problem14 {
	public static void main(String[] args){
		int number = 1000000;		 
		long maxChain = 0;
		long maxChainNum = 0;
		long sequence;
		 
		for (int i = 2; i <= number; i++) {
		    int chain = 1;
		    sequence = i;
		    
		    chain = maxChain(sequence);
		 
		    if (chain > maxChain) {
		    	maxChain = chain;
		    	maxChainNum = i;
		    }
		}
		System.out.println(maxChainNum);
	}
	
	public static int maxChain(long number){
		int chain = 0;
		while (number != 1){
			if (number % 2 == 0){
				number = number / 2;
			}else{
				number = number * 3 + 1;
			}
			chain++;
		}
		return chain;
	}
}
