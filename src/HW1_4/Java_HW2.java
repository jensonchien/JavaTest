package HW1_4;

public class Java_HW2 {
	public static void main(String[] args) {
		
//	請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		int evenSum=0;
		for(int even = 1; even <= 1000; even++) {
			if(even%2==0)
				evenSum += even;
		}
		System.out.println("1~1000偶數和: " + evenSum);
		System.out.print("======= \n");
//	請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		long product = 1;
		for (int i = 1; i <= 10; i++) {
			product *= i;
		}
		System.out.println("for 1～10的連乘積: " + product);
		System.out.print("======= \n");
//	請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		int product2 = 1;
		int i = 1;
		while (i <= 10) {
			product2 *= i;
			i++;
		}
		System.out.println("while 1～10的連乘積: " +product2);
		System.out.print("======= \n");
//	請設計一隻Java程式，輸出結果為以下：
//	1 4 9 16 25 36 49 64 81 100
		int square = 0;
		System.out.print("1~10的平方:");
		do {
			square++;
			System.out.print(" " + (int)Math.pow(square, 2));
		} while (square < 10);
		System.out.print("\n======= \n");
//	阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//	輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		System.out.print("大樂透不含4的數字有:");
		for (int lottery = 1; lottery <= 49; lottery++) {
			if (lottery%10 != 4 && lottery/10 != 4)
				System.out.print(" "+ lottery);
		}
		System.out.print("\n=======\n");
//倒三角
		System.out.println("倒數字三角形");
		for (int max = 10; max>=1; max--) {
			for (int row = 1; row <= max; row++) {
				System.out.print(row+" ");
			}
			System.out.print("\n");
		}
		System.out.print("======= \n");
//ABCDEF三角形
		System.out.println("ABCDEF三角形");
//		int letter = 'A';
//		System.out.print(letter);
//		System.out.print((char)letter);
		for (int row = 0; row<=5; row++) {
			for (int count = 0; count <= row; count++) {
				System.out.print((char)((int)('A')+row));
			}
			System.out.print("\n");
		}
		
		
	}
}
