package _2022.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import _2022.InputReader;

public class Day1 {

	public static void main(String[] args) {
		ArrayList<String> list = (ArrayList<String>) InputReader.readFile(1);
		levelOne(list);
		levelTwo(list);
	}
	
	public static void levelOne(ArrayList<String> l) {
		int c = 0; //callories
		List<Integer> e = new ArrayList<>();
		
		for(String s : l) {
			if(s != "") {
				c += Integer.parseInt(s);
			} else {
				e.add(c); //elf carrying c callories
				c = 0;
			}
		}
		
		Collections.sort(e, Collections.reverseOrder());
		
		System.out.println(e.get(0));
	}

	public static void levelTwo(ArrayList<String> l) {
		int c = 0; //callories
		List<Integer> e = new ArrayList<>();
		
		for(String s : l) {
			if(s != "") {
				c += Integer.parseInt(s);
			} else {
				e.add(c); //elf carrying c callories
				c = 0;
			}
		}
		
		Collections.sort(e, Collections.reverseOrder());
		
		System.out.println(e.get(0) + e.get(1) + e.get(2));
	}

}
 