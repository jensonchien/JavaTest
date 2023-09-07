package HW7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Random {
//	請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡
//	(請使用append功能讓每次執行結果都能被保存起來)
	public static void main(String[] args) {
		int randNum = 0;

		try {
			FileWriter fw = new FileWriter("C:\\THA103_Workspace\\JavaHW\\src\\HW7\\Data.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			for (int i = 1; i <= 10; i++) {
				randNum = (int) (Math.random() * 1000) + 1;
				pw.println(randNum);
			}
			pw.println("========");
			pw.close();
			bw.close();
			fw.close();
		} catch (IOException e) {
			System.err.println(e);
		}

	}

}
