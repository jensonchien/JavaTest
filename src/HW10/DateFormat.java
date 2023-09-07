package HW10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormat {
//	請設計一隻程式,讓使用者輸入日期(年月日,例如:20110131)後,可以轉成想要的輸出格式化成(1)年/月/日
//	(2)月/日/年(3)日/月/年三選一,而輸入非指定日期數字格式會顯示出提示訊息如圖
//	(提示:TestFormatter.java, Java API文件,判斷格式可用正規表示法)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputDate = "";
		String dateRegex = "^[0-9]{4}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])$";
		String optionRegex = "^[1-3]$";
		
		String option = "";
		Date date = null;
		
		
		System.out.println("請輸入日期，格式:年月日YYYYMMDD: ");
		inputDate = sc.next();
			
		while(!(inputDate.matches(dateRegex))) {
			System.out.println("輸入錯誤 請重新輸入日期，格式:年月日YYYYMMDD: ");
			inputDate = sc.next();
		}
		
		try {
			date = new SimpleDateFormat("yyyyMMdd").parse(inputDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("選擇輸出格式: (1)年/月/日 (2)月/日/年 (3)日/月/年");
		option = sc.next();
		while(!(option.matches(optionRegex))) {
			System.out.println("輸入錯誤 請重新選擇輸出格式: (1)年/月/日 (2)月/日/年 (3)日/月/年");
			option = sc.next();
		}
		
		
		SimpleDateFormat outputFormat = null;
        
        switch (option) {
        case "1":
        	outputFormat = new SimpleDateFormat("yyyy/MM/dd");
        	break;
        	
        case "2":
        	outputFormat = new SimpleDateFormat("MM/dd/yyyy");
        	break;
        	
        case "3":
        	outputFormat = new SimpleDateFormat("dd/MM/yyyy");
        	break;
        }
        
        System.out.println(outputFormat.format(date));
		sc.close();
	}

}
