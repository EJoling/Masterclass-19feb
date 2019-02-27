
public class OefenenInheritance {
	public static void main(String[]args) {
		
		Brandstof bs = new Benzine();
		System.out.println(bs.brandlucht);
		System.out.println(bs.brandbaar);
		bs.branden();
		System.out.println(bs.brandlucht);
		System.out.println(bs.brandbaar);
		
		
		Cola cola = new Cola();
		System.out.println("cola.voeding: " + cola.voeding);
		cola.bederven();
		System.out.println("cola.voeding: " + cola.voeding);
		
		Voedingsmiddel vm = new Drank();
		System.out.println("vm.voeding: " + vm.voeding);
		vm.bederven();
		System.out.println("vm.voeding: " + vm.voeding);
		
		cola.druppelen();
		cola.drinken(cola);
		
		
	}//end main
}//end OefenenInheritance

	// Eerste erfboom

abstract class Voedingsmiddel{
	public boolean voeding = true;
	
	abstract void bederven();
	
}//end class Voedingsmiddel


class Drank extends Voedingsmiddel implements vloeistof{
	int viscositeit;
	
	public void druppelen() {
		System.out.println("Drup drup drup... in Drank");
	}//end methode druppelen
	
	void bederven(){
		voeding = false;
	}//end bederven
	
	void bewaren(String invoer){
		if (invoer == "correct") {
			voeding = true;
		}//end if
		else{
			voeding = false;
		}//end else
	}//end methode bewaren
	
	Voedingsmiddel opgegetenWorden() {
		System.out.println("Auw...");
		Voedingsmiddel Vmiddel = new Drank();
		return  Vmiddel;
	}//end methode 
	
	
	
}//end class Drank

class Cola extends Drank {
	int suikergehalte;
	vloeistof merk;
	
	public void druppelen() {
		System.out.println("Drup drup drup... in Cola");
	}//end methode druppelen
	
	 void drinken(vloeistof vs){
		merk = vs;
	}//end methode drinken
	
}//end class Cola


	//Tweede erfboom

class Brandstof {
	boolean brandbaar = true;
	String brandlucht = "Er is heeft nog niets gebrand.";
	
	void branden() {
		System.out.println("Brand!");
		brandbaar = false;
		brandlucht = "Brandlucht";
	};
	
}//end class Brandstof

class Benzine extends Brandstof implements vloeistof{
	int viscociteit;
	String stank;
	
	public void druppelen() {
		System.out.println("Drup drup drup...");
	}//end methode druppelen
	
	public void verdampen(){
	System.out.println("Het stinkt hier naar benzine");	
	stank = "Benzinelucht";
	}//end methode verdampen
}//end class Benzine



	//Interface

interface vloeistof{
	
	
	abstract void druppelen();
	
}






