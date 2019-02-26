
public class Masterclass {

	public static void main(String[] args) {

		Auto auto = new Auto();
		System.out.println("Snelheid auto na kopen: " + auto.snelheid);
		auto.snelheid = 10;
		System.out.println(auto.snelheid);
		Autozaak Harry = new Autozaak();
		Harry.tunen(auto);
		System.out.println("Snelheid auto na tunen door Harry: " + auto.snelheid);
		
	}//end main
	
	
}//end public class

	
class Autozaak{
	
	static void tunen(Auto deAuto){
	deAuto.snelheid = 100;
	}//end tunen
}//end class Autozaak

class Auto{
	static String merk = "Lada";
	static int snelheid = 0;
	int nummerbord = 0;	
}// end class Auto
