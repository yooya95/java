package ch09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegulaEx {

	public static void main(String[] args) {
		String[] data = {" bat","baby","bonus","cA","ca",
						 "cO",  "C."  ,"C0",   "car","combat","count",
						 "date", "disc"}; 
		//      c  --> 맨 앞의 한글자는 c로
		//     [A-Z] --> c다음 글자는 영어 대문자로
		//     [a-z] --> c다음 글자는 영어 소문자로
		//     *      --> 아무글자나
		//Pattern p = Pattern.compile("c[A-Z]*");
	//	Pattern p = Pattern.compile("c[a-z]*");
		Pattern p = Pattern.compile("b[a-z]*");
		
		for(int i=0; i<data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches()) {
				System.out.println(data[i] + ",");
			}
		}
	}

}
