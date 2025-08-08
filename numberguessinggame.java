import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

	public static void main(String[] args) {

		int tahmin, can = 5 ;
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int sayi = rand.nextInt(100);
		
		boolean	 oyundurumu = false;
		
		System.out.println("******* WELCOME TO THE NUMBER GUESS GAME **********");
		System.out.println("I picked a number between 0 and 99. Let's start the game...");
		System.out.println(sayi);
		
		while (can > 0 ) {
			System.out.println("Your guess: ");
			tahmin = scan.nextInt();
			
			if( (tahmin < 0) || (tahmin > 99 )) {
				System.out.println("Please enter a number between 0 and 99: ");
				
				continue;
			}
			
			if(tahmin == sayi) {
				oyundurumu = true;
				break;
				
			}else {
				System.out.println("Wrong Guess. Try again!!! ");
				System.out.println("Your Remaining Rights:  " + --can);
				
			}
			
			
		}
		
		
		if(oyundurumu) {
			System.out.println("Congratulations!!! You guessed it right....");
			System.out.println("My Number: " + sayi);
		}else {
			
			System.out.println("You failed!!!" );
			System.out.println("Your Remaining Predictions: " + can);
			System.out.println("next time");
		}
		
	
		
	}

}
