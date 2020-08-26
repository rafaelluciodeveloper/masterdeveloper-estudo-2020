package br.com.rafaellucio.jogoforca.game;


import java.util.HashSet;
import java.util.Set;

import br.com.rafaellucio.jogoforca.core.Dictonary;
import br.com.rafaellucio.jogoforca.core.Word;
import br.com.rafaellucio.jogoforca.ui.UI;

public class Game {
	
	private static int MAX_ERRORS = 5;
	
	public void start() {
		UI.print("Bem Vindo ao Jogo da Forca!");
		Dictonary dictonary = Dictonary.getInstance();
		Word word = dictonary.nexWord();
		
		UI.print("A Palavra tem  " + word.size() + "letras");
		
		Set<Character> usedChars =  new HashSet<>();
		int errorCount = 0;
		
		while(true) {
			UI.print(word);
			UI.printNewLine();
			char c;
			try {
				c = UI.readChar("Digite uma Letra :");
				if(usedChars.contains(c)) {
					throw new InvalidCharacterException("Essa letra ja foi utilizada");
				}
				
				usedChars.add(c);
				if(word.hasChar(c)) {
					UI.print("Voce Acertou uma Letra!");
				}else {
					errorCount++;
					if(errorCount < MAX_ERRORS) {
						UI.print("Voce Errou! Voce Ainda pode errar " + (MAX_ERRORS - errorCount) + " Vez(es)");
					}
				}
				
				UI.printNewLine();
				
				if(word.discoverd()) {
					UI.print("Parabéns! , Voce Acertou a palavra correta : " + word.getOrignalWorld());
					UI.print("Fim do Jogo!");
					break;
				}
				
				if(errorCount == MAX_ERRORS) {
					UI.print("Voce perdeu o jogo! , A Palavra correta era  : " + word.getOrignalWorld());
					UI.print("Fim do Jogo!");
					break;
				}
			}catch(InvalidCharacterException e) {
				UI.print("Erro : " + e.getMessage());
				UI.printNewLine();
			}
		}
	}

}
