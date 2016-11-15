package technical.dto;

public class StockDInfoDTO {
	private String code;
	private String name;
	private String day;
	private int startPrice;
	private int highPrice;
	private int lowPrice;
	private int endPrice;
	private int changePrice;
	private int volume;
	private int totalStock;
	private float foreigner;
	
	public StockDInfoDTO(){
		
	}

	public StockDInfoDTO(String code, String name, String day, int startPrice, int highPrice, int lowPrice,
			int endPrice, int changePrice, int volume, int totalStock, float foreigner) {
		super();
		this.code = code;
		this.name = name;
		this.day = day;
		this.startPrice = startPrice;
		this.highPrice = highPrice;
		this.lowPrice = lowPrice;
		this.endPrice = endPrice;
		this.changePrice = changePrice;
		this.volume = volume;
		this.totalStock = totalStock;
		this.foreigner = foreigner;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public int getStartPrice() {
		return startPrice;
	}

	public void setStartPrice(int startPrice) {
		this.startPrice = startPrice;
	}

	public int getHighPrice() {
		return highPrice;
	}

	public void setHighPrice(int highPrice) {
		this.highPrice = highPrice;
	}

	public int getLowPrice() {
		return lowPrice;
	}

	public void setLowPrice(int lowPrice) {
		this.lowPrice = lowPrice;
	}

	public int getEndPrice() {
		return endPrice;
	}

	public void setEndPrice(int endPrice) {
		this.endPrice = endPrice;
	}

	public int getChangePrice() {
		return changePrice;
	}

	public void setChangePrice(int changePrice) {
		this.changePrice = changePrice;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getTotalStock() {
		return totalStock;
	}

	public void setTotalStock(int totalStock) {
		this.totalStock = totalStock;
	}

	public float getForeigner() {
		return foreigner;
	}

	public void setForeigner(float foreigner) {
		this.foreigner = foreigner;
	}

	@Override
	public String toString() {
		return "StockDInfoDTO [code=" + code + ", name=" + name + ", day=" + day + ", startPrice=" + startPrice
				+ ", highPrice=" + highPrice + ", lowPrice=" + lowPrice + ", endPrice=" + endPrice + ", changePrice="
				+ changePrice + ", volume=" + volume + ", totalStock=" + totalStock + ", foreigner=" + foreigner + "]";
	}

	

	
	
	
}
