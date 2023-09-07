package HW5;

public class RandAvg {

	public static void main(String[] args) {
		randAvg();
	}
	
	public static void randAvg() {
		int sum = 0;
		int rand = 0;
		double avg = 0;
		System.out.println("10個隨機0-100的亂數如下: ");
		for(int i = 0; i < 10; i++) {
			rand = (int)(Math.random()*101);
			System.out.print(rand + " ");
			sum += rand;
		} 
		avg = (double)sum/10;
		System.out.print("\n" + "平均為: " + avg);
	}
}
