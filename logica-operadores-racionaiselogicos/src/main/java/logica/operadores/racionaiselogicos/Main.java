package logica.operadores.racionaiselogicos;

import br.com.softblue.commons.io.Console;

public class Main {

	public static void main(String[] args) {

		System.out.println("Numero 1");
		int n1 = Console.readInt();
		System.out.println("Numero 2");
		int n2 = Console.readInt();
		
		boolean igual = n1 == n2;
		System.out.println("Igual ?" + igual);
		
		boolean diferente = n1 != n2;
		System.out.println("Diferente ?" + diferente);
		
		boolean primeiroMaiorQueSegundo = n1 > n2;
		System.out.println("Primeiro maior que segundo ?" + primeiroMaiorQueSegundo);
		
		boolean primeiroMaiorOuIgualQueSegundo = n1 >= n2;
		System.out.println("Primeiro maior ou igual que segundo ?" + primeiroMaiorOuIgualQueSegundo);
		
		boolean primeiroMenorQueSegundo = n1 < n2;
		System.out.println("Primeiro menor que segundo ?" + primeiroMenorQueSegundo);
		
		boolean primeiroMenorOuIgualQueSegundo = n1 <= n2;
		System.out.println("Primeiro menor ou igual que segundo ?" + primeiroMenorOuIgualQueSegundo);
		
	}

}
