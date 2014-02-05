package Model;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Bonus extends CartaDecorator {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	private int valor;

	private String descricao;

}
