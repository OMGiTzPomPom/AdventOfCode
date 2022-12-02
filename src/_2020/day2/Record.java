package _2020.day2;

public class Record {
	int min;
	int max;
	static String letter;
	static String sequence;

	public Record(int m, int mm, String l, String s) {
		this.min = m;
		this.max = mm;
		Record.letter = l;
		Record.sequence = s;
	}
	
	public static int countLetter(String s) {
		int count = 0;
		
		for (int i = 0; i < s.length(); ++i) {
			if(s.charAt(i) == s.charAt(0)) {
				count++;
			}
		}
		return count;
	}

	public boolean isValid() {
		
		if(countLetter(Record.sequence) >= this.min && countLetter(Record.sequence) <= this.max) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isValidWithNumber() {
		
		if((countLetter(Record.sequence) >= this.min && countLetter(Record.sequence) <= this.max) && (letter.charAt(0) != sequence.charAt(min) && letter.charAt(0) != sequence.charAt(max))) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "{min=" + min + ", max=" + max + ", letter=" + letter + ", sequence=" + sequence + "}";
	}

	/**
	 * @return the min
	 */
	public int getMin() {
		return min;
	}

	/**
	 * @param min the min to set
	 */
	public void setMin(int min) {
		this.min = min;
	}

	/**
	 * @return the max
	 */
	public int getMax() {
		return max;
	}

	/**
	 * @param max the max to set
	 */
	public void setMax(int max) {
		this.max = max;
	}

	/**
	 * @return the letter
	 */
	public static String getLetter() {
		return letter;
	}

	/**
	 * @param letter the letter to set
	 */
	public static void setLetter(String letter) {
		Record.letter = letter;
	}

	/**
	 * @return the sequence
	 */
	public static String getSequence() {
		return sequence;
	}

	/**
	 * @param sequence the sequence to set
	 */
	public static void setSequence(String sequence) {
		Record.sequence = sequence;
	}
}