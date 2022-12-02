package _2022.day1;

public class Elf {
	private int charge;
	
	public Elf(int c) {
		this.charge = c;
	}
	
	public int getCharge() {
		return this.charge;
	}
	
	public int compareTo(Elf e) {
		if(this.getCharge() > e.getCharge()) {
			return 1;
		} else if(this.getCharge() < e.getCharge()) {
			return -1;
		} else {
			return 0;
		}
	}
	
}
