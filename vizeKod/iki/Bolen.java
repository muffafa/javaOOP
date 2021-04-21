package vizeKod.iki;

public class Bolen {

	public static int ebob(int a, int b)
    {
        if (a == 0) {
            return b;
        }
        return ebob(b % a, a);
    }
	
	public static int ortakBolenlerinToplamý(int a, int b) {
 
        int n = ebob(a, b);
        int toplam=0;
        int sayac =0;
        
        System.out.println("Ortak Bölenler: ");
        
        for(int i=1;i<n;i++){
        	if(n%i==0) {
        	++sayac; 
        	System.out.printf("%d.Bölen %d +%n",sayac,i);
        	toplam +=i;
        	}
        }
        System.out.printf("%d.Bölen (ebob) %d = %n",++sayac,n);
        toplam +=n;
        return toplam;
	}

	public static void main(String[] args) {
		int a = 18, b = 24;
        System.out.printf("Ortak Bölenlerin Toplamý: %d ",ortakBolenlerinToplamý(a, b));
	}
}
