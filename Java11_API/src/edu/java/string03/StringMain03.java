package edu.java.string03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringMain03 {

	public static void main(String[] args) {
		// length() : 문자열의 길이를 리턴
		String str1 = "abc";
		String str2 = "Hello";
		System.out.println(str1.length());
		System.out.println(str2.length());
		
		System.out.println("---------");
		// equals() : 문자열의 내용을 비교
		System.out.println(str1.equals(str2));
		
		System.out.println("---------------");
		// equalsIgnoreCase() : 대소문자 구분없이 비교
		String str3 = "hello";
		String str4 = "Hello";
		System.out.println(str3.equals(str4));
		System.out.println(str3.equalsIgnoreCase(str4));
		
		System.out.println("---------------");
		// charAt() : 문자열 중에서 해당 인덱스의 문자 하나를 리턴
		System.out.println(str3.charAt(1));
		
		System.out.println();
		// indexOf() : 해당 문자 또는 문자열이 처음으로 등장하는 인덱스를 리런
		//				해당 문자 또는 문자열이 없다면 -1 리턴
		// lastIndexOf() ; 문자 또는 문자열이 가장 마지막으로 등장하는 인덱스를 리턴
		String str5 = "Hello, world!";
		System.out.println(str5.indexOf("l"));
		System.out.println(str5.indexOf("world"));
		System.out.println(str5.lastIndexOf("l"));
		
		System.out.println();
		//startWuth() : 해당 문자열로 시작하는지 아닌지 확인
		String str6 = "https:// www.google.com";
		System.out.println(str6.startsWith("https://"));
		
		System.out.println();
		// contains() : 해당 문자열이 포함하는지 아닌지
		System.out.println(str6.contains("google"));
		
		System.out.println();
		// split() : 문자열을 특정 기준(구분자)으로 나눠서 배열로 리턴
		String str7 = "2023.07.26";
		String[] result = str7.split("\\.");
		
		// 특수기호(.$()[{^?*+\\) 사용은 기호 앞에 "\\"를 붙여야함
		
		for(String x : result) {
			System.out.println(x);	
		}
		
		String str8 = "C:\\program Files\\ test folder";
		// 각 문자 또는 문자열 끼리 나누시오.(공백 제외)
		result = str8.split(":|\\\\|");
		for(String x : result) {
			System.out.println(x);
		}
		
		Date date = new Date();
		System.out.println(date);
		
		// 퀴즈) date 값을 이용아여 
		//1~6 월이면 "상반기", 7~12월이면 "하반기"가 출력되도록 코드를 작성
		SimpleDateFormat sdf = new SimpleDateFormat("MM");
		String str9 = sdf.format(date);
		int num = Integer.parseInt(str9);
		if(num >=1 && num <= 6) {
			System.out.println("상반기");
		}else if(num >=7 && num <= 12){
			System.out.println("하반기");
		}
		
		
		
		System.out.println("---------------------------");
		
		// getMonth 이용해 풀기
//		System.out.println(date.getMonth()+1);
//		int mth = date.getMonth()+1;
//		if(mth>=1 && mth <= 6) {
//			System.out.println("상반기");
//		}else if(mth>=7 && mth <= 12) {
//			System.out.println("하반기");
//		}
		
		System.out.println();
		// compareTo() : 해당 문자열과 비교해서 서로 다른 문자의 개수 리턴
		// compareToIgnoreCase() : 해당 문자열과 대소문자 구분없이 비교 후 서로 다른 문자의 개수 리턴
		
		String str10 = "abc";
		String str11 = "bbc";
		System.out.println(str10.compareTo("abc"));
		System.out.println(str10.compareTo("ab"));
		System.out.println(str10.compareTo("a"));
		System.out.println(str10.compareTo("b"));
		System.out.println(str10.compareTo(str11));
		
		System.out.println();
		
		// toUpperCase() : 문자열을 대문자로 변경
		// toLowerCase() : 문자열을 소문자로 변경
		String str12 = "Hello, Java!";
		System.out.println(str12.toUpperCase());
		System.out.println(str12.toLowerCase());
		
		System.out.println();
		
		// substring(begin, end) : begin부터 end까지 문자열을 리턴
		// begin 인덱스는 포함, end 인덱스는 포함X
		System.out.println(str12.substring(0, 5)); // 0 <= index < 5
		int begin = str12.indexOf("J");
		int end = str12.length();
		System.out.println(str12.substring(begin, end));
		
		System.out.println();
		
		// concat() : 문자열을 이어주는 메소드
		System.out.println(str12.concat(" Good!"));
		
		System.out.println();
		
		// replace(A, B) : A 문자열을 B로 변경
		String str13 = str12.replace("Java:", "C++");
		System.out.println(str13);
		
		
		
	} // end main()

} // StringMain03
