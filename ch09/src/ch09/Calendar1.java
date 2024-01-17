package ch09;
//API (사용법)
import java.util.Calendar;

public class Calendar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; //0월부터 그래서 1을해줘야 제대로 나옴;
		int date = cal.get(Calendar.DATE);
		
		System.out.printf("오늘은 %d년 %d월 %d 입니다 \n", year,month,date);
		
		int    hour   = cal.get(Calendar.HOUR);
		int    min   = cal.get(Calendar.MINUTE);
		int    sec   = cal.get(Calendar.SECOND);
		System.out.printf("지금은 %d시 %d분 %d초 입니다\n", hour, min, sec);
	 
	}

}
