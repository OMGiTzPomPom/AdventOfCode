package _2025;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputReader {
	public static List<String> readFile(int dayNumber) {
		List<String> list = new ArrayList<>();
		try {
			File f = new File("input/2023/day" + dayNumber +".txt");
			Scanner reader = new Scanner(f);
			while (reader.hasNextLine()) {
				String data = reader.nextLine();
				list.add(data);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return list;
	}
}
