package comunicacao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import Model.Jogador;
import android.os.AsyncTask;

/**
 * 
 * Classe respons�vel por receber e traduzir as mensagens enviadas por outros dispositivos.
 * @author Pedro Henrique
 *
 */
public class ComunicacaoAsyncTask extends AsyncTask {

	/**
	 * Este m�todo ser� exucutado no background do aplicativo como outra thread.
	 */
	@Override
	protected Object doInBackground(Object... arg0) {
		String mensagem;
		try {
			BufferedReader input;
			ServerSocket serverSocket = new ServerSocket(8888);
			Socket client = serverSocket.accept();//Quando o m�todo chegar nesse m�todo essa thread ir� parar at� que uma conex�o seja estabelecida.
			
			//Se o m�todo chegar a essa linha, quer dizer que ouve uma conex�o.
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
	/**
	 * 
	 * Este m�todo ir� traduzir a mensagem enviada pelo outro dispositivo
	 * @param men Mensagem para ser traduzida.
	 */
	private void traduzirMensagem(String men) {
		Jogador jogador = new Jogador(null);
		int idCarta = 0;
		if (men.charAt(0) == '0')
			traduzirConsDescCarta(men, jogador, idCarta);
	}
	/**
	 * 
	 * M�todo respons�vel por traduzir a mensagem de construir e descartar a carta.
	 * @param men Mensagem para ser traduzida.
	 * @param jogador Jogador para armazenar o nome e a quantidade de moedas
	 * @param idCarta Id da carta para ser armazenado.
	 */
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

		// Toma as medidas necess�rias para atualizar o host.
	}
}
