package classesUML;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Partida {

	private int rodada;

	public int getRodada() {
		return rodada;
	}

	public void setRodada(int rodada) {
		this.rodada = rodada;
	}

	public int getSentido() {
		return sentido;
	}

	public void setSentido(int sentido) {
		this.sentido = sentido;
	}

	public int getGanhador() {
		return ganhador;
	}

	public void setGanhador(int ganhador) {
		this.ganhador = ganhador;
	}

	private int sentido;

	private int ganhador;

	private Jogador[] jogador;

	public void distribuirComponentes() {

	}

	public void verificaQuantidadeJogadores() {

	}

	public void definirGanhador() {

	}

	public void iniciarPartida() {

	}

	public void finalizaPartida() {

	}

	public void calculaRodada() {

	}

	public void finalizaMao() {

	}

}
