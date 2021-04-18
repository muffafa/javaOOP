package vizeKod.bir;

public class TarihTest {

	public static void main(String[] args) {
		Tarih tarih1 = new Tarih(23,4,1920);
		Tarih tarih2 = new Tarih(30,8,1922);
		
		Tarih tarih3 = new Tarih(18,04,2021);
		Tarih tarih4 = new Tarih(18,04,2021);
		
		Tarih tarih5 = new Tarih(29,10,1923);
		Tarih tarih6 = new Tarih(19,05,1919);
		
		System.out.println(tarih1.compareTo(tarih2));
		System.out.println(tarih3.compareTo(tarih4));
		System.out.println(tarih5.compareTo(tarih6));
		
	}

}
