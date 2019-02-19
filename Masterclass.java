
public class Masterclass {

	public static void main(String[] args) {
		
		Auto auto = new Auto();
		System.out.println("Snelheid auto na kopen: " + auto.snelheid);
		Autozaak Harry = new Autozaak();
		Harry.tunen(auto);
		System.out.println("Snelheid auto na tunen door Harry: " + auto.snelheid);
		
		auto.maakNummerbord();
		System.out.println("Nummerbord nieuwe auto :" + auto.nummerbord);
		
	}//end main
	
}//end public class

class Autozaak{
	
	void tunen(Auto deAuto){
	deAuto.snelheid = 100;
	}//end tunen
}//end class Autozaak

class Auto{
	String merk = "Lada";
	int snelheid = 0;
	int nummerbord = 0;
	void maakNummerbord(){
		nummerbord++;
	}
		
	void toeteren(){
		System.out.println("TOET!");
	}//end toeteren
	
}// end class Auto

