package fundamental.dto;

public class CheckDTO {
	//check 페이지(코드, 이름, 종가, 주) - code, name, price, week, bps, eps
	
//	----------------- bps체크
	int bps1;
	int eps1;
	
	int bps2;
	int eps2;
	
	int bps3;
	int eps3;
	
	int bps4;
	int eps4;
	
	int bps5;
	int eps5;
//	-----------------	
	
//	----------------- eps 체크
	int bps6;
	int eps6;
	
	int bps9;
	int eps9;
	
	int bps12;
	int eps12;
	
	int bps15;
	int eps15;
	
	int bps16;
	int eps16;
	
	int bps17;
	int eps17;
	
//	----------------------

	
//	----------------------eps체크
	
	String code;
	String name;
	int price;
	int week;
	
	String code1;
	String name1;
	int price1;
	int week1;
	
	String code2;
	String name2;
	int price2;
	int week2;
	
	String code3;
	String name3;
	int price3;
	int week3;
	
	
	String code4;
	String name4;
	int price4;
	int week4;


	String code5;
	String name5;
	int price5;
	int week5;

	
//	----------------------
	
	
//	----------------------
		
	String code6;
	String name6;
	int price6;
	int week6;
	
	String code9;
	String name9;
	int price9;
	int week9;
	
	String code12;
	String name12;
	int price12;
	int week12;
	
	String code16;
	String name16;
	int price16;
	int week16;
	
	String code17;
	String name17;
	int price17;
	int week17;
	
	public CheckDTO(){
		
	}

	public CheckDTO(int bps1, int eps1, int bps2, int eps2, int bps3, int eps3, int bps4, int eps4, int bps5, int eps5,
			int bps6, int eps6, int bps9, int eps9, int bps12, int eps12, int bps15, int eps15, int bps16, int eps16,
			int bps17, int eps17, String code, String name, int price, int week, String code1, String name1, int price1,
			int week1, String code2, String name2, int price2, int week2, String code3, String name3, int price3,
			int week3, String code4, String name4, int price4, int week4, String code5, String name5, int price5,
			int week5, String code6, String name6, int price6, int week6, String code9, String name9, int price9,
			int week9, String code12, String name12, int price12, int week12, String code16, String name16, int price16,
			int week16, String code17, String name17, int price17, int week17) {
		super();
		this.bps1 = bps1;
		this.eps1 = eps1;
		this.bps2 = bps2;
		this.eps2 = eps2;
		this.bps3 = bps3;
		this.eps3 = eps3;
		this.bps4 = bps4;
		this.eps4 = eps4;
		this.bps5 = bps5;
		this.eps5 = eps5;
		this.bps6 = bps6;
		this.eps6 = eps6;
		this.bps9 = bps9;
		this.eps9 = eps9;
		this.bps12 = bps12;
		this.eps12 = eps12;
		this.bps15 = bps15;
		this.eps15 = eps15;
		this.bps16 = bps16;
		this.eps16 = eps16;
		this.bps17 = bps17;
		this.eps17 = eps17;
		this.code = code;
		this.name = name;
		this.price = price;
		this.week = week;
		this.code1 = code1;
		this.name1 = name1;
		this.price1 = price1;
		this.week1 = week1;
		this.code2 = code2;
		this.name2 = name2;
		this.price2 = price2;
		this.week2 = week2;
		this.code3 = code3;
		this.name3 = name3;
		this.price3 = price3;
		this.week3 = week3;
		this.code4 = code4;
		this.name4 = name4;
		this.price4 = price4;
		this.week4 = week4;
		this.code5 = code5;
		this.name5 = name5;
		this.price5 = price5;
		this.week5 = week5;
		this.code6 = code6;
		this.name6 = name6;
		this.price6 = price6;
		this.week6 = week6;
		this.code9 = code9;
		this.name9 = name9;
		this.price9 = price9;
		this.week9 = week9;
		this.code12 = code12;
		this.name12 = name12;
		this.price12 = price12;
		this.week12 = week12;
		this.code16 = code16;
		this.name16 = name16;
		this.price16 = price16;
		this.week16 = week16;
		this.code17 = code17;
		this.name17 = name17;
		this.price17 = price17;
		this.week17 = week17;
	}

	@Override
	public String toString() {
		return "CheckDTO [bps1=" + bps1 + ", eps1=" + eps1 + ", bps2=" + bps2 + ", eps2=" + eps2 + ", bps3=" + bps3
				+ ", eps3=" + eps3 + ", bps4=" + bps4 + ", eps4=" + eps4 + ", bps5=" + bps5 + ", eps5=" + eps5
				+ ", bps6=" + bps6 + ", eps6=" + eps6 + ", bps9=" + bps9 + ", eps9=" + eps9 + ", bps12=" + bps12
				+ ", eps12=" + eps12 + ", bps15=" + bps15 + ", eps15=" + eps15 + ", bps16=" + bps16 + ", eps16=" + eps16
				+ ", bps17=" + bps17 + ", eps17=" + eps17 + ", code=" + code + ", name=" + name + ", price=" + price
				+ ", week=" + week + ", code1=" + code1 + ", name1=" + name1 + ", price1=" + price1 + ", week1=" + week1
				+ ", code2=" + code2 + ", name2=" + name2 + ", price2=" + price2 + ", week2=" + week2 + ", code3="
				+ code3 + ", name3=" + name3 + ", price3=" + price3 + ", week3=" + week3 + ", code4=" + code4
				+ ", name4=" + name4 + ", price4=" + price4 + ", week4=" + week4 + ", code5=" + code5 + ", name5="
				+ name5 + ", price5=" + price5 + ", week5=" + week5 + ", code6=" + code6 + ", name6=" + name6
				+ ", price6=" + price6 + ", week6=" + week6 + ", code9=" + code9 + ", name9=" + name9 + ", price9="
				+ price9 + ", week9=" + week9 + ", code12=" + code12 + ", name12=" + name12 + ", price12=" + price12
				+ ", week12=" + week12 + ", code16=" + code16 + ", name16=" + name16 + ", price16=" + price16
				+ ", week16=" + week16 + ", code17=" + code17 + ", name17=" + name17 + ", price17=" + price17
				+ ", week17=" + week17 + "]";
	}

	public int getBps1() {
		return bps1;
	}

	public void setBps1(int bps1) {
		this.bps1 = bps1;
	}

	public int getEps1() {
		return eps1;
	}

	public void setEps1(int eps1) {
		this.eps1 = eps1;
	}

	public int getBps2() {
		return bps2;
	}

	public void setBps2(int bps2) {
		this.bps2 = bps2;
	}

	public int getEps2() {
		return eps2;
	}

	public void setEps2(int eps2) {
		this.eps2 = eps2;
	}

	public int getBps3() {
		return bps3;
	}

	public void setBps3(int bps3) {
		this.bps3 = bps3;
	}

	public int getEps3() {
		return eps3;
	}

	public void setEps3(int eps3) {
		this.eps3 = eps3;
	}

	public int getBps4() {
		return bps4;
	}

	public void setBps4(int bps4) {
		this.bps4 = bps4;
	}

	public int getEps4() {
		return eps4;
	}

	public void setEps4(int eps4) {
		this.eps4 = eps4;
	}

	public int getBps5() {
		return bps5;
	}

	public void setBps5(int bps5) {
		this.bps5 = bps5;
	}

	public int getEps5() {
		return eps5;
	}

	public void setEps5(int eps5) {
		this.eps5 = eps5;
	}

	public int getBps6() {
		return bps6;
	}

	public void setBps6(int bps6) {
		this.bps6 = bps6;
	}

	public int getEps6() {
		return eps6;
	}

	public void setEps6(int eps6) {
		this.eps6 = eps6;
	}

	public int getBps9() {
		return bps9;
	}

	public void setBps9(int bps9) {
		this.bps9 = bps9;
	}

	public int getEps9() {
		return eps9;
	}

	public void setEps9(int eps9) {
		this.eps9 = eps9;
	}

	public int getBps12() {
		return bps12;
	}

	public void setBps12(int bps12) {
		this.bps12 = bps12;
	}

	public int getEps12() {
		return eps12;
	}

	public void setEps12(int eps12) {
		this.eps12 = eps12;
	}

	public int getBps15() {
		return bps15;
	}

	public void setBps15(int bps15) {
		this.bps15 = bps15;
	}

	public int getEps15() {
		return eps15;
	}

	public void setEps15(int eps15) {
		this.eps15 = eps15;
	}

	public int getBps16() {
		return bps16;
	}

	public void setBps16(int bps16) {
		this.bps16 = bps16;
	}

	public int getEps16() {
		return eps16;
	}

	public void setEps16(int eps16) {
		this.eps16 = eps16;
	}

	public int getBps17() {
		return bps17;
	}

	public void setBps17(int bps17) {
		this.bps17 = bps17;
	}

	public int getEps17() {
		return eps17;
	}

	public void setEps17(int eps17) {
		this.eps17 = eps17;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public String getCode1() {
		return code1;
	}

	public void setCode1(String code1) {
		this.code1 = code1;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public int getPrice1() {
		return price1;
	}

	public void setPrice1(int price1) {
		this.price1 = price1;
	}

	public int getWeek1() {
		return week1;
	}

	public void setWeek1(int week1) {
		this.week1 = week1;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public int getPrice2() {
		return price2;
	}

	public void setPrice2(int price2) {
		this.price2 = price2;
	}

	public int getWeek2() {
		return week2;
	}

	public void setWeek2(int week2) {
		this.week2 = week2;
	}

	public String getCode3() {
		return code3;
	}

	public void setCode3(String code3) {
		this.code3 = code3;
	}

	public String getName3() {
		return name3;
	}

	public void setName3(String name3) {
		this.name3 = name3;
	}

	public int getPrice3() {
		return price3;
	}

	public void setPrice3(int price3) {
		this.price3 = price3;
	}

	public int getWeek3() {
		return week3;
	}

	public void setWeek3(int week3) {
		this.week3 = week3;
	}

	public String getCode4() {
		return code4;
	}

	public void setCode4(String code4) {
		this.code4 = code4;
	}

	public String getName4() {
		return name4;
	}

	public void setName4(String name4) {
		this.name4 = name4;
	}

	public int getPrice4() {
		return price4;
	}

	public void setPrice4(int price4) {
		this.price4 = price4;
	}

	public int getWeek4() {
		return week4;
	}

	public void setWeek4(int week4) {
		this.week4 = week4;
	}

	public String getCode5() {
		return code5;
	}

	public void setCode5(String code5) {
		this.code5 = code5;
	}

	public String getName5() {
		return name5;
	}

	public void setName5(String name5) {
		this.name5 = name5;
	}

	public int getPrice5() {
		return price5;
	}

	public void setPrice5(int price5) {
		this.price5 = price5;
	}

	public int getWeek5() {
		return week5;
	}

	public void setWeek5(int week5) {
		this.week5 = week5;
	}

	public String getCode6() {
		return code6;
	}

	public void setCode6(String code6) {
		this.code6 = code6;
	}

	public String getName6() {
		return name6;
	}

	public void setName6(String name6) {
		this.name6 = name6;
	}

	public int getPrice6() {
		return price6;
	}

	public void setPrice6(int price6) {
		this.price6 = price6;
	}

	public int getWeek6() {
		return week6;
	}

	public void setWeek6(int week6) {
		this.week6 = week6;
	}

	public String getCode9() {
		return code9;
	}

	public void setCode9(String code9) {
		this.code9 = code9;
	}

	public String getName9() {
		return name9;
	}

	public void setName9(String name9) {
		this.name9 = name9;
	}

	public int getPrice9() {
		return price9;
	}

	public void setPrice9(int price9) {
		this.price9 = price9;
	}

	public int getWeek9() {
		return week9;
	}

	public void setWeek9(int week9) {
		this.week9 = week9;
	}

	public String getCode12() {
		return code12;
	}

	public void setCode12(String code12) {
		this.code12 = code12;
	}

	public String getName12() {
		return name12;
	}

	public void setName12(String name12) {
		this.name12 = name12;
	}

	public int getPrice12() {
		return price12;
	}

	public void setPrice12(int price12) {
		this.price12 = price12;
	}

	public int getWeek12() {
		return week12;
	}

	public void setWeek12(int week12) {
		this.week12 = week12;
	}

	public String getCode16() {
		return code16;
	}

	public void setCode16(String code16) {
		this.code16 = code16;
	}

	public String getName16() {
		return name16;
	}

	public void setName16(String name16) {
		this.name16 = name16;
	}

	public int getPrice16() {
		return price16;
	}

	public void setPrice16(int price16) {
		this.price16 = price16;
	}

	public int getWeek16() {
		return week16;
	}

	public void setWeek16(int week16) {
		this.week16 = week16;
	}

	public String getCode17() {
		return code17;
	}

	public void setCode17(String code17) {
		this.code17 = code17;
	}

	public String getName17() {
		return name17;
	}

	public void setName17(String name17) {
		this.name17 = name17;
	}

	public int getPrice17() {
		return price17;
	}

	public void setPrice17(int price17) {
		this.price17 = price17;
	}

	public int getWeek17() {
		return week17;
	}

	public void setWeek17(int week17) {
		this.week17 = week17;
	}
	
}
