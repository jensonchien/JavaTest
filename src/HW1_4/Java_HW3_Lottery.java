package HW1_4;

import java.util.Scanner;

public class Java_HW3_Lottery {

	public static void main(String[] args) {
		System.out.println("請輸入討厭的數字1-9: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int count = 0;
		int[] able =new int [49];
		System.out.println("大樂透不含" + input + "的數字有:");
		for (int lottery = 1; lottery <= 49; lottery++) {
			if (lottery%10 != input && lottery/10 != input) {
				System.out.print(" "+ lottery + "\t");
				count++;
				
				if (count%6 == 0) {
					System.out.println("\n");
				}
				able[(count-1)] = lottery;
			}
			
		}
		System.out.println("\n 總共" + count + "個數字");
		System.out.println("隨機產生6個不重複的樂透數字: ");
		int[] sign =new int [6];
		for (int i = 0; i < sign.length; i++) {
			sign[i] = able[(int)(Math.random()*count)];
			//verify if new lottery [i] is the same with old lottery[j]
			for (int j = 0; j < i; j++) {
				while (sign[j] == sign[i]) {
					//if lottery repeat, produce new one
					sign[i] = able[(int)(Math.random()*count)];
				}
			}
			System.out.print(sign[i] + "\t");
		}
		sc.close();

	}

}
