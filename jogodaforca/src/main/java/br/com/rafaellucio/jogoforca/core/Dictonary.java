package br.com.rafaellucio.jogoforca.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.rafaellucio.jogoforca.game.GameException;
import br.com.rafaellucio.jogoforca.utils.RandomUtils;

public class Dictonary {
	private static final String FILE_NAME = "dicionario.txt";
	
	private static Dictonary instance;
	
	private List<String> words =  new ArrayList<>();
	
	private Dictonary() {
		load();
	}
	
	public static Dictonary getInstance() {
		if(instance == null) {
			instance = new Dictonary();
		}
		
		return instance;
	}
	
	private void load() {
		try(Scanner scanner =  new Scanner(getClass().getResourceAsStream("/" + FILE_NAME))){
			while (scanner.hasNext()) {
				String word = scanner.nextLine().trim();
				words.add(word);
			}
			if(words.size() == 0) {
				throw new GameException("A lista de palavras nao pode ser vazia");
			}
		}
	}
	
	public Word nexWord() {
		int pos =RandomUtils.newRandomNumber(0, words.size());
		return new Word(words.get(pos));
	}
	
}
