package HW1_4;

public class Java_HW4_ArrAvgSum {

	public static void main(String[] args) {
//		有個一維陣列如下：
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示：陣列，length屬性)
		int[] arr = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		double avg = 0.0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avg = sum/arr.length;
		System.out.println("{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}陣列的平均值="+avg);
		System.out.print("大於平均值的元素: ");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > avg)
				System.out.print(arr[i] + " ");
		}

	}

}
