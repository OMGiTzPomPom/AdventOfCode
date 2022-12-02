package _2020.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		int treeCounter = 0, right = 3, down = 1, x = 0, y = 0, multipleTreeCounter = 1;
		int[] XX = { 1, 3, 5, 7, 1 };
		int[] YY = { 1, 1, 1, 1, 2 };

		try {
			File f = new File("input/day3.txt");
			Scanner reader = new Scanner(f);
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				for (int i = 0; i < 7; ++i) {
					line = line + line;
				}
				if (line.charAt(x) == '#') {
					treeCounter++;
				}

				x += right;
				y += down;

			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		System.out.println("part1");
		System.out.println(treeCounter);
		treeCounter = 0;
		try {
			File f = new File("input/day3.txt");
			Scanner reader = new Scanner(f);
			for (int j = 0; j < XX.length; ++j) {
				x = 0; y = 0;
				while (reader.hasNextLine()) {
					String line = reader.nextLine();
					for (int i = 0; i < 7; ++i) {
						line = line + line;
					}
					if (line.charAt(x) == '#') {
						treeCounter++;
					}

					x += XX[j];
					y += YY[j];

				}
				multipleTreeCounter = treeCounter * multipleTreeCounter;
				treeCounter = 0;
				reader.close();
				reader = new Scanner(f);
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		System.out.println("part2");
		System.out.println(multipleTreeCounter);

	}
}
