package com.regular;


import java.util.regex.*;

public class TestPattern {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("[a-kA-K][0369][a-zA-Z0-9#$]*");
		Matcher matcher = pattern.matcher("a9dgudgsub acghx3edsgbcgc");
		boolean isMatch = matcher.find();
		while(isMatch) {
				System.out.println(matcher.group());
				isMatch = matcher.find();
		}
		

	}

}
