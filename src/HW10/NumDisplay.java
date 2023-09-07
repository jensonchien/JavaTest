package HW10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NumDisplay {

//	請設計一隻程式,讓使用者可以輸入一個任意數後,可以選擇要以下列何種表示方法顯示(1)千分位
//	(2)百分比(3)科學記號,而輸入非任意數會顯示提示訊息如圖 (提示: TestFormatter.java, Java API
//	文件, 判斷數字可用正規表示法)
//	補充 (依此類推):
//		輸入12345,千分位為12,345,輸入123,千分位為123
//		輸入0.75,百分比為75%,輸入1,結果為100%
	
	public static void main(String[] args) {
		System.out.println("請輸入一個任意數字：");
		Scanner sc = new Scanner(System.in);
        String numInput = sc.next();
        String numRegex = "^-?[0-9]+(\\.?[0-9]+)?$";
        String option;
        String optionRegex = "^[1-3]$";
		
        while(!numInput.matches(numRegex)) {
        	System.out.println("格式錯誤 請重新輸入數字: ");
        	numInput = sc.next();
        }
        
        Double num = Double.parseDouble(numInput);
        
        System.out.println("選擇要以下列何種表示方法顯示(1)千分位(2)百分比(3)科學記號");
        option = sc.next();
		while(!(option.matches(optionRegex))) {
			System.out.println("輸入錯誤 請重新選擇要以下列何種表示方法顯示(1)千分位(2)百分比(3)科學記號");
			option = sc.next();
		}
		
		DecimalFormat df;
		switch (option) {
        case "1":
            df = new DecimalFormat("#,###");
            System.out.println(df.format(num));
            break;
        case "2":
            df = new DecimalFormat("#%");
            System.out.println(df.format(num));
            break;
        case "3":
            df = new DecimalFormat("#.####E0");
            System.out.println(df.format(num));
            break;
		}
		sc.close();
	}

}
