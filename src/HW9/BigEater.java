package HW9;
//• 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//競賽過程。
//• 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//Sleep時間由亂數產生500~3000之間的毫秒數,如圖所示
//• 參考範例:CounterRunnable.java
//• 需留意主執行緒執行順序

public class BigEater implements Runnable{
	int counter = 1;
	Thread thread;
	
	public BigEater(String name) {
		thread = new Thread(this, name);
		thread.start();
	}

	
	public static void main(String[] args) {
		
		System.out.println("------大胃王比賽開始-------");
		BigEater moon = new BigEater("饅頭大"); 
		BigEater james = new BigEater("詹姆士"); 
		
		try {
			moon.thread.join();
			james.thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("------大胃王比賽結束-------");
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		while(counter <= 10) {
			System.out.print(name + "吃第" + counter + "碗飯\n");
			counter++ ;
			try {
				Thread.sleep(500+ (int)(Math.random()*2501));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + "吃完了!");
	}


}
