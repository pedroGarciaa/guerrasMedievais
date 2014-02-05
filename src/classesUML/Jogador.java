package classesUML;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Jogador {

	private String nomeJogador;

	public String getNomeJogador() {
		return nomeJogador;
	}

	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public int getTokenPositivo() {
		return tokenPositivo;
	}

	public void setTokenPositivo(int tokenPositivo) {
		this.tokenPositivo = tokenPositivo;
	}

	public int getTokenNegativo() {
		return tokenNegativo;
	}

	public void setTokenNegativo(int tokenNegativo) {
		this.tokenNegativo = tokenNegativo;
	}

	public int getMoedas() {
		return moedas;
	}

	public void setMoedas(int moedas) {
		this.moedas = moedas;
	}

	public Partida getPartida() {
		return partida;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	private int pontos;

	private int tokenPositivo;

	private int tokenNegativo;

	private int moedas;

	private Partida partida;

	private Jogador jogador;

	private Carta[] carta;

	private Tabuleiro tabuleiro;

	public void contarPontos(Carta[] Cartas) {

	}

	public void GuerrearVizinho(Jogador Jogador, Jogador Vizinho) {

	}

	public void trocarCartas(Jogador jogador, Jogador vizinho) {

	}

	public void medirForcas() {

	}

}
