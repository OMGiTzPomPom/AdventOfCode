package _2022.day3;

import java.util.ArrayList;
import java.util.List;

import _2022.InputReader;

public class Day3 {

	private static String alphabet = "0abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static void main(String[] args) {
		ArrayList<String> list = (ArrayList<String>) InputReader.readFile(3);
		levelOne(list);
		levelTwo(list);
	}
	
	public static void levelOne(ArrayList<String> l) {
		int total = 0;
		for(String s : l) {
			List<Character> s1 = new ArrayList<>();
			List<Character> s2 = new ArrayList<>();
		 
			for (int i = 0; i < (s.length()/2); ++i) {
				s1.add(s.charAt(i));
			}
		 
			for (int i = (s.length()/2); i < s.length(); ++i) {
				s2.add(s.charAt(i));
			}
		 
			// Finding intersection of both lists
			s1.retainAll(s2);
		 
			// Forming string from intersected chars
			StringBuilder sb = new StringBuilder();
		 
			for (Character c : s1) {
				sb.append(c);
			}

			// Keep only one char?
			total += alphabet.indexOf(sb.charAt(0));
			
		}
		System.out.println(total);
	}

	public static void levelTwo(ArrayList<String> l) {

	}

}
