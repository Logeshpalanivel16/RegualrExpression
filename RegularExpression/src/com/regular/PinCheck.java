package com.regular;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pin = sc.next();
		
		Pattern pattern = Pattern.compile("[0-9]{4}");
        Matcher matcher = pattern.matcher(pin);
        if (matcher.find()) {
            System.out.println("Valid PIN: " + matcher.group());
        } else {
            System.out.println("Invalid PIN. Please enter a 4-digit PIN.");
        }
	}

}
