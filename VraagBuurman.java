
public class VraagBuurman {
	public static void main(String [] args) {
	

	Dier jerry = new Kat();
	Dier mykki = new Poes();
	jerry.aandachtVragen();
	//Vraag Maa 5: deze uitcommentarieren jerry.spelen();
	mykki.aandachtVragen();
	System.out.println(jerry.aandacht);
	System.out.println(mykki.aandacht);
	
	
	}//end main
}//end class VraagBuurman

abstract class Dier {
	int aandacht = 5;
	abstract int aandachtVragen();
	int spelen(int a) {return 5;};
}//end class Dier


class Kat extends Dier{
	int aandachtVragen(){
		System.out.println("Kom spelen!!");
		aandacht++;
		return aandacht;
	}//end methode aandachtVragen
	int spelen() {
		System.out.println("Zwaai dit touwtje!!");
		aandacht++;
		return aandacht;
	}
	
}//end class Kat

class Poes extends Dier{
	int aandachtVragen(){
		System.out.println("MIEW, GEEF ETEN!!");
		aandacht = 0;
		return aandacht;
	}//end methode aandachtVragen
	
}//end class Poes







