package br.com.rafaellucio.jogodavelha.score;

import java.io.IOException;

import br.com.rafaellucio.jogodavelha.core.Player;

public interface ScoreManager {

	public Integer getScore(Player player);
	public void saveScore(Player player) throws IOException;
}
