package com.regular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateInExpression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date in format(YYYY-MM-DD)");
		String date = sc.next();
		Pattern pattern = Pattern.compile("\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])");
		
        Matcher matcher = pattern.matcher(date);

        if (matcher.find()) {
     
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

	}

}
