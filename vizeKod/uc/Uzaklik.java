package vizeKod.uc;

public class Uzaklik {

	private int[][] noktalar;
	private int[][] enYakinNoktalar = new int[2][2];

	public Uzaklik(int noktaSayisi) {
		
		System.out.println("Noktalar:");
		
		noktalar = new int[noktaSayisi][2]; 
		for (int i = 0; i < noktaSayisi; i++) {
			int x = (int) (Math.random() * 10);
			int y = (int) (Math.random() * 10);

			noktalar[i][0] = x;
			noktalar[i][1] = y;
			System.out.printf("X%d:%d Y%d:%d%n",i+1,x,i+1,y);
		}
		System.out.println();
	}

	public double minumumUzaklik() {
		enYakinIkiNoktayiBul(noktalar);
		System.out.printf("Birbirine en yak�n iki nokta;%n�lk nokta: %d",enYakinNoktalar[0][0]);
		System.out.printf(",%d ve ",enYakinNoktalar[0][1]);
		System.out.printf("�kinci nokta: %d",enYakinNoktalar[1][0]);
		System.out.printf(",%d%n",enYakinNoktalar[1][1]);
		return ikiNoktaArasiUzakl�kBul(enYakinNoktalar);
	}

	public void enYakinIkiNoktayiBul(int noktalar[][]) {
		int[][] ikiNokta = new int[2][2];
		double enYakin�kiNoktaAras�Uzaklik = 10;
		double ikiNoktaArasiUzaklik = 0;
		int ilkNoktaX;
		int ilkNoktaY;
		int ikinciNoktaX;
		int ikinciNoktaY;

		for (int i = 0; i < noktalar.length; i++) {
			ilkNoktaX = noktalar[i][0];
			ilkNoktaY = noktalar[i][1];

			for (int j = i+1; j < noktalar.length; j++) {
				ikinciNoktaX = noktalar[j][0];
				ikinciNoktaY = noktalar[j][1];

				ikiNokta[0][0] = ilkNoktaX;
				ikiNokta[0][1] = ilkNoktaY;
				ikiNokta[1][0] = ikinciNoktaX;
				ikiNokta[1][1] = ikinciNoktaY;

				ikiNoktaArasiUzaklik = ikiNoktaArasiUzakl�kBul(ikiNokta);
				
				if (ikiNoktaArasiUzaklik < enYakin�kiNoktaAras�Uzaklik) {
					enYakinNoktalar[0][0]=ilkNoktaX;
					enYakinNoktalar[0][1]=ilkNoktaY;
					enYakinNoktalar[1][0]=ikinciNoktaX;
					enYakinNoktalar[1][1]=ikinciNoktaY;
					
					enYakin�kiNoktaAras�Uzaklik = ikiNoktaArasiUzaklik;
					System.out.printf("En Yak�n �ki Nokta G�ncelendi%n");
				}
				System.out.printf("%d.Nokta ile %d.Nokta aras� fark: %.2f %n%n",i+1,j+1,ikiNoktaArasiUzaklik);
			}
		}
	}

	public double ikiNoktaArasiUzakl�kBul(int ikiNokta[][]) {
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
