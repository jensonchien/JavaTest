package HW9;
//熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領
//錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過
//3000元,就會停止匯款給熊大;但要是帳戶餘額在2000元
//以下,熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊
//大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢
//已經入帳戶。假設媽媽一次匯款 2000 元,熊大一次提款
//1000元,寫一個Java程式模擬匯款10次與提款10次的情
//形。
class Account {
private int balance = 0;
private boolean shouldNotifyBear = false;

	synchronized void transfer(int money) {
		while(balance >= 3000) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance += money;
		System.out.println("媽媽存了"+ money + "帳戶共有：" + balance);
		
		if(balance > 3000) {
			System.out.println("媽媽看到餘額在3000元以上,暫停匯款");
			if(shouldNotifyBear) {
				System.out.println("熊大被老媽告知帳戶已經有錢");
				shouldNotifyBear = false;
			}
		}
		notify();
	}
	
	synchronized void withdraw(int money) {
		while(balance < money) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			System.out.println("媽媽被熊大要求匯款！");
			shouldNotifyBear = true;
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= money;
		System.out.println("熊大領了" + money + "，帳戶共有：" + balance);
		
		if(balance <= 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
	    }
		notify();
	}
}

class Mother implements Runnable{
	Account account;
	
	Mother(Account account) {
		this.account = account;
	}
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			account.transfer(2000);
		}
	}
}

class Bear implements Runnable{
	Account account;
	
	Bear(Account account) {
		this.account = account;
	}
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			account.withdraw(1000);
		}
	}
}

public class LivingAccount {
	public static void main(String[] args) {
		Account account = new Account();
		Thread ThreadMother = new Thread(new Mother(account));
        Thread ThreadBear = new Thread(new Bear(account));
        ThreadMother.start();
        ThreadBear.start();
        
        try {
			ThreadMother.join();
			ThreadBear.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
	}
	
}
