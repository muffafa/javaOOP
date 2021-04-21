package vizeKod.iki;

public class Bolen {

	public static int ebob(int a, int b)
    {
        if (a == 0) {
            return b;
        }
        return ebob(b % a, a);
    }
	
	public static int ortakBolenlerinToplam�(int a, int b) {
 
        int n = ebob(a, b);
        int toplam=0;
        int sayac =0;
        
        System.out.println("Ortak B�lenler: ");
        
        for(int i=1;i<n;i++){
        	if(n%i==0) {
        	++sayac; 
        	System.out.printf("%d.B�len %d +%n",sayac,i);
        	toplam +=i;
        	}
        }
        System.out.printf("%d.B�len (ebob) %d = %n",++sayac,n);
        toplam +=n;
        return toplam;
	}

	public static void main(String[] args) {
		int a = 18, b = 24;
        System.out.printf("Ortak B�lenlerin Toplam�: %d ",ortakBolenlerinToplam�(a, b));
	}
}
