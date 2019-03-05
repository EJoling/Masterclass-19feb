import java.util.Scanner;

class Oefen{
	
	public static void main(String... args) {
	
	Oefen demo = new Oefen();
	Scanner scanner = new Scanner(System.in);
	String input = scanner.nextLine();
	System.out.println("Voer maar iets in: ");
	try {
	System.out.println("Vergroten die hap: " + demo.naarGroot(input));
	}//end try
	catch(Exception e){
		System.err.println("Grote letters?");
		System.out.println(e.getMessage());
	}//end catch
	
	
	


	}//end main

  String naarGroot(String s) throws Exception{
		
			for(int i=0; i<s.length();i++) {
				if(s.charAt(i) >= 'a' && s.charAt(i) <='z') {
				}//end if
				else{
					throw new Exception("Er mogen geen grote letters in he.");
				}//end else	
			}//end for
			return s.toUpperCase();
		
	}//end methode naarGroot


}//end class Oefen

	
	/*
	public static void main(String... args) {
	static String romeinsCijfer = "iIvVxX";
	String input = new String();
	Scanner scanner = new Scanner(System.in);
	input = scanner.nextLine();
	
	try {
		System.out.println(omrekenen(input));
	} catch (Exception e) {
	
		System.out.println("Zet gewoon goed romeinse cijfers G.\n" + e.getMessage());
	}
		
		
	}//end main
	
	static int omrekenen(String s) throws Exception{
		
		s.matches("["+ romeinsCijfer +"]*");
		switch(s) {
		case "i":
		case "I":
			return 1;
		case "v":
		case "V":
			return 5;
		case "x":
		case "X":
			return 10;
		 default: 
			 throw new Exception("Alleen I,V,X is toegestaan.");
			
		
		}
	}


*/

