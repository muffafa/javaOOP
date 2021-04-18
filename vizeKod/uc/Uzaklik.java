package vizeKod.uc;

public class Uzaklik {

	private int[][] noktalar;
	private int[][] enYakinNoktalar;

	public Uzaklik(int noktaSayisi) {

		noktalar = new int[noktaSayisi][2];
		enYakinNoktalar = new int[2][2];
		for (int i = 0; i < noktaSayisi; i++) {
			int x = (int) (Math.random() * 10);
			int y = (int) (Math.random() * 10);

			noktalar[i][0] = x;
			noktalar[i][1] = y;
			System.out.printf("X%d:%d Y%d:%d%n",i,x,i,y);
		}

	}

	public double minumumUzaklik() {
		enYakinIkiNoktayiBul(noktalar);
		return ikiNoktaArasiUzaklýkBul(enYakinNoktalar);
	}

	public void enYakinIkiNoktayiBul(int noktalar[][]) {
		int[][] ikiNokta = new int[2][2];
		double enYakinÝkiNoktaArasýUzaklik = 0;
		double ikiNoktaArasiUzaklik = 0;
		int ilkNoktaX;
		int ilkNoktaY;
		int ikinciNoktaX;
		int ikinciNoktaY;

		for (int i = 0; i < noktalar.length; i++) {
			ilkNoktaX = noktalar[i][0];
			ilkNoktaY = noktalar[i][1];

			for (int j = 1; j < noktalar.length - 1; j++) {
				ikinciNoktaX = noktalar[j][0];
				ikinciNoktaY = noktalar[j][1];

				ikiNokta[0][0] = ilkNoktaX;
				ikiNokta[0][1] = ilkNoktaY;
				ikiNokta[1][0] = ikinciNoktaX;
				ikiNokta[1][1] = ikinciNoktaY;

				ikiNoktaArasiUzaklik = ikiNoktaArasiUzaklýkBul(ikiNokta);
				if (ikiNoktaArasiUzaklik > enYakinÝkiNoktaArasýUzaklik) {
					enYakinÝkiNoktaArasýUzaklik = ikiNoktaArasiUzaklik;
					enYakinNoktalar = ikiNokta;
				}
			}
		}
	}

	public double ikiNoktaArasiUzaklýkBul(int ikiNokta[][]) {
		double sonuc;
		int ilkNoktaX;
		int ilkNoktaY;
		int ikinciNoktaX;
		int ikinciNoktaY;

		ilkNoktaX = ikiNokta[0][0];
		ilkNoktaY = ikiNokta[0][1];
		ikinciNoktaX = ikiNokta[1][0];
		ikinciNoktaY = ikiNokta[1][1];

		sonuc = Math.sqrt((Math.pow(ilkNoktaX - ikinciNoktaX, 2) + Math.pow(ilkNoktaY - ikinciNoktaY, 2)));

		return sonuc;
	}
}
