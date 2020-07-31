package logica.decisaoif;

import br.com.softblue.commons.io.Console;

public class Main {

	public static void main(String[] args) {
			System.out.println("Informe sua Idade ");
			int idade = Console.readInt();
			
			if(idade >= 0 && idade <= 12) {
				System.out.println("Voce e Crianca");
			}else if( idade > 12 && idade <= 17 ) {
				System.out.println("Voce e Adoslecente");
			}else if (idade > 17 && idade <= 59) {
				System.out.println("Voce e Adulto");
			}else if (idade > 59) {
				System.out.println("Voce e Idoso");
			}else {
				System.out.println("Idade invalida");
			}
			
			System.out.println("Fim do Programa");
	}

}
