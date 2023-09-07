package HW1_4;

import java.util.Scanner;

public class Java_HW3_GuessNum {
	
	public static void main(String[] args) {
		System.out.println("請開始猜數字 請輸入0-100的數字");
		int correctNum = (int)(Math.random() * 101);
		int bigNum = 100;
		int smallNum = 0;
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		while (input != correctNum) {
			if (input > correctNum) {
				bigNum = input;
				System.out.println("太大囉 請輸入介於"+ smallNum + "至" + bigNum + "的數字");
				input = sc.nextInt();
			} else if (input < correctNum){
				smallNum = input;
				System.out.println("太小囉 請輸入介於"+ smallNum + "至" + bigNum + "的數字");
				input = sc.nextInt();
			} else if (input == correctNum){
				break;
			}
		}
		System.out.println("正確，數字就是" + input);
		sc.close();
		
	}
}
