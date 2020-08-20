package br.com.rafaellucio.jogodavelha.core;


import java.io.IOException;

import br.com.rafaellucio.jogodavelha.Constants;
import br.com.rafaellucio.jogodavelha.score.FileScoreManager;
import br.com.rafaellucio.jogodavelha.score.ScoreManager;
import br.com.rafaellucio.jogodavelha.ui.UI;

public class Game {
	
	private Board board = new Board();
	private Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];
	private int currentPlayerIndex = 0;
	private ScoreManager scoreManager;
	
	public void play() throws IOException{
		scoreManager = createScoreManager();
		UI.printGameTitle();
		for (int i = 0; i < players.length; i++) {
			players[i] = createPlayer(i);
		}
		
		boolean gameEnded = false;
		Player currentPlayer =  nextPlayer();
		Player winner =  null;
		
		while(!gameEnded) {
			board.print();
			boolean sequenceFound;
			try {
				 sequenceFound = currentPlayer.play();
			}catch (InvalidMoveException e) {
				UI.printText("Erro" + e.getMessage());
				continue;
			}
			
			if(sequenceFound) {
				gameEnded = true;
				winner =  currentPlayer;
			}else if(board.isFull()) {
				gameEnded = true;
			}else {
				currentPlayer = nextPlayer();
			}
		}
		
		if(winner == null) {
			UI.printText("O Jogo Terminou Empatado ");
			
		}else {
			UI.printText("O Jogador '" + winner.getName() + "' venceu o jogo.");
			scoreManager.saveScore(winner);
		}
		
		board.print();
		UI.printText("Fim do Jogo");
	}
	
	
	private ScoreManager createScoreManager() throws IOException{
			return new FileScoreManager();
	}


	private Player createPlayer(int index) {
		String name  =  UI.readInput("Jogador " + (index + 1) + " =>");
		char symbol = Constants.SYMBOL_PLAYERS[index];
		Player player = new Player(name, board, symbol);
		
		Integer score =  scoreManager.getScore(player);
		
		if(score != null) {
			UI.printText("O jogador'" + player.getName() + "' ja possui  " + score + " vitoria(s)");
		}
		
		UI.printText("O Jogador '" + name + "' vai usar o simbolo '" + symbol + "'");
		return player;
	}
	
	private Player nextPlayer() {
		/*
		currentPlayerIndex++;
		if(currentPlayerIndex >= 0 players.length) {
			currentPlayerIndex = 0;
		}
		*/		
		currentPlayerIndex = (currentPlayerIndex + 1 ) % players.length;
		return players[currentPlayerIndex];
	}

}
