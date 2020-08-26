package br.com.rafaellucio.jogoforca.ui;

import java.util.Scanner;

import br.com.rafaellucio.jogoforca.game.InvalidCharacterException;

public class UI {
	
	public static void print(Object object) {
		System.out.println(object);
	}
	
	public static void printNewLine() {
		System.out.println();
	}
	
	public static char readChar(String text) throws InvalidCharacterException {
		System.out.println(text+ " ");
		Scanner scanner =  new Scanner(System.in);
		String line = scanner.nextLine();
		
		if(line.trim().isEmpty()) {
			throw new InvalidCharacterException("Nenhuma letra foi digital");

		}
		
		if(line.length() > 1) {
			throw new InvalidCharacterException("Apenas uma letra deve ser agitada");
		}
		
		char c = line.charAt(0);
		
		if(!Character.isLetter(c)) {
			throw new InvalidCharacterException("Apenas letras deve ser digitadas");
		}
		return c;
	}
	

}
