package letters;
import java.util.Scanner;
import java.util.Random;

public class Yathzee {
	public static void main(String[] args) {
		System.out.println("Welkom bij het spel, druk Enter om het spel te beginnen. Wil je stoppen? klik op q.");
		YahtzeeSpel Yahtzeegame = new YahtzeeSpel();
		Yahtzeegame.Werpen();
		Yahtzeegame.Spelen();
	}
}
		class YahtzeeSpel{
			
			int Werpen() {
				
				Random randomnr = new Random();
				int ogen = randomnr.nextInt(6) + 1;
				System.out.println("Je hebt " + ogen + " gegooid");
				return ogen;
}
			
			void Spelen(){
			int whilekeuze = 0;
			Scanner scanner = new Scanner (System.in);
			while(whilekeuze == 0) {
			String switchkeuze = scanner.nextLine();
			
			switch(switchkeuze) {
			case "q":
				System.out.println("Het spel is gestopt");
				whilekeuze = 1;
				break;
			default: 
				System.out.println("Het werkt!");
			}

		}
	}
}