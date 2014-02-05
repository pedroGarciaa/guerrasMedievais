package classesUML;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Tabuleiro {

	private int idTabuleiro;

	private int descricaoTabuleiro;

	private Carta[] carta;

	private Conquista[] conquista;

	public int getIdTabuleiro() {
		return idTabuleiro;
	}

	public void setIdTabuleiro(int idTabuleiro) {
		this.idTabuleiro = idTabuleiro;
	}

	public int getDescricaoTabuleiro() {
		return descricaoTabuleiro;
	}

	public void setDescricaoTabuleiro(int descricaoTabuleiro) {
		this.descricaoTabuleiro = descricaoTabuleiro;
	}

}
