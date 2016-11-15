package technical.dto;

public class MovingAverageDTO {
	private String day;
	private int endPrice;
	private int fiveAvg;
	private int twentyAvg;
	private int sixtyAvg;
	private int oneTwentyAvg;
	
	public MovingAverageDTO(){
		
	}

	public MovingAverageDTO(String day, int endPrice, int fiveAvg, int twentyAvg, int sixtyAvg, int oneTwentyAvg) {
		super();
		this.day = day;
		this.endPrice = endPrice;
		this.fiveAvg = fiveAvg;
		this.twentyAvg = twentyAvg;
		this.sixtyAvg = sixtyAvg;
		this.oneTwentyAvg = oneTwentyAvg;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public int getEndPrice() {
		return endPrice;
	}

	public void setEndPrice(int endPrice) {
		this.endPrice = endPrice;
	}

	public int getFiveAvg() {
		return fiveAvg;
	}

	public void setFiveAvg(int fiveAvg) {
		this.fiveAvg = fiveAvg;
	}

	public int getTwentyAvg() {
		return twentyAvg;
	}

	public void setTwentyAvg(int twentyAvg) {
		this.twentyAvg = twentyAvg;
	}

	public int getSixtyAvg() {
		return sixtyAvg;
	}

	public void setSixtyAvg(int sixtyAvg) {
		this.sixtyAvg = sixtyAvg;
	}

	public int getOneTwentyAvg() {
		return oneTwentyAvg;
	}

	public void setOneTwentyAvg(int oneTwentyAvg) {
		this.oneTwentyAvg = oneTwentyAvg;
	}

	@Override
	public String toString() {
		return "MovingAverageDTO [day=" + day + ", endPrice=" + endPrice + ", fiveAvg=" + fiveAvg + ", twentyAvg="
				+ twentyAvg + ", sixtyAvg=" + sixtyAvg + ", oneTwentyAvg=" + oneTwentyAvg + "]";
	}
	
	
	

}
