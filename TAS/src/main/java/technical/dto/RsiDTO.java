package technical.dto;

public class RsiDTO {
	private String day;
	private int endPrice;
	private float sevenRsi;
	private float fourteenRsi;
	private float twentyOneRsi;
	
	public RsiDTO(){
		
	}

	public RsiDTO(String day, int endPrice, float sevenRsi, float fourteenRsi, float twentyOneRsi) {
		super();
		this.day = day;
		this.endPrice = endPrice;
		this.sevenRsi = sevenRsi;
		this.fourteenRsi = fourteenRsi;
		this.twentyOneRsi = twentyOneRsi;
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

	public float getSevenRsi() {
		return sevenRsi;
	}

	public void setSevenRsi(float sevenRsi) {
		this.sevenRsi = sevenRsi;
	}

	public float getFourteenRsi() {
		return fourteenRsi;
	}

	public void setFourteenRsi(float fourteenRsi) {
		this.fourteenRsi = fourteenRsi;
	}

	public float getTwentyOneRsi() {
		return twentyOneRsi;
	}

	public void setTwentyOneRsi(float twentyOneRsi) {
		this.twentyOneRsi = twentyOneRsi;
	}

	@Override
	public String toString() {
		return "RsiDTO [day=" + day + ", endPrice=" + endPrice + ", sevenRsi=" + sevenRsi + ", fourteenRsi="
				+ fourteenRsi + ", twentyOneRsi=" + twentyOneRsi + "]";
	}

	
}
