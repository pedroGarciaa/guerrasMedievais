package Model;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Recurso extends CartaDecorator {

	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	private int quantidade;

}
