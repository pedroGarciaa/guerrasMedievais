package comunicacao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import Model.Jogador;
import android.os.AsyncTask;

public class ComunicacaoAsyncTask extends AsyncTask {

	@Override
	protected Object doInBackground(Object... arg0) {
		String mensagem;
		try {
			BufferedReader input;
			ServerSocket serverSocket = new ServerSocket(8888);
			Socket client = serverSocket.accept();
			input = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			mensagem = input.readLine();
			
			traduzirMensagem(mensagem);
			
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	private void traduzirMensagem(String men) {
		Jogador jogador = new Jogador(null);
		int idCarta = 0;
		if (men.charAt(0) == '0')
			traduzirConsDescCarta(men, jogador, idCarta);
	}

	private void traduzirConsDescCarta(String men, Jogador jogador, int idCarta) {
		int cont = 0;
		String parte = "";
		for (int i = 0; i <= men.length(); i++) {
			String letra;
			if (men.charAt(i) == '#') {
				if (cont == 0) {
					cont++;
					parte = "";
				} else if (cont == 1) {
					jogador.setNomeJogador(parte);
					cont++;
					parte = "";
				} else if (cont == 2) {
					jogador.setMoedas(Integer.parseInt(parte));
					cont++;
					parte = "";
				} else if (cont == 3) {
					idCarta = Integer.parseInt(parte);
					cont++;
					parte = "";
				}
			}
			letra = "" + men.charAt(i);
			parte.concat(letra);
		}

		// Toma as medidas necessárias para atualizar o host.
	}
}
