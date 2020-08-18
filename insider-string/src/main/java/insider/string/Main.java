package insider.string;

public class Main {

	public static void main(String[] args) {

		String s1 =  "abc";
		String s2 = "abc";
		
		System.out.println(s1);
		System.out.println(s2);
		
		String s3 =  "abc";
		String s4 = new String("abc");
		
		System.out.println(s3);
		System.out.println(s4);
		
		
		if(s1 == s2) {
			System.out.println("Igual");
		}else {
			System.out.println("Diferente");
		}
		
		if(s3 == s4) {
			System.out.println("Igual");
		}else {
			System.out.println("Diferente");
		}
		
		//adicionar string ao poll
		//s4.intern();
				
		
		if(s3.equals(s4)) {
			System.out.println("Igual");
		}else {
			System.out.println("Diferente");
		}
		
		
	}

}
