package com.regular;
import java.util.Scanner;
import java.util.regex.*;
public class CheckAndReplace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.next();
		Pattern pattern = Pattern.compile("[aeiouAEIOU]");
        Matcher matcher = pattern.matcher(str);
        String result = matcher.replaceAll("c");
//		String result = str.replaceAll("[aeiouAEIOU]", "@");
       System.out.println(result);

		

	}
}
