package logica.repeticaowhile;

import br.com.softblue.commons.io.Console;

public class Main {

	public static void main(String[] args) {
			
		double nota;
		int cont = 1;
		double soma = 0;
		
		do {
			System.out.println("Digita a nota " + cont);
			nota =  Console.readDouble();
			if(nota != -1) {
				soma += nota;
				cont++;
			}
		}while(nota != -1);
		
		System.out.println("Soma = " + soma);
		System.out.println("Contador  = " + (cont - 1));
		double media  = soma / (cont - 1);
		System.out.println("Media = " + media);
	}

}
