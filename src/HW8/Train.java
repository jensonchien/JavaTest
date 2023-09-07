package HW8;

import java.util.Objects;

//• 請設計一個Train類別，並包含以下屬性：
//- 班次number，型別為int - 車種type，型別為String - 出發地start，型別為String
//- 目的地dest，型別為String - 票價price，型別為double
//• 設計對應的getter/setter方法，並
public class Train implements Comparable<Train>{
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public Train(int number, String type, String start, String dest, double price) { 
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
		
	public int getNumber() {
		return number;
	}
	
	public void setType(String type) {
		this.type = type;
	}
		
	public String getType() {
		return type;
	}
	
	public void setStart(String start) {
		this.start = start;
	}
		
	public String getStart() {
		return start;
	}
	
	public void setDest(String dest) {
		this.dest = dest;
	}
		
	public String getDest() {
		return dest;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
		
	public double getPrice() {
		return price;
	}
	public String show() {
		return "班次:" + number + " 車種:" + type + " 出發地:" + start + " 目的地:" + dest + " 票價:" + price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}
	
	public int compareTo(Train another) {
		if(this.number > another.number) {
			return -1;
		} else if(this.number < another.number){
			return 1;
		} else {
			return 0;
		}
	}

}
