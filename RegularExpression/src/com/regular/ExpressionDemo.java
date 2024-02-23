package com.regular;
import java.util.regex.*;
public class ExpressionDemo {

	public static void main(String[] args) {
//		Pattern pattern = Pattern.compile("s.?e[a-z]+");
//		Matcher matcher = pattern.matcher("sumi sea shell for shore");
//		boolean isFound = matcher.find();
//		while(isFound) {
//			
//			System.out.println(matcher.group());
//			isFound =matcher.find();
//		}
		Pattern pattern = Pattern.compile("(a|A)\\D{2,}");
		Matcher matcher = pattern.matcher("al");

		if(matcher.find()) {
			
			System.out.println(matcher.group());

		}
		
		

	}

}
