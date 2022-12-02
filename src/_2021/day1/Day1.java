package _2021.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day1 {

	public static int getTotalLargerMesurment(List<Integer> l) {
		int r = 0;
		for (int i = 1; i < l.size(); ++i) {
			if(l.get(i) > l.get(i-1)) {
				r++;
			}
		}
		return r;
	}
	
	public static int getTotalLargerMesurmentWithWindows(List<Integer> l) {
		int r = 0;
        int previousSum = l.get(0) + l.get(1) + l.get(2);
        for (var i = 3; i < l.size(); ++i) {
            int sum = l.get(i-2) + l.get(i-1) + l.get(i);
            if (sum > previousSum) {
                r++;
            }
            previousSum = sum;
        }
		return r;
	}
	
	

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		try {
			File f = new File("input/day1.txt");
			Scanner reader = new Scanner(f);
			while (reader.hasNextLine()) {
				String data = reader.nextLine();
				list.add(Integer.parseInt(data));
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		System.out.println(getTotalLargerMesurment(list)); //part 1
		System.out.println(getTotalLargerMesurmentWithWindows(list)); //part 2
		

	}

}
