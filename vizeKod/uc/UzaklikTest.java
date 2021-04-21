package vizeKod.uc;

public class UzaklikTest {

	public static void main(String[] args) {
		Uzaklik uzaklik = new Uzaklik(3);
		System.out.printf("En yakin iki nokta arasi uzaklik:%.2f", uzaklik.minumumUzaklik());
	}
}
