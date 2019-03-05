
public class OefenenInheritance {
	public static void main(String[]args) {

		Brandstof bs = new Benzine();
		System.out.println(bs.brandlucht);
		System.out.println(bs.brandbaar);
		bs.branden();
		System.out.println(bs.brandlucht);
		System.out.println(bs.brandbaar);
		
		
		Spa spa = new Spa();
		System.out.println("spa.voeding: " + spa.voeding);
		spa.bederven();
		System.out.println("spa.voeding: " + spa.voeding);
		
		Voedingsmiddel vm = new Drank();
		System.out.println("vm.voeding: " + vm.voeding);
		vm.bederven();
		System.out.println("vm.voeding: " + vm.voeding);
		
		spa.druppelen();
		
		// print nu een plek uit ipv object
		System.out.println(flesjeVullen(10));
		
		
		
	}//end main
	
	static vloeistof flesjeVullen(int geld) {
		if(geld <6){
			return new Spa();
		}
		else return new Benzine();
	}
	
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

class Spa extends Drank {
	int suikergehalte;
	int temp;
	
	public void druppelen() {
		System.out.println("Drup drup drup... in Spa");
	}//end methode druppelen
	
	 void drinken(){
		
	}//end methode drinken
	
}//end class Spa



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


/*		
		
		Bloemkweker bart = new Bloemkweker();
		bart.groeien();
		bart.groeien();
		bart.groeien();
		System.out.println("Gewicht Bart: " + bart.biomassa  );
		
		TulpBol t = new TulpBol();
		Bloem a = bart.bloemKweken(t);
		a.groeien();
		a.groeien();
		a.groeien();
		System.out.println("Gewicht Bloem: "+a.biomassa);
		
		System.out.println("Zijn de handen van Bart vies: " + bart.HandenVies);
		
	}//end main
}//end OefenenInheritance

abstract class Bloem implements groei{
	int biomassa;
	String naam;
	
	abstract public void groeien();
}//end class Bloem


class Tulp extends Bloem{
	int biomassa = 1;
	
	public void groeien(){
		biomassa++;
	}//end groeien
	void geurVerspreiden(){
		System.out.println("Tulpengeur");
	}//end geurVerspreiden
}//end class Bloembol


class TulpBol extends Tulp{
	String naam = "tulp";

	void bederven(){
		biomassa--;
	}
	
}//end class Tulp



class Mens implements groei{
	String naam;
	int biomassa = 10;
	
	public void groeien() {
		biomassa = (biomassa*2);
	};//end methode groeien
}//end class Mens

class Bloemkweker extends Mens{
	boolean HandenVies = false;
	
	Bloem bloemKweken(TulpBol t) {
		t.biomassa = 4;
		HandenVies = true;
		return new Tulp();
	}//end BloemKweken
	
}//end class Bloemkweker


interface groei{
	void groeien();
}

*/




