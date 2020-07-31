package logica.repeticaofor;

import br.com.softblue.commons.io.Console;

public class Main {

	public static void main(String[] args) {

		/*for(int x = 0; x <= 10 ; x++) {
			System.out.println(x);
		}
		
		*/
		System.out.println("Digite um numero");
		int numero = Console.readInt();
		for(int x = 1; x <= 10 ; x++) {
			System.out.println( numero + " X " + x + " = " + (numero * x));
		}
	}

}
