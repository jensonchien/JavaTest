package HW1_4;

import java.util.Scanner;

public class Java_HW4_borrowMoney {
//	請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//	有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//	員工編號: 25 19 27 共 3 人!」
	public static void main(String[] args) {
		int[][] employeeMoney = {
				{25, 32, 8, 19, 27},  //employee number
				{2500, 800, 500, 1000, 1200} //employee money
		};
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("你要借多少錢?");
		int borrow = sc.nextInt();
		System.out.print("有錢可借的員工編號:");
		for(int i = 0; i < employeeMoney[0].length; i++) {
			if(employeeMoney[1][i] >= borrow) {
				System.out.print(employeeMoney[0][i]+" ");
				count += 1;
			}
				
		}
		System.out.println("共 " + count + " 人!");
		sc.close();

	}

}
