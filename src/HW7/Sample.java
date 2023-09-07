package HW7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Sample {
//	請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//	Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料

	public static void main(String[] args) {
		int charCount = 0;
		int lineCount = 0;

		File file = new File("C:\\THA103_Workspace\\JavaHW\\src\\HW7\\Sample.txt");

		try {
			FileReader fr = new FileReader(file);

			int i; // 如果要print時，read必須宣告為變數，否則print時，會造成read+1，而導致字元計算減半
			while ((i = fr.read()) != -1) {
				charCount += 1;
//				System.out.println((char)i);
			}
			fr.close();

			String j;
			FileReader fr1 = new FileReader(file);
			BufferedReader br = new BufferedReader(fr1);
			// 為什麼要建立新的fr1?因為fr的游標已經到最後了，造成br，返回0行
			// 否則就要用mark跟reset還原位置
			while ((j = br.readLine()) != null) {
				lineCount += 1;
//				System.out.println(j);
			}
			br.close();
			fr1.close();

		} catch (Exception e) {

		}
		System.out.println("總共有 " + file.length() + " bytes");
		System.out.println("總共有 " + charCount + " 個字元");
		System.out.println("總共有 " + lineCount + " 行");

	}

}
