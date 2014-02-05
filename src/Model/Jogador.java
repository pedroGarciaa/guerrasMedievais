package Model;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Jogador {

	private String nomeJogador;
	private int pontos;
	private int tokenPositivo;
	private int tokenNegativo;
	private int moedas;
	private int forca;
	private Partida partida;
	private Jogador jogador;
	private Carta[] carta;
	private Tabuleiro tabuleiro;
	

	public Jogador(String nomeJogador){
		this.nomeJogador=nomeJogador;
		this.moedas=3;
		this.tokenNegativo=0;
		this.tokenPositivo=0;
		this.pontos=0;
	}
	
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

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
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

	public void contarPontos(Carta[] Cartas) {

	}

	public void GuerrearVizinho(Jogador jogador, Jogador vizinho1) {
		medirForcas(jogador, vizinho1);
	}

	public void trocarCartas(Jogador jogador, Jogador vizinho) {

	}

	public void medirForcas(Jogador jogador, Jogador vizinho) {
		
		if(jogador.getForca()>vizinho.getForca()){
			System.out.println("Jogador é vencedor da guerra!");
		}else{
			System.out.println("Vizinho é vencedor da guerra!");
		}if(jogador.getForca() == vizinho.getForca()){
			System.out.println("Houve um empate no combate");
		}
		

}
	
}