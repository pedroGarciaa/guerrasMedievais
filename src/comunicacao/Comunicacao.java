package comunicacao;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import Model.Jogador;


public class Comunicacao {
	private Socket socket;

	private final int SERVERPORT;//Porta que ser� utilizada para a comunica��o
	private  String ip;//Ip do Host
	
	public Comunicacao(){
		SERVERPORT = 6000;
	}
	
	
	/**
	 * 
	 * M�todo repons�vel por abrir a conex�o com o outro dispositivo atrav�s dos sockets.
	 * @param men Mesagem para ser enviada
	 * @param ip IP do alvo
	 * 
	 */
	private void enviar(String men,String ip){
		try {
			InetAddress serverAddr = InetAddress.getByName(ip);

			socket = new Socket(serverAddr, SERVERPORT);
			
			enviarPacote(men);

		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	/**
	 * 
	 * M�todo respons�vel por enviar o pacote para o alvo.
	 * @param men Mensagem para ser enviada.
	 */
	private void enviarPacote(String men){
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(
					new OutputStreamWriter(socket.getOutputStream())),
					true);
			out.println(men);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * Esse m�todo envia a a��o, que este jogador realizou, para o host.
	 * IDS:
	 * 0 - Construi Carta
	 * 1 - Descartar Carta
	 * @param idMen Qual tipo de mensagem �.
	 * @param jogador O jogador deste dispositivo
	 * @param idCarta Id da carta que este jogador selecionou
	 */
	public void enviaAcao(int idMen, Jogador jogador, int idCarta){
		String mensagem, nome;
		int moedas;
		
		nome = jogador.getNomeJogador();
		moedas = jogador.getMoedas();
		
		mensagem = ""+ idMen + "#"+ nome + "#" + moedas + "#" + idCarta;
		
		enviar(mensagem,ip);
	}
}
