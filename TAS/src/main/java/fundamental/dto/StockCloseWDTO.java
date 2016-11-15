package fundamental.dto;

public class StockCloseWDTO {
	String code;
	int week;
	int price;
	
	public StockCloseWDTO(){
		
	}
	public StockCloseWDTO(String code, int week, int price) {
		super();
		this.code = code;
		this.week = week;
		this.price = price;
	}
	@Override
	public String toString() {
		return "StockCloseWDTO [code=" + code + ", week=" + week + ", price=" + price + "]";
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getWeek() {
		return week;
	}
	public void setWeek(int week) {
		this.week = week;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
