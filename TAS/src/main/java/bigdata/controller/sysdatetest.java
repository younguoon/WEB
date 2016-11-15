package bigdata.controller;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class sysdatetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
		Date currentTime = new Date();
		System.out.println(currentTime);
		String dTime1 = date1.format(currentTime);
		System.out.println(dTime1);
	}

}
