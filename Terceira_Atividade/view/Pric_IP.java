package view;

/*3) O terceiro, chamado ping, que verifica o Sistema Operacional e, de acordo com o S.O. e, de 
acordo com o S.O., faz a chamada de ping em IPv4 com 10 iterações.
import controller.ProcessIP;
*/
import controller.ProcessIP;

public class Pric_IP {

	public static void main(String[] args) {
		ProcessIP processo_ip = new ProcessIP();
		
		String process = "ipconfig";
		processo_ip.ProcessoIP(process);
	}

}
