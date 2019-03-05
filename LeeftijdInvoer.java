import java.util.Scanner;

public class LeeftijdInvoer {
	public static void main (String[] args) {
	while(true) {	
		System.out.println("Voer een jaartal in dat in het verleden ligt en dat minder dan 200 jaar geleden is: ");
		
		Scanner scanner = new Scanner(System.in);
		int jaartal = scanner.nextInt();
		try {	
		getLeeftijd(jaartal);
		}catch (Exception e) {
			System.out.println("De invoer is niet correct. \n" + e.getMessage() );
			}//end catch
	}//end while
	}//end main

	
	static void getLeeftijd(int j) throws Exception{
		
		int leeftijd = 2019 - j;
		if(leeftijd >200) {
			throw new TeOudJaarException("Jaartal ligt meer dan 200 jaar geleden");
		}//end if 
		else if(leeftijd<0) {
			throw new ToekomstigJaarException("Het jaartal ligt niet in het verleden");
		}//end else if
		else {
			System.out.println("Je leeftijd is: "+ leeftijd);
		
		}
	}//end methode leeftijBerekenen
}//end class Leeftijdinvoer

class ToekomstigJaarException extends Exception {
	ToekomstigJaarException(String melding) {
		super ("KErst" + melding);
	}//end method
}//end class 

class TeOudJaarException extends RuntimeException {
	TeOudJaarException(String melding) {
		super ("Te oud " + melding);
	}
}

