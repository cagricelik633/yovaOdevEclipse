package tr.edu.medipol.yova;

public class Hesaplama {
	
	public static void main(String[] args) {
		Hesaplama h = new Hesaplama();
		int toplamaSonucu = h.Toplama(48, 12);
		int cikarmaSonucu = h.Cikarma(48, 12);
		int carpmaSonucu = h.Carpma(48,12);
		int bolmeSonucu = h.Bolme(48,12);
		System.out.println(toplamaSonucu);
		System.out.println(cikarmaSonucu);
		System.out.println(bolmeSonucu);
		System.out.println(carpmaSonucu);
	}
	
	 int Toplama(int sayi1 ,int sayi2) {
		int sonuc = sayi1 + sayi2;
		return sonuc;
		}
	 
	 int Cikarma(int sayi1 , int sayi2) {
		 int sonuc = sayi1 - sayi2;
		 return sonuc;
	 }
	 
	 int Carpma(int sayi1 , int sayi2) {
		 int sonuc = sayi1 * sayi2;
		 return sonuc;
	 }
	 
	 int Bolme(int sayi1 , int sayi2) {
		 int sonuc = sayi1 / sayi2;
		 return sonuc;
	 }
}
