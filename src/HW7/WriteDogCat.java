package HW7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriteDogCat {
//	請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
//	意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
//	承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何 (請利用多
//	型簡化本題的程式設計)
	public static void main(String[] args) throws Exception {
		
		//若C:\內沒有data資料夾，請用程式新增這個資料夾
		File dir = new File("C:\\data");
        if (!dir.exists())
            dir.mkdir();
        
        //Dog與Cat類別分別產生兩個物件
		File outputFile = new File("C:\\data\\Object.ser");
		Dog[] dog = new Dog[2];
		dog[0] = new Dog("小黑狗");
		dog[1] = new Dog("小白狗");
		Cat[] cat = new Cat[2];
		cat[0] = new Cat("小白貓");
		cat[1] = new Cat("小黑貓");
		
		//寫到C:\data\Object.ser裡
		FileOutputStream fos = new FileOutputStream(outputFile);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//將Dog與Cat陣列中的元素以for each方式依序寫入目的地
		for (Dog d : dog)
		    oos.writeObject(d);
		for (Cat c : cat)
		    oos.writeObject(c);
		
		oos.close();
		fos.close();
	
	//	請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何
		FileInputStream fis = new FileInputStream(outputFile);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(outputFile.getName() + "檔案內容如下: ");
		System.out.println("--------------------");
		try {
			while (true) {
				((AnimalSpeak) ois.readObject()).speak();
				System.out.println("--------------------");
			}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();

	}

}
