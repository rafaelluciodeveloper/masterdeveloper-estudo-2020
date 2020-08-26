package br.com.rafaellucio.jogoforca.game;


import java.util.HashSet;
import java.util.Set;

import br.com.rafaellucio.jogoforca.core.Config;
import br.com.rafaellucio.jogoforca.core.Dictionary;
import br.com.rafaellucio.jogoforca.core.Word;
import br.com.rafaellucio.jogoforca.ui.UI;

public class Game {
	
	
	public void start(String[] args) {
		UI.print("Bem Vindo ao Jogo da Forca!");
		Dictionary dictionary = Dictionary.getInstance();
		Word word = dictionary.nexWord();
		UI.print(dictionary.getName());
		
		UI.print("A Palavra tem  " + word.size() + " letras");
		
		Set<Character> usedChars =  new HashSet<>();
		int errorCount = 0;
		
		if(args.length > 0) {
			Config.setMaxErrors(args[0]);
		}
		int maxErrors =  Integer.parseInt(Config.get("maxErrors"));
		UI.print("Voce pode errar no maximo " + maxErrors + " vez(es)");
		
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
					if(errorCount < maxErrors) {
						UI.print("Voce Errou! Voce Ainda pode errar " + (maxErrors - errorCount) + " Vez(es)");
					}
				}
				
				UI.printNewLine();
				
				if(word.discoverd()) {
					UI.print("Parabéns! , Voce Acertou a palavra correta : " + word.getOrignalWorld());
					UI.print("Fim do Jogo!");
					break;
				}
				
				if(errorCount == maxErrors) {
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
