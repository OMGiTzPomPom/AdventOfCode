package _2021.day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Day2 {

	public static int getMultiplyOfDephtAndPosition(List<Command> l) {
		int h = 0;
		int d = 0;
		
		for (Command c : l) {
			if(c.direction.equals("forward")) {
				h += c.lenght;
			} else if(c.direction.equals("down")) {
				d += c.lenght;
			} else if(c.direction.equals("up")) {
				d -= c.lenght;
			}
		}
		
		return h*d;
	}
	
	public static int getMultiplyOfDephtAndPositionWithAim(List<Command> l) {
		int h = 0;
		int d = 0;
		int a = 0;
		
		for (Command c : l) {
			if(c.direction.equals("forward")) {
				h += c.lenght;
				d += a*c.lenght;
			} else if(c.direction.equals("down")) {
				a += c.lenght;
			} else if(c.direction.equals("up")) {
				a -= c.lenght;
			}
		}
		
		return h*d;
	}

	public static void main(String[] args) {
		List<Command> list = new ArrayList<>();

		try {
			File f = new File("input/day2.txt");
			Scanner reader = new Scanner(f);
			while (reader.hasNextLine()) {
				String data = reader.nextLine();
				String[] sb = data.split(" ");
				list.add(new Command(sb[0], Integer.parseInt(sb[1])));
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		System.out.println(getMultiplyOfDephtAndPosition(list)); //part 1
		System.out.println(getMultiplyOfDephtAndPositionWithAim(list)); //part 2

	}

}
