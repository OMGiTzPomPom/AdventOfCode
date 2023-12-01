package _2023.day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import _2023.InputReader;

public class Day1 {

	public static void main(String[] args) {
		ArrayList<String> list = (ArrayList<String>) InputReader.readFile(1);
		levelOne(list);
		levelTwo(list);
	}

	public static void levelOne(ArrayList<String> l) {
		char first;
		char last = 'a';
		int total = 0;
		
		
		for (String string : l) {
			first = string.charAt(firstPos(string));
			
			for (int i = string.length() - 1; i >= 0; --i) {
	            if (Character.isDigit(string.charAt(i))) {
	                last = string.charAt(i);
	                break;
	            }
	        }
			
			String number = new StringBuilder().append(first).append(last).toString();
			
			total += Integer.parseInt(number);
		}
		System.out.println(total);
	}
	
	private static int firstPos(String s) {
		int r = -1;
	    for (int i = 0; i < s.length(); ++i) {
	        if (Character.isDigit(s.charAt(i))) {
	            r = i;
	            break;
	        }
	    }
	    return r;
	}
	
	private static final Map<String, String> stringToDigit = new HashMap<>();

    static {
        stringToDigit.put("zero", "0");
        stringToDigit.put("one", "1");
        stringToDigit.put("two", "2");
        stringToDigit.put("three", "3");
        stringToDigit.put("four", "4");
        stringToDigit.put("five", "5");
        stringToDigit.put("six", "6");
        stringToDigit.put("seven", "7");
        stringToDigit.put("eight", "8");
        stringToDigit.put("nine", "9");
    }
    
	public static void levelTwo(ArrayList<String> l) {
		int total = 0;

        for (String line : l) {
            String lineWithoutDigits = replaceDigitsInStringFormat(line);

            lineWithoutDigits = lineWithoutDigits
                    .chars()
                    .filter(Character::isDigit)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();

            char firstDigitChar = lineWithoutDigits.charAt(0);
            char lastDigitChar = lineWithoutDigits.charAt(lineWithoutDigits.length() - 1);

            int newDigit = Integer.parseInt("" + firstDigitChar + lastDigitChar);

            total += newDigit;
        }

        System.out.println(total);
	}
	
	private static String replaceDigitsInStringFormat(String stringWithDigits) {
        String stringWithoutDigits = stringWithDigits;
        for (Map.Entry<String, String> entry : stringToDigit.entrySet()) {
            stringWithoutDigits = stringWithoutDigits.replace(entry.getKey(), entry.getValue());
        }
        return stringWithoutDigits;
    }
		
}
