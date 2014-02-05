package classesUML;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Forca extends CartaDecorator {

	private int forca;

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	private String descricao;

}
