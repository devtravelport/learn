package com.learn.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexPattern {

	private static final Pattern IP_FORMAT = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");


	private static boolean isValidIPFomat(String ipAddress) {
		final Matcher m = IP_FORMAT.matcher(ipAddress);
		return m.matches();
	}

	public static void main(String[] args) {
		String s = "121.234.12.12";
		if(isValidIPFomat(s)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}


