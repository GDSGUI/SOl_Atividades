package view;
/*
2) O segundo, chamado ip, que verifica o Sistema Operacional e, de acordo com o S.O., faz a 
chamada de configuração de IP.
 */
import controller.Processo_IP;

public class Principal_IP {

	public static void main(String[] args) {
		
		Processo_IP ip_processo = new Processo_IP();
		String process = "ipconfig";
		ip_processo.ProcessoIP(process);

	}

}
