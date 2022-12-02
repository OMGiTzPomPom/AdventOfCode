package _2022.day2;

import java.util.ArrayList;

import _2022.InputReader;

public class Day2 {

	public static void main(String[] args) {
		ArrayList<String> list = (ArrayList<String>) InputReader.readFile(2);
		levelOne(list);
		levelTwo(list);
	}
	
	public static void levelOne(ArrayList<String> l) {
		int totalPoints = 0;
		
		// A & X = Rock(1) | B & Y = Paper(2) | C & Z = Scissors(3)
		
		for(String s : l) {
			if(s.charAt(2) == 'X') {
				if(s.charAt(0) == 'A') {
					totalPoints += 3;
				} else if(s.charAt(0) == 'B') {
					totalPoints += 0;
				} else if(s.charAt(0) == 'C') {
					totalPoints += 6;
				}
				totalPoints += 1;
			} else if(s.charAt(2) == 'Y') {
				if(s.charAt(0) == 'A') {
					totalPoints += 6;
				} else if(s.charAt(0) == 'B') {
					totalPoints += 3;
				} else if(s.charAt(0) == 'C') {
					totalPoints += 0;
				}
				totalPoints += 2;
			} else if(s.charAt(2) == 'Z') {
				if(s.charAt(0) == 'A') {
					totalPoints += 0;
				} else if(s.charAt(0) == 'B') {
					totalPoints += 6;
				} else if(s.charAt(0) == 'C') {
					totalPoints += 3;
				}
				totalPoints += 3;
			}
		}
		
		System.out.println(totalPoints);
	}

	public static void levelTwo(ArrayList<String> l) {
		int totalPoints = 0;
		
		// A & X = Rock(1) | B & Y = Paper(2) | C & Z = Scissors(3)
		
		for(String s : l) {
			if(s.charAt(2) == 'X') {
				if(s.charAt(0) == 'A') {
					totalPoints += 3;
				} else if(s.charAt(0) == 'B') {
					totalPoints += 1;
				} else if(s.charAt(0) == 'C') {
					totalPoints += 2;
				}
			} else if(s.charAt(2) == 'Y') {
				if(s.charAt(0) == 'A') {
					totalPoints += 1;
				} else if(s.charAt(0) == 'B') {
					totalPoints += 2;
				} else if(s.charAt(0) == 'C') {
					totalPoints += 3;
				}
				totalPoints += 3;
			} else if(s.charAt(2) == 'Z') {
				if(s.charAt(0) == 'A') {
					totalPoints += 2;
				} else if(s.charAt(0) == 'B') {
					totalPoints += 3;
				} else if(s.charAt(0) == 'C') {
					totalPoints += 1;
				}
				totalPoints += 6;
			}
		}
		System.out.println(totalPoints);
	}
}
