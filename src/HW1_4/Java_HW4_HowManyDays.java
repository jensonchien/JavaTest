package HW1_4;

import java.util.Scanner;

public class Java_HW4_HowManyDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		int month;
		int day;
		
		do {
			System.out.println("請輸入年月日，中間以空格分開");
			year = sc.nextInt();
			month = sc.nextInt();
			day = sc.nextInt();
		} while(checkDate(year, month, day) == false);
		
		if(year % 4 != 0) 
			System.out.println("輸入的日期為該年第"+getDays(month, day)+"天");
			
			else if(year % 4 == 0 && month > 2) 
				System.out.println("輸入的日期為該年第"+ (getDays(month, day)+1) +"天");
				
			else if(year % 4 == 0 && month <= 2)
				System.out.println("輸入的日期為該年第"+getDays(month, day)+"天");

		sc.close();
	}
	public static int getDays(int month, int day) {
		int totalDays = 0;
		int[] date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int i = 0; i < month-1; i++) 
			totalDays += date[i];
		totalDays += day;
		return totalDays;
	}
	
	public static boolean checkDate(int year, int month, int day) {
		boolean check = true;
		int[] date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(month < 1 || month > 12) {
			System.out.println("月份輸入錯誤 請重新輸入");
			check = false;
		} else {
			if(year%4 != 0) {
				if(day > date[month-1] || day <= 0) {
					System.out.println("日期輸入錯誤 請重新輸入");
					check = false;
				}
			} else if(year%4 == 0) {
				date[1] = 29;
				if(day > date[month-1] || day <= 0) {
					System.out.println("日期輸入錯誤 請重新輸入");
					check = false;
				}
			}
		}
		return check;
	}
	

}
