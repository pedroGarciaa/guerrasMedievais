package classesUML;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public abstract class CartaDecorator implements Carta {

	private Carta carta;

	public Carta getCarta() {
		return carta;
	}

	public void setCarta(Carta carta) {
		this.carta = carta;
	}

	public void definirFuncao(Carta carta) {

	}

}
