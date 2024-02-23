package com.regular;
import java.util.regex.*;
public class DemoExpression {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("is");
        Matcher matcher = pattern.matcher("The are amy is very beautiful");

        if (matcher.find()) {
        	System.out.println(matcher.start()+" "+matcher.end());
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
	}

}
