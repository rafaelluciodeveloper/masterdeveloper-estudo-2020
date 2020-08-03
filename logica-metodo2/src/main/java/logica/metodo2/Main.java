package logica.metodo2;

import br.com.softblue.commons.io.Console;

public class Main {

	public static void main(String[] args) {
		System.out.print("Digite a tempatura:");
		double temp = Console.readDouble();
		System.out.print("Qual a Conversão? (1 = F->C | 2 = C->F )");
		int opcao =  Console.readInt();
		
		double r;
		
		if(opcao == 1) {
			r = converterParaCelsius(temp);
		}else if(opcao == 2) {
			r = converterParaFahrenheit(temp);
		}else {
			System.out.println("Opção Invalida");
			return;
		}
		
		System.out.println("A temperatura convertida e : " + r);
		
	}
	
	static double converterParaCelsius(double fahrenheit) {
		return  (fahrenheit - 32) / 1.8;
	}
	
	static double converterParaFahrenheit(double celsius ) {
		return celsius * 1.8 + 32;
	}

}
