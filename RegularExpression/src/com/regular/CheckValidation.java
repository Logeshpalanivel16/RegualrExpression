package com.regular;
import java.util.Scanner;
import java.util.regex.*;
public class CheckValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the email :");
        String email = sc.next();
        System.out.println("Enter the password :");
        String password = sc.next();
        Pattern emailPattern = Pattern.compile("[a-zA-z0-9]*@gmail.com");
        Pattern passwordPattern = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!#@%&])(\\S).{8,}$");
        Matcher emailMatcher = emailPattern.matcher(email);
        Matcher passwordMatcher = passwordPattern.matcher(password);       
        if (emailMatcher.matches()) {
            System.out.println("email is valid");
        } else {
            System.out.println("email is invalid");
        }
        if (passwordMatcher.matches()) {
            System.out.println("Password is valid");
            
        } else {
            System.out.println("Password is invalid");
        }
        if (isStrongPassword(password)) {
            System.out.println("Password is strong");
        } else if (isModeratePassword(password)) {
            System.out.println("Password is moderate");
        } else {
            System.out.println("Password is weak");
        }
	}
	private static boolean isStrongPassword(String password) {
        return password.length() >= 8 &&
                password.matches(".*[a-z].*") &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[0-9].*") &&
                password.matches(".*[!@#%&].*");
    }

    private static boolean isModeratePassword(String password) {
        int count = 0;
        if (password.matches(".*[a-z].*")) count++;
        if (password.matches(".*[A-Z].*")) count++;
        if (password.matches(".*[0-9].*")) count++;
        if (password.matches(".*[!@#%&].*")) count++;
        
        return password.length() >= 8 && count >= 2;
    }

}
