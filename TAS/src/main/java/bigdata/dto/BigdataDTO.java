package bigdata.dto;



public class BigdataDTO {
	

	private String stockName;
	private int nameCount;
	
	public BigdataDTO(){
		
	}

	public BigdataDTO(String stockName, int nameCount) {
		super();
		this.stockName = stockName;
		this.nameCount = nameCount;
	}
	
	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getNameCount() {
		return nameCount;
	}

	public void setNameCount(int nameCount) {
		this.nameCount = nameCount;
	}

	
	@Override
	public String toString() {
		return "BigdataDTO [stockName=" + stockName + ", nameCount=" + nameCount + "]";
	}
	
	
}
