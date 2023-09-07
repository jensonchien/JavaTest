package HW6;

public class Calculator {
	private int x;
	private int y;
//	請加入例外處理機制,讓程式能解決以下狀況:
//		1. x與y同時為0,(產生自訂的CalException例外物件)
//		2. y為負值,而導致x的y次方結果不為整數
//		3. x與y皆正確情況下,會顯示運算後結果
	public Calculator(int x, int y) throws CalException {
		
		if(x == 0 && y == 0) {
			throw new CalException("x與y同時為0");
		} else if(y < 0) {
			throw new CalException("y為負值,而導致x的y次方結果不為整數");
		} else {
			this.x = x;
			this.y = y;
		}	
	}
//	方法為powerXY(int x, int y),功能是會計算x的y次方並回傳結果。
	public int powerXY() {
		return (int) Math.pow(x, y);
	}
	
	
	
	

}
