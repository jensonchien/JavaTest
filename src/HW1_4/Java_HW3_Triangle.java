package HW1_4;

import java.util.Arrays;
import java.util.Scanner;

public class Java_HW3_Triangle {

	public static void main(String[] args) {
		//輸入三角形三邊長 確認是哪種三角形
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三角形的三邊長，每個數字之間以空格隔開(正整數):");
		int side[] = new int [3];
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
		
		side[0] = side1;
		side[1] = side2;
		side[2] = side3;
		Arrays.sort(side);
		
		if (side1+side2>side3 && side1+side3>side2 && side2+side3>side1) {
			if (side1==side2 && side2 == side3) {
				System.out.println("這是正三角形");
			} else if ((side1 != side3 || side1 != side2) && (side1 == side2 || side1==side3 || side2==side3)) {
				System.out.println("這是等腰三角形");
			} else if (Math.pow(side1, 2) == (Math.pow(side2, 2) + Math.pow(side3, 2)) || Math.pow(side2, 2) == (Math.pow(side1, 2) + Math.pow(side3, 2)) || Math.pow(side3, 2) == (Math.pow(side1, 2) + Math.pow(side2, 2))) {
				System.out.println("這是直角三角形");
			} else {
				System.out.println("這是其他三角形");
			}
		} else {
			System.out.println("這不是三角形");
		}
		
		System.out.println("用陣列再判斷一次: ");
		if (side[0]+side[1]>side[2]) {
			if (side[0]==side[1] && side[1] == side[2]) {
				System.out.println("這是正三角形");
			} else if ((side[0] != side[2] || side[0] != side[1]) && (side[0] == side[1] || side[0]==side[2] || side[1]==side[2])) {
				System.out.println("這是等腰三角形");
			} else if (Math.pow(side[2], 2) == (Math.pow(side[0], 2) + Math.pow(side[1], 2))) {
				System.out.println("這是直角三角形");
			} else {
				System.out.println("這是其他三角形");
			}
		} else {
			System.out.println("這不是三角形");
		}
		sc.close();

	}

}
