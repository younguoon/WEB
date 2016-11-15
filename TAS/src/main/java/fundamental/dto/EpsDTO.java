package fundamental.dto;

public class EpsDTO {
	//BPS = 전분기 * (1+((다음분기/이번분기)^(1/(이번~다음분기일수)-1))
	int yearCount; //매년 주(week) 갯수 카운트
	String code;
	
	//매년 EPS 6 9 12 16배
	int eps06y;
	int eps06y6; //EPS
	int eps06y9; //EPS
	int eps06y12; //EPS
	int eps06y16; //EPS
	int eps06y20;
	int eps06y30;
	int eps06y50;
	
	int eps07y;
	int eps07y6; //EPS
	int eps07y9; //EPS
	int eps07y12; //EPS
	int eps07y16; //EPS
	int eps07y20;
	int eps07y30;
	int eps07y50;
	
	int eps08y;
	int eps08y6; //EPS
	int eps08y9; //EPS
	int eps08y12; //EPS
	int eps08y16; //EPS
	int eps08y20;
	int eps08y30;
	int eps08y50;
	
	int eps09y;
	int eps09y6; //EPS
	int eps09y9; //EPS
	int eps09y12; //EPS
	int eps09y16; //EPS
	int eps09y20;
	int eps09y30;
	int eps09y50;
	
	int eps10y;
	int eps10y6; //EPS
	int eps10y9; //EPS
	int eps10y12; //EPS
	int eps10y16; //EPS
	int eps10y20;
	int eps10y30;
	int eps10y50;
	
	int eps11y;
	int eps11y6; //EPS
	int eps11y9; //EPS
	int eps11y12; //EPS
	int eps11y16; //EPS
	int eps11y20;
	int eps11y30;
	int eps11y50;
	
	int eps12y;
	int eps12y6; //EPS
	int eps12y9; //EPS
	int eps12y12; //EPS
	int eps12y16; //EPS
	int eps12y20;
	int eps12y30;
	int eps12y50;
	
	int eps13y;
	int eps13y6; //EPS
	int eps13y9; //EPS
	int eps13y12; //EPS
	int eps13y16; //EPS
	int eps13y20;
	int eps13y30;
	int eps13y50;
	
	int eps14y;
	int eps14y6; //EPS
	int eps14y9; //EPS
	int eps14y12; //EPS
	int eps14y16; //EPS
	int eps14y20;
	int eps14y30;
	int eps14y50;
	
	int eps15y;
	int eps15y6; //EPS
	int eps15y9; //EPS
	int eps15y12; //EPS
	int eps15y16; //EPS
	int eps15y20;
	int eps15y30;
	int eps15y50;
	
	int eps16y;
	int eps16y6; //EPS
	int eps16y9; //EPS
	int eps16y12; //EPS
	int eps16y16; //EPS
	int eps16y20;
	int eps16y30;
	int eps16y50;
	
	int eps17y;
	int eps17y6; //EPS
	int eps17y9; //EPS
	int eps17y12; //EPS
	int eps17y16; //EPS
	int eps17y20;
	int eps17y30;
	int eps17y50;
	
	int eps18y;
	int eps18y6; //EPS
	int eps18y9; //EPS
	int eps18y12; //EPS
	int eps18y16; //EPS
	int eps18y20;
	int eps18y30;
	int eps18y50;
	
	int eps19y;
	int eps19y6; //EPS
	int eps19y9; //EPS
	int eps19y12; //EPS
	int eps19y16; //EPS
	int eps19y20;
	int eps19y30;
	int eps19y50;
	
	int eps20y;
	int eps20y6; //EPS
	int eps20y9; //EPS
	int eps20y12; //EPS
	int eps20y16; //EPS
	int eps20y20;
	int eps20y30;
	int eps20y50;
	
	
	public EpsDTO(){
		
	}


	public EpsDTO(int yearCount, String code, int eps06y, int eps06y6, int eps06y9, int eps06y12, int eps06y16,
			int eps06y20, int eps06y30, int eps06y50, int eps07y, int eps07y6, int eps07y9, int eps07y12, int eps07y16,
			int eps07y20, int eps07y30, int eps07y50, int eps08y, int eps08y6, int eps08y9, int eps08y12, int eps08y16,
			int eps08y20, int eps08y30, int eps08y50, int eps09y, int eps09y6, int eps09y9, int eps09y12, int eps09y16,
			int eps09y20, int eps09y30, int eps09y50, int eps10y, int eps10y6, int eps10y9, int eps10y12, int eps10y16,
			int eps10y20, int eps10y30, int eps10y50, int eps11y, int eps11y6, int eps11y9, int eps11y12, int eps11y16,
			int eps11y20, int eps11y30, int eps11y50, int eps12y, int eps12y6, int eps12y9, int eps12y12, int eps12y16,
			int eps12y20, int eps12y30, int eps12y50, int eps13y, int eps13y6, int eps13y9, int eps13y12, int eps13y16,
			int eps13y20, int eps13y30, int eps13y50, int eps14y, int eps14y6, int eps14y9, int eps14y12, int eps14y16,
			int eps14y20, int eps14y30, int eps14y50, int eps15y, int eps15y6, int eps15y9, int eps15y12, int eps15y16,
			int eps15y20, int eps15y30, int eps15y50, int eps16y, int eps16y6, int eps16y9, int eps16y12, int eps16y16,
			int eps16y20, int eps16y30, int eps16y50, int eps17y, int eps17y6, int eps17y9, int eps17y12, int eps17y16,
			int eps17y20, int eps17y30, int eps17y50, int eps18y, int eps18y6, int eps18y9, int eps18y12, int eps18y16,
			int eps18y20, int eps18y30, int eps18y50, int eps19y, int eps19y6, int eps19y9, int eps19y12, int eps19y16,
			int eps19y20, int eps19y30, int eps19y50, int eps20y, int eps20y6, int eps20y9, int eps20y12, int eps20y16,
			int eps20y20, int eps20y30, int eps20y50) {
		super();
		this.yearCount = yearCount;
		this.code = code;
		this.eps06y = eps06y;
		this.eps06y6 = eps06y6;
		this.eps06y9 = eps06y9;
		this.eps06y12 = eps06y12;
		this.eps06y16 = eps06y16;
		this.eps06y20 = eps06y20;
		this.eps06y30 = eps06y30;
		this.eps06y50 = eps06y50;
		this.eps07y = eps07y;
		this.eps07y6 = eps07y6;
		this.eps07y9 = eps07y9;
		this.eps07y12 = eps07y12;
		this.eps07y16 = eps07y16;
		this.eps07y20 = eps07y20;
		this.eps07y30 = eps07y30;
		this.eps07y50 = eps07y50;
		this.eps08y = eps08y;
		this.eps08y6 = eps08y6;
		this.eps08y9 = eps08y9;
		this.eps08y12 = eps08y12;
		this.eps08y16 = eps08y16;
		this.eps08y20 = eps08y20;
		this.eps08y30 = eps08y30;
		this.eps08y50 = eps08y50;
		this.eps09y = eps09y;
		this.eps09y6 = eps09y6;
		this.eps09y9 = eps09y9;
		this.eps09y12 = eps09y12;
		this.eps09y16 = eps09y16;
		this.eps09y20 = eps09y20;
		this.eps09y30 = eps09y30;
		this.eps09y50 = eps09y50;
		this.eps10y = eps10y;
		this.eps10y6 = eps10y6;
		this.eps10y9 = eps10y9;
		this.eps10y12 = eps10y12;
		this.eps10y16 = eps10y16;
		this.eps10y20 = eps10y20;
		this.eps10y30 = eps10y30;
		this.eps10y50 = eps10y50;
		this.eps11y = eps11y;
		this.eps11y6 = eps11y6;
		this.eps11y9 = eps11y9;
		this.eps11y12 = eps11y12;
		this.eps11y16 = eps11y16;
		this.eps11y20 = eps11y20;
		this.eps11y30 = eps11y30;
		this.eps11y50 = eps11y50;
		this.eps12y = eps12y;
		this.eps12y6 = eps12y6;
		this.eps12y9 = eps12y9;
		this.eps12y12 = eps12y12;
		this.eps12y16 = eps12y16;
		this.eps12y20 = eps12y20;
		this.eps12y30 = eps12y30;
		this.eps12y50 = eps12y50;
		this.eps13y = eps13y;
		this.eps13y6 = eps13y6;
		this.eps13y9 = eps13y9;
		this.eps13y12 = eps13y12;
		this.eps13y16 = eps13y16;
		this.eps13y20 = eps13y20;
		this.eps13y30 = eps13y30;
		this.eps13y50 = eps13y50;
		this.eps14y = eps14y;
		this.eps14y6 = eps14y6;
		this.eps14y9 = eps14y9;
		this.eps14y12 = eps14y12;
		this.eps14y16 = eps14y16;
		this.eps14y20 = eps14y20;
		this.eps14y30 = eps14y30;
		this.eps14y50 = eps14y50;
		this.eps15y = eps15y;
		this.eps15y6 = eps15y6;
		this.eps15y9 = eps15y9;
		this.eps15y12 = eps15y12;
		this.eps15y16 = eps15y16;
		this.eps15y20 = eps15y20;
		this.eps15y30 = eps15y30;
		this.eps15y50 = eps15y50;
		this.eps16y = eps16y;
		this.eps16y6 = eps16y6;
		this.eps16y9 = eps16y9;
		this.eps16y12 = eps16y12;
		this.eps16y16 = eps16y16;
		this.eps16y20 = eps16y20;
		this.eps16y30 = eps16y30;
		this.eps16y50 = eps16y50;
		this.eps17y = eps17y;
		this.eps17y6 = eps17y6;
		this.eps17y9 = eps17y9;
		this.eps17y12 = eps17y12;
		this.eps17y16 = eps17y16;
		this.eps17y20 = eps17y20;
		this.eps17y30 = eps17y30;
		this.eps17y50 = eps17y50;
		this.eps18y = eps18y;
		this.eps18y6 = eps18y6;
		this.eps18y9 = eps18y9;
		this.eps18y12 = eps18y12;
		this.eps18y16 = eps18y16;
		this.eps18y20 = eps18y20;
		this.eps18y30 = eps18y30;
		this.eps18y50 = eps18y50;
		this.eps19y = eps19y;
		this.eps19y6 = eps19y6;
		this.eps19y9 = eps19y9;
		this.eps19y12 = eps19y12;
		this.eps19y16 = eps19y16;
		this.eps19y20 = eps19y20;
		this.eps19y30 = eps19y30;
		this.eps19y50 = eps19y50;
		this.eps20y = eps20y;
		this.eps20y6 = eps20y6;
		this.eps20y9 = eps20y9;
		this.eps20y12 = eps20y12;
		this.eps20y16 = eps20y16;
		this.eps20y20 = eps20y20;
		this.eps20y30 = eps20y30;
		this.eps20y50 = eps20y50;
	}


	@Override
	public String toString() {
		return "EpsDTO [yearCount=" + yearCount + ", code=" + code + ", eps06y=" + eps06y + ", eps06y6=" + eps06y6
				+ ", eps06y9=" + eps06y9 + ", eps06y12=" + eps06y12 + ", eps06y16=" + eps06y16 + ", eps06y20="
				+ eps06y20 + ", eps06y30=" + eps06y30 + ", eps06y50=" + eps06y50 + ", eps07y=" + eps07y + ", eps07y6="
				+ eps07y6 + ", eps07y9=" + eps07y9 + ", eps07y12=" + eps07y12 + ", eps07y16=" + eps07y16 + ", eps07y20="
				+ eps07y20 + ", eps07y30=" + eps07y30 + ", eps07y50=" + eps07y50 + ", eps08y=" + eps08y + ", eps08y6="
				+ eps08y6 + ", eps08y9=" + eps08y9 + ", eps08y12=" + eps08y12 + ", eps08y16=" + eps08y16 + ", eps08y20="
				+ eps08y20 + ", eps08y30=" + eps08y30 + ", eps08y50=" + eps08y50 + ", eps09y=" + eps09y + ", eps09y6="
				+ eps09y6 + ", eps09y9=" + eps09y9 + ", eps09y12=" + eps09y12 + ", eps09y16=" + eps09y16 + ", eps09y20="
				+ eps09y20 + ", eps09y30=" + eps09y30 + ", eps09y50=" + eps09y50 + ", eps10y=" + eps10y + ", eps10y6="
				+ eps10y6 + ", eps10y9=" + eps10y9 + ", eps10y12=" + eps10y12 + ", eps10y16=" + eps10y16 + ", eps10y20="
				+ eps10y20 + ", eps10y30=" + eps10y30 + ", eps10y50=" + eps10y50 + ", eps11y=" + eps11y + ", eps11y6="
				+ eps11y6 + ", eps11y9=" + eps11y9 + ", eps11y12=" + eps11y12 + ", eps11y16=" + eps11y16 + ", eps11y20="
				+ eps11y20 + ", eps11y30=" + eps11y30 + ", eps11y50=" + eps11y50 + ", eps12y=" + eps12y + ", eps12y6="
				+ eps12y6 + ", eps12y9=" + eps12y9 + ", eps12y12=" + eps12y12 + ", eps12y16=" + eps12y16 + ", eps12y20="
				+ eps12y20 + ", eps12y30=" + eps12y30 + ", eps12y50=" + eps12y50 + ", eps13y=" + eps13y + ", eps13y6="
				+ eps13y6 + ", eps13y9=" + eps13y9 + ", eps13y12=" + eps13y12 + ", eps13y16=" + eps13y16 + ", eps13y20="
				+ eps13y20 + ", eps13y30=" + eps13y30 + ", eps13y50=" + eps13y50 + ", eps14y=" + eps14y + ", eps14y6="
				+ eps14y6 + ", eps14y9=" + eps14y9 + ", eps14y12=" + eps14y12 + ", eps14y16=" + eps14y16 + ", eps14y20="
				+ eps14y20 + ", eps14y30=" + eps14y30 + ", eps14y50=" + eps14y50 + ", eps15y=" + eps15y + ", eps15y6="
				+ eps15y6 + ", eps15y9=" + eps15y9 + ", eps15y12=" + eps15y12 + ", eps15y16=" + eps15y16 + ", eps15y20="
				+ eps15y20 + ", eps15y30=" + eps15y30 + ", eps15y50=" + eps15y50 + ", eps16y=" + eps16y + ", eps16y6="
				+ eps16y6 + ", eps16y9=" + eps16y9 + ", eps16y12=" + eps16y12 + ", eps16y16=" + eps16y16 + ", eps16y20="
				+ eps16y20 + ", eps16y30=" + eps16y30 + ", eps16y50=" + eps16y50 + ", eps17y=" + eps17y + ", eps17y6="
				+ eps17y6 + ", eps17y9=" + eps17y9 + ", eps17y12=" + eps17y12 + ", eps17y16=" + eps17y16 + ", eps17y20="
				+ eps17y20 + ", eps17y30=" + eps17y30 + ", eps17y50=" + eps17y50 + ", eps18y=" + eps18y + ", eps18y6="
				+ eps18y6 + ", eps18y9=" + eps18y9 + ", eps18y12=" + eps18y12 + ", eps18y16=" + eps18y16 + ", eps18y20="
				+ eps18y20 + ", eps18y30=" + eps18y30 + ", eps18y50=" + eps18y50 + ", eps19y=" + eps19y + ", eps19y6="
				+ eps19y6 + ", eps19y9=" + eps19y9 + ", eps19y12=" + eps19y12 + ", eps19y16=" + eps19y16 + ", eps19y20="
				+ eps19y20 + ", eps19y30=" + eps19y30 + ", eps19y50=" + eps19y50 + ", eps20y=" + eps20y + ", eps20y6="
				+ eps20y6 + ", eps20y9=" + eps20y9 + ", eps20y12=" + eps20y12 + ", eps20y16=" + eps20y16 + ", eps20y20="
				+ eps20y20 + ", eps20y30=" + eps20y30 + ", eps20y50=" + eps20y50 + "]";
	}


	public int getYearCount() {
		return yearCount;
	}


	public void setYearCount(int yearCount) {
		this.yearCount = yearCount;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public int getEps06y() {
		return eps06y;
	}


	public void setEps06y(int eps06y) {
		this.eps06y = eps06y;
	}


	public int getEps06y6() {
		return eps06y6;
	}


	public void setEps06y6(int eps06y6) {
		this.eps06y6 = eps06y6;
	}


	public int getEps06y9() {
		return eps06y9;
	}


	public void setEps06y9(int eps06y9) {
		this.eps06y9 = eps06y9;
	}


	public int getEps06y12() {
		return eps06y12;
	}


	public void setEps06y12(int eps06y12) {
		this.eps06y12 = eps06y12;
	}


	public int getEps06y16() {
		return eps06y16;
	}


	public void setEps06y16(int eps06y16) {
		this.eps06y16 = eps06y16;
	}


	public int getEps06y20() {
		return eps06y20;
	}


	public void setEps06y20(int eps06y20) {
		this.eps06y20 = eps06y20;
	}


	public int getEps06y30() {
		return eps06y30;
	}


	public void setEps06y30(int eps06y30) {
		this.eps06y30 = eps06y30;
	}


	public int getEps06y50() {
		return eps06y50;
	}


	public void setEps06y50(int eps06y50) {
		this.eps06y50 = eps06y50;
	}


	public int getEps07y() {
		return eps07y;
	}


	public void setEps07y(int eps07y) {
		this.eps07y = eps07y;
	}


	public int getEps07y6() {
		return eps07y6;
	}


	public void setEps07y6(int eps07y6) {
		this.eps07y6 = eps07y6;
	}


	public int getEps07y9() {
		return eps07y9;
	}


	public void setEps07y9(int eps07y9) {
		this.eps07y9 = eps07y9;
	}


	public int getEps07y12() {
		return eps07y12;
	}


	public void setEps07y12(int eps07y12) {
		this.eps07y12 = eps07y12;
	}


	public int getEps07y16() {
		return eps07y16;
	}


	public void setEps07y16(int eps07y16) {
		this.eps07y16 = eps07y16;
	}


	public int getEps07y20() {
		return eps07y20;
	}


	public void setEps07y20(int eps07y20) {
		this.eps07y20 = eps07y20;
	}


	public int getEps07y30() {
		return eps07y30;
	}


	public void setEps07y30(int eps07y30) {
		this.eps07y30 = eps07y30;
	}


	public int getEps07y50() {
		return eps07y50;
	}


	public void setEps07y50(int eps07y50) {
		this.eps07y50 = eps07y50;
	}


	public int getEps08y() {
		return eps08y;
	}


	public void setEps08y(int eps08y) {
		this.eps08y = eps08y;
	}


	public int getEps08y6() {
		return eps08y6;
	}


	public void setEps08y6(int eps08y6) {
		this.eps08y6 = eps08y6;
	}


	public int getEps08y9() {
		return eps08y9;
	}


	public void setEps08y9(int eps08y9) {
		this.eps08y9 = eps08y9;
	}


	public int getEps08y12() {
		return eps08y12;
	}


	public void setEps08y12(int eps08y12) {
		this.eps08y12 = eps08y12;
	}


	public int getEps08y16() {
		return eps08y16;
	}


	public void setEps08y16(int eps08y16) {
		this.eps08y16 = eps08y16;
	}


	public int getEps08y20() {
		return eps08y20;
	}


	public void setEps08y20(int eps08y20) {
		this.eps08y20 = eps08y20;
	}


	public int getEps08y30() {
		return eps08y30;
	}


	public void setEps08y30(int eps08y30) {
		this.eps08y30 = eps08y30;
	}


	public int getEps08y50() {
		return eps08y50;
	}


	public void setEps08y50(int eps08y50) {
		this.eps08y50 = eps08y50;
	}


	public int getEps09y() {
		return eps09y;
	}


	public void setEps09y(int eps09y) {
		this.eps09y = eps09y;
	}


	public int getEps09y6() {
		return eps09y6;
	}


	public void setEps09y6(int eps09y6) {
		this.eps09y6 = eps09y6;
	}


	public int getEps09y9() {
		return eps09y9;
	}


	public void setEps09y9(int eps09y9) {
		this.eps09y9 = eps09y9;
	}


	public int getEps09y12() {
		return eps09y12;
	}


	public void setEps09y12(int eps09y12) {
		this.eps09y12 = eps09y12;
	}


	public int getEps09y16() {
		return eps09y16;
	}


	public void setEps09y16(int eps09y16) {
		this.eps09y16 = eps09y16;
	}


	public int getEps09y20() {
		return eps09y20;
	}


	public void setEps09y20(int eps09y20) {
		this.eps09y20 = eps09y20;
	}


	public int getEps09y30() {
		return eps09y30;
	}


	public void setEps09y30(int eps09y30) {
		this.eps09y30 = eps09y30;
	}


	public int getEps09y50() {
		return eps09y50;
	}


	public void setEps09y50(int eps09y50) {
		this.eps09y50 = eps09y50;
	}


	public int getEps10y() {
		return eps10y;
	}


	public void setEps10y(int eps10y) {
		this.eps10y = eps10y;
	}


	public int getEps10y6() {
		return eps10y6;
	}


	public void setEps10y6(int eps10y6) {
		this.eps10y6 = eps10y6;
	}


	public int getEps10y9() {
		return eps10y9;
	}


	public void setEps10y9(int eps10y9) {
		this.eps10y9 = eps10y9;
	}


	public int getEps10y12() {
		return eps10y12;
	}


	public void setEps10y12(int eps10y12) {
		this.eps10y12 = eps10y12;
	}


	public int getEps10y16() {
		return eps10y16;
	}


	public void setEps10y16(int eps10y16) {
		this.eps10y16 = eps10y16;
	}


	public int getEps10y20() {
		return eps10y20;
	}


	public void setEps10y20(int eps10y20) {
		this.eps10y20 = eps10y20;
	}


	public int getEps10y30() {
		return eps10y30;
	}


	public void setEps10y30(int eps10y30) {
		this.eps10y30 = eps10y30;
	}


	public int getEps10y50() {
		return eps10y50;
	}


	public void setEps10y50(int eps10y50) {
		this.eps10y50 = eps10y50;
	}


	public int getEps11y() {
		return eps11y;
	}


	public void setEps11y(int eps11y) {
		this.eps11y = eps11y;
	}


	public int getEps11y6() {
		return eps11y6;
	}


	public void setEps11y6(int eps11y6) {
		this.eps11y6 = eps11y6;
	}


	public int getEps11y9() {
		return eps11y9;
	}


	public void setEps11y9(int eps11y9) {
		this.eps11y9 = eps11y9;
	}


	public int getEps11y12() {
		return eps11y12;
	}


	public void setEps11y12(int eps11y12) {
		this.eps11y12 = eps11y12;
	}


	public int getEps11y16() {
		return eps11y16;
	}


	public void setEps11y16(int eps11y16) {
		this.eps11y16 = eps11y16;
	}


	public int getEps11y20() {
		return eps11y20;
	}


	public void setEps11y20(int eps11y20) {
		this.eps11y20 = eps11y20;
	}


	public int getEps11y30() {
		return eps11y30;
	}


	public void setEps11y30(int eps11y30) {
		this.eps11y30 = eps11y30;
	}


	public int getEps11y50() {
		return eps11y50;
	}


	public void setEps11y50(int eps11y50) {
		this.eps11y50 = eps11y50;
	}


	public int getEps12y() {
		return eps12y;
	}


	public void setEps12y(int eps12y) {
		this.eps12y = eps12y;
	}


	public int getEps12y6() {
		return eps12y6;
	}


	public void setEps12y6(int eps12y6) {
		this.eps12y6 = eps12y6;
	}


	public int getEps12y9() {
		return eps12y9;
	}


	public void setEps12y9(int eps12y9) {
		this.eps12y9 = eps12y9;
	}


	public int getEps12y12() {
		return eps12y12;
	}


	public void setEps12y12(int eps12y12) {
		this.eps12y12 = eps12y12;
	}


	public int getEps12y16() {
		return eps12y16;
	}


	public void setEps12y16(int eps12y16) {
		this.eps12y16 = eps12y16;
	}


	public int getEps12y20() {
		return eps12y20;
	}


	public void setEps12y20(int eps12y20) {
		this.eps12y20 = eps12y20;
	}


	public int getEps12y30() {
		return eps12y30;
	}


	public void setEps12y30(int eps12y30) {
		this.eps12y30 = eps12y30;
	}


	public int getEps12y50() {
		return eps12y50;
	}


	public void setEps12y50(int eps12y50) {
		this.eps12y50 = eps12y50;
	}


	public int getEps13y() {
		return eps13y;
	}


	public void setEps13y(int eps13y) {
		this.eps13y = eps13y;
	}


	public int getEps13y6() {
		return eps13y6;
	}


	public void setEps13y6(int eps13y6) {
		this.eps13y6 = eps13y6;
	}


	public int getEps13y9() {
		return eps13y9;
	}


	public void setEps13y9(int eps13y9) {
		this.eps13y9 = eps13y9;
	}


	public int getEps13y12() {
		return eps13y12;
	}


	public void setEps13y12(int eps13y12) {
		this.eps13y12 = eps13y12;
	}


	public int getEps13y16() {
		return eps13y16;
	}


	public void setEps13y16(int eps13y16) {
		this.eps13y16 = eps13y16;
	}


	public int getEps13y20() {
		return eps13y20;
	}


	public void setEps13y20(int eps13y20) {
		this.eps13y20 = eps13y20;
	}


	public int getEps13y30() {
		return eps13y30;
	}


	public void setEps13y30(int eps13y30) {
		this.eps13y30 = eps13y30;
	}


	public int getEps13y50() {
		return eps13y50;
	}


	public void setEps13y50(int eps13y50) {
		this.eps13y50 = eps13y50;
	}


	public int getEps14y() {
		return eps14y;
	}


	public void setEps14y(int eps14y) {
		this.eps14y = eps14y;
	}


	public int getEps14y6() {
		return eps14y6;
	}


	public void setEps14y6(int eps14y6) {
		this.eps14y6 = eps14y6;
	}


	public int getEps14y9() {
		return eps14y9;
	}


	public void setEps14y9(int eps14y9) {
		this.eps14y9 = eps14y9;
	}


	public int getEps14y12() {
		return eps14y12;
	}


	public void setEps14y12(int eps14y12) {
		this.eps14y12 = eps14y12;
	}


	public int getEps14y16() {
		return eps14y16;
	}


	public void setEps14y16(int eps14y16) {
		this.eps14y16 = eps14y16;
	}


	public int getEps14y20() {
		return eps14y20;
	}


	public void setEps14y20(int eps14y20) {
		this.eps14y20 = eps14y20;
	}


	public int getEps14y30() {
		return eps14y30;
	}


	public void setEps14y30(int eps14y30) {
		this.eps14y30 = eps14y30;
	}


	public int getEps14y50() {
		return eps14y50;
	}


	public void setEps14y50(int eps14y50) {
		this.eps14y50 = eps14y50;
	}


	public int getEps15y() {
		return eps15y;
	}


	public void setEps15y(int eps15y) {
		this.eps15y = eps15y;
	}


	public int getEps15y6() {
		return eps15y6;
	}


	public void setEps15y6(int eps15y6) {
		this.eps15y6 = eps15y6;
	}


	public int getEps15y9() {
		return eps15y9;
	}


	public void setEps15y9(int eps15y9) {
		this.eps15y9 = eps15y9;
	}


	public int getEps15y12() {
		return eps15y12;
	}


	public void setEps15y12(int eps15y12) {
		this.eps15y12 = eps15y12;
	}


	public int getEps15y16() {
		return eps15y16;
	}


	public void setEps15y16(int eps15y16) {
		this.eps15y16 = eps15y16;
	}


	public int getEps15y20() {
		return eps15y20;
	}


	public void setEps15y20(int eps15y20) {
		this.eps15y20 = eps15y20;
	}


	public int getEps15y30() {
		return eps15y30;
	}


	public void setEps15y30(int eps15y30) {
		this.eps15y30 = eps15y30;
	}


	public int getEps15y50() {
		return eps15y50;
	}


	public void setEps15y50(int eps15y50) {
		this.eps15y50 = eps15y50;
	}


	public int getEps16y() {
		return eps16y;
	}


	public void setEps16y(int eps16y) {
		this.eps16y = eps16y;
	}


	public int getEps16y6() {
		return eps16y6;
	}


	public void setEps16y6(int eps16y6) {
		this.eps16y6 = eps16y6;
	}


	public int getEps16y9() {
		return eps16y9;
	}


	public void setEps16y9(int eps16y9) {
		this.eps16y9 = eps16y9;
	}


	public int getEps16y12() {
		return eps16y12;
	}


	public void setEps16y12(int eps16y12) {
		this.eps16y12 = eps16y12;
	}


	public int getEps16y16() {
		return eps16y16;
	}


	public void setEps16y16(int eps16y16) {
		this.eps16y16 = eps16y16;
	}


	public int getEps16y20() {
		return eps16y20;
	}


	public void setEps16y20(int eps16y20) {
		this.eps16y20 = eps16y20;
	}


	public int getEps16y30() {
		return eps16y30;
	}


	public void setEps16y30(int eps16y30) {
		this.eps16y30 = eps16y30;
	}


	public int getEps16y50() {
		return eps16y50;
	}


	public void setEps16y50(int eps16y50) {
		this.eps16y50 = eps16y50;
	}


	public int getEps17y() {
		return eps17y;
	}


	public void setEps17y(int eps17y) {
		this.eps17y = eps17y;
	}


	public int getEps17y6() {
		return eps17y6;
	}


	public void setEps17y6(int eps17y6) {
		this.eps17y6 = eps17y6;
	}


	public int getEps17y9() {
		return eps17y9;
	}


	public void setEps17y9(int eps17y9) {
		this.eps17y9 = eps17y9;
	}


	public int getEps17y12() {
		return eps17y12;
	}


	public void setEps17y12(int eps17y12) {
		this.eps17y12 = eps17y12;
	}


	public int getEps17y16() {
		return eps17y16;
	}


	public void setEps17y16(int eps17y16) {
		this.eps17y16 = eps17y16;
	}


	public int getEps17y20() {
		return eps17y20;
	}


	public void setEps17y20(int eps17y20) {
		this.eps17y20 = eps17y20;
	}


	public int getEps17y30() {
		return eps17y30;
	}


	public void setEps17y30(int eps17y30) {
		this.eps17y30 = eps17y30;
	}


	public int getEps17y50() {
		return eps17y50;
	}


	public void setEps17y50(int eps17y50) {
		this.eps17y50 = eps17y50;
	}


	public int getEps18y() {
		return eps18y;
	}


	public void setEps18y(int eps18y) {
		this.eps18y = eps18y;
	}


	public int getEps18y6() {
		return eps18y6;
	}


	public void setEps18y6(int eps18y6) {
		this.eps18y6 = eps18y6;
	}


	public int getEps18y9() {
		return eps18y9;
	}


	public void setEps18y9(int eps18y9) {
		this.eps18y9 = eps18y9;
	}


	public int getEps18y12() {
		return eps18y12;
	}


	public void setEps18y12(int eps18y12) {
		this.eps18y12 = eps18y12;
	}


	public int getEps18y16() {
		return eps18y16;
	}


	public void setEps18y16(int eps18y16) {
		this.eps18y16 = eps18y16;
	}


	public int getEps18y20() {
		return eps18y20;
	}


	public void setEps18y20(int eps18y20) {
		this.eps18y20 = eps18y20;
	}


	public int getEps18y30() {
		return eps18y30;
	}


	public void setEps18y30(int eps18y30) {
		this.eps18y30 = eps18y30;
	}


	public int getEps18y50() {
		return eps18y50;
	}


	public void setEps18y50(int eps18y50) {
		this.eps18y50 = eps18y50;
	}


	public int getEps19y() {
		return eps19y;
	}


	public void setEps19y(int eps19y) {
		this.eps19y = eps19y;
	}


	public int getEps19y6() {
		return eps19y6;
	}


	public void setEps19y6(int eps19y6) {
		this.eps19y6 = eps19y6;
	}


	public int getEps19y9() {
		return eps19y9;
	}


	public void setEps19y9(int eps19y9) {
		this.eps19y9 = eps19y9;
	}


	public int getEps19y12() {
		return eps19y12;
	}


	public void setEps19y12(int eps19y12) {
		this.eps19y12 = eps19y12;
	}


	public int getEps19y16() {
		return eps19y16;
	}


	public void setEps19y16(int eps19y16) {
		this.eps19y16 = eps19y16;
	}


	public int getEps19y20() {
		return eps19y20;
	}


	public void setEps19y20(int eps19y20) {
		this.eps19y20 = eps19y20;
	}


	public int getEps19y30() {
		return eps19y30;
	}


	public void setEps19y30(int eps19y30) {
		this.eps19y30 = eps19y30;
	}


	public int getEps19y50() {
		return eps19y50;
	}


	public void setEps19y50(int eps19y50) {
		this.eps19y50 = eps19y50;
	}


	public int getEps20y() {
		return eps20y;
	}


	public void setEps20y(int eps20y) {
		this.eps20y = eps20y;
	}


	public int getEps20y6() {
		return eps20y6;
	}


	public void setEps20y6(int eps20y6) {
		this.eps20y6 = eps20y6;
	}


	public int getEps20y9() {
		return eps20y9;
	}


	public void setEps20y9(int eps20y9) {
		this.eps20y9 = eps20y9;
	}


	public int getEps20y12() {
		return eps20y12;
	}


	public void setEps20y12(int eps20y12) {
		this.eps20y12 = eps20y12;
	}


	public int getEps20y16() {
		return eps20y16;
	}


	public void setEps20y16(int eps20y16) {
		this.eps20y16 = eps20y16;
	}


	public int getEps20y20() {
		return eps20y20;
	}


	public void setEps20y20(int eps20y20) {
		this.eps20y20 = eps20y20;
	}


	public int getEps20y30() {
		return eps20y30;
	}


	public void setEps20y30(int eps20y30) {
		this.eps20y30 = eps20y30;
	}


	public int getEps20y50() {
		return eps20y50;
	}


	public void setEps20y50(int eps20y50) {
		this.eps20y50 = eps20y50;
	}

	
	
}
