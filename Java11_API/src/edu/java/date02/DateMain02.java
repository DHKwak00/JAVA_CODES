package edu.java.date02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain02 {

	public static void main(String[] args) {
		// 날짜를 원하는 형식(format)으로 출력
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		// yy or yyy : 년도
		// MM : 월
		// dd : 일
		// hh : 시간
		// mm : 분
		// ss : 초
		String dateString = sdf.format(currentDate);
		System.out.println(dateString);
		
		sdf = new SimpleDateFormat("yy-mm-dd");
		dateString = sdf.format(currentDate);
		System.out.println(dateString);
		
//		if(currentDate.getHours() >= 12) {
//			System.out.println("오후");
//		}

	} // end main()

}
