package fundamental.dto;


public class EnterpriseTotalDTO {
	String code;
	String name;
	int totalstock;
	
	public EnterpriseTotalDTO(){
		
	}
	
	public EnterpriseTotalDTO(String code, String name, int totalstock) {
		super();
		this.code = code;
		this.name = name;
		this.totalstock = totalstock;
	}
	
	@Override
	public String toString() {
		return "EntTotalDTO [code=" + code + ", name=" + name + ", totalstock=" + totalstock + "]";
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
	public int getTotalstock() {
		return totalstock;
	}
	public void setTotalstock(int totalstock) {
		this.totalstock = totalstock;
	}
	
	
	
}
