package _2020.day2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day2 {
	
	public static void main(String[] args) {
		List<Record> lista = new ArrayList<>();
		List<Record> validRecord = new ArrayList<>();
		List<Record> validRecord2 = new ArrayList<>();
		String data = "";
		String[] datas = {};
		String[] numbers = {};
		String lettre = "";
		String seq = "";
		Record r; 
		try {
			File f = new File("input/day2.txt");
			Scanner reader = new Scanner(f);
			while (reader.hasNextLine()) {
				data = reader.nextLine();
				datas = data.split(" ");
				numbers = datas[0].split("-");
				lettre = datas[1];
				seq = datas[2];
				
				r = new Record(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1]), lettre, seq);
				System.out.println(r);
				lista.add(r);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		System.out.println("part1");
		for (Record record : lista) {
			if(record.isValid()) {
				validRecord.add(record);
			}
		}
		System.out.println(validRecord.size());
		
		System.out.println("part2");
		for (Record record : lista) {
			if(record.isValidWithNumber()) {
				validRecord2.add(record);
			}
		}
		System.out.println(validRecord2.size());
		
	}
}


