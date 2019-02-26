public class StringBuilderOefening {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("aBcdebfghib");
		int x = sb.indexOf("b");
		int y = sb.indexOf("b", 6);
		
		System.out.println(sb);
		System.out.println("IndexOf b: " + x);
		System.out.println("IndexOf b vanaf plek nr 6: " + y);
		
		
		
	}//end main
	
}//end class Oefen

