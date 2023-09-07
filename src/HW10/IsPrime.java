package HW10;

public class IsPrime {

	public static void main(String[] args) {
//		請設計一隻程式,用亂數產生5個介於1~100之間的整數,而輸出結果可以判斷出這5個整數為是否
//		為質數 (提示:Math類別)
		int num = 0;
		boolean primeResult;
		for(int i = 0; i <= 5; i++) {
			num = (int)(Math.random()*100 + 1);
			primeResult =  isPrime(num);
			if(primeResult == true) {
				System.out.println(num + " 是質數");
			} else {
				System.out.println(num + " 不是質數");
			}
			
		}

	}
	
	public static boolean isPrime(int num){
		if (num < 2) {
			return false;
		} else {
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					return false;
				} 
			}
		}
		return true; 
	}

}
