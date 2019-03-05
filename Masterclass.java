class Demo{
	static public void main(String... args) {
	
	
	int a[][] = {{1,2,3},{4,5,6}};
	int b[][][]	= {a,a,a,a,a};
	int c[][][][]	= {b,b,b,b,b};
	
	for(int i =0; i<a[0].length	;i++) {
		for(int j =0; j<a[0].length	;j++) {
			for(int k =0; k<a[0].length	;k++) {
				System.out.println();
			}//end for k
		}//end for j
	}//end for i
	
	
	
	
	}//end main
}//end Demo
		
		
		
		/*
	A a = new A();
	B b = new B();
	System.out.println(a.a);
	
}

class A{
	String a = "Jojojo";
	void print() {System.out.println("jojojo")};
}

class B extends A implements I{
	String a = "Hohoho";
	void print() {System.out.println("Kerst")};
}		

interface I{
	void print(){System.out.print("verst")};
}}





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
*/