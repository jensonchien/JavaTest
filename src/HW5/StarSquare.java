package HW5;

import java.util.Scanner;

public class StarSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入長方形寬度");
	    int width = sc.nextInt();
	    System.out.print("請輸入長方形高度");
	    int height = sc.nextInt();
	    System.out.println("寬為" + width + ",高為" + height+"的長方形如下");
	    starSquare(width, height);
	    sc.close();
	    

	}
	
	public static void starSquare(int width, int height) {
		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	

}
