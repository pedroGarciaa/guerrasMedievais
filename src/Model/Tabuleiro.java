package Model;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Tabuleiro {

	private int idTabuleiro;
	private String descricaoTabuleiro;
	private Carta[] carta;
	private Conquista[] conquista;

	public Tabuleiro(int idTabuleiro, String descricaoTabuleiro, Conquista[] conquista){
		this.idTabuleiro=idTabuleiro;
		this.descricaoTabuleiro=descricaoTabuleiro;
		this.conquista=conquista;
		
	}
	public int getIdTabuleiro() {
		return idTabuleiro;
	}

	public void setIdTabuleiro(int idTabuleiro) {
		this.idTabuleiro = idTabuleiro;
	}

	public String getDescricaoTabuleiro() {
		return descricaoTabuleiro;
	}

	public void setDescricaoTabuleiro(String descricaoTabuleiro) {
		this.descricaoTabuleiro = descricaoTabuleiro;
	}

}
