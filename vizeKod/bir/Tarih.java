package vizeKod.bir;

public class Tarih {
	private int year;
	private int month;
	private int day;
	
	
	public Tarih(int day,int month, int year) {
		this.day= day;
		this.month = month;
		this.year = year;
	}
	
	public int compareTo(Tarih obj) {
		if(obj.year > this.year) {
			return -1;
		}else if(obj.year == this.year && obj.month > this.month ) {
			return-1;
		}else if(obj.year == this.year && obj.month == this.month && obj.day > this.day ) {
			return -1;
		}else if(obj.year == this.year && obj.month == this.month && obj.day == this.day ) {
			return 0;
		}else return 1;
		
	}
}
