package HW1_4;

public class Java_HW1 {

	public static void main(String[] args) {

//		請設計一隻Java程式，計算12，6這兩個數值的和與積
		System.out.println("1. The sum of 12 and 6 is " + (12 + 6) + "; and the product of 12 and 6 is " + (12 * 6));
//		請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		System.out.println("2. 200 eggs can be divided into " + (200 / 12) + " dozens and " + 200 % 12 + " eggs.");
//		請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		System.out.println("3. 256559 seconds equals " + 256559 / (24 * 60 * 60) + " days, "
				+ (256559 % (24 * 60 * 60) / (60 * 60)) + "hours, " + (256559 % (60 * 60)) / 60 + " minutes, and "
				+ 256559 % 60 + " seconds.");
//		請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		final float PI = 3.1415f;
		System.out.printf("4. The radius of a circle is 5, and the circle area is %.4f%n", PI * 5 * 5);
		System.out.printf(" ,and its length is %.4f%n", PI * 5 * 2);

//		某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//		金加利息共有多少錢 (用複利計算，公式請自行google)
		System.out.println(
				"5. A person have 1.5 million in a bank, and the interest rate is 2%. After 10 years, the person has "
						+ Math.round(1500000 * Math.pow(1.02, 10)) + " dollars.");
//		請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因
		System.out.println("6.");
		System.out.println("5 + 5 = " + 5 + 5); // 兩數字5相加
//		int c = '5';
//		System.out.println(c);
		System.out.println("5 + '5' = " + (5 + '5')); // 數字5加上ASCII值53
		System.out.println("5 + \"5\" = " + (5 + "5")); // 數字5與字串5串接
	}

}
