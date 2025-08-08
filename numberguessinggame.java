import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

	public static void main(String[] args) {

		int tahmin, can = 5 ;
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int sayi = rand.nextInt(100);
		
		boolean	 oyundurumu = false;
		
		System.out.println("******* SAYI TAHMİN OYUNUNA HOŞ GELDİNİZ");
		System.out.println("0-99 arasında bir sayı tuttum. Hadi oyuna başlayalım...");
		System.out.println(sayi);
		
		while (can > 0 ) {
			System.out.println("Tahmininiz: ");
			tahmin = scan.nextInt();
			
			if( (tahmin < 0) || (tahmin > 99 )) {
				System.out.println("Lütfen 0 ile 99 arasında bir sayı giriniz:  ");
				
				continue;
			}
			
			if(tahmin == sayi) {
				oyundurumu = true;
				break;
				
			}else {
				System.out.println("Yanlış Tahmin. Tekrar dene!!! ");
				System.out.println("Kalan Hakkınız: " + --can);
				
			}
			
			
		}
		
		
		if(oyundurumu) {
			System.out.println("Tebrikler!!! Doğru Tahmin Ettiniz....");
			System.out.println("Sayımız: " + sayi);
		}else {
			
			System.out.println("Başaramadınız!!!" );
			System.out.println("Kalan Tahmin Hakkınız: " + can);
			System.out.println("Bir dahaki sefereeee......");
		}
		
	
		
	}

}
