package logica.repeticaowhile;

import br.com.softblue.commons.io.Console;

public class Main2 {

	public static void main(String[] args) {

			double nota;
			int cont = 1;
			double soma = 0;
			
			while(true) {
				System.out.println("Digite a nota " + cont + ":");
				nota = Console.readDouble();
				
				if(nota == -1) {
					cont--;
					break;
				}
				
				cont++;
				soma += nota;
			}
			
			double media = soma / cont;
			System.out.println("Media " + media);
	}

}
