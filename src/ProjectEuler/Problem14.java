package ProjectEuler;

public class Problem14 {
	public static void main(String[] args){
		int chain;
		int maxChain = 0;
		int maxChainNum = 2;
		int a = 0;
		for (int i = 2; i < 1000000; i++){
			chain = maxChain(i);			
			if(maxChain < chain){
				maxChain = chain;
				maxChainNum = i;
			}
		}
		System.out.println(maxChainNum);
	}
	
	public static int maxChain(int number){
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
