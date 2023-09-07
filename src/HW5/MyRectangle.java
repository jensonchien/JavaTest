package HW5;

public class MyRectangle {

	private double width;
	private double depth;
	
	public MyRectangle(double width, double depth){
		this.width = width;
		this.depth = depth;
	}
	
	public MyRectangle() {
		
	}
	
	
	
	void setWidth(double width){
		this.width = width;
	}
	void setDepth(double depth) {
		this.depth = depth;
	}
	void getArea() {
		System.out.println("面積為" + width*depth);
	}

}
