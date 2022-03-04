package view;
/*
4) Processo de chamada de PING com 10 iterações, em IPv4 para www.google.com.b
 */
import controller.Processo_Ping;

public class Principal_Ping {

public static void main(String[] args) {
		
	Processo_Ping ping_process = new Processo_Ping();
		
		String process = "PING -4 -n 10 www.google.com.br";
		ping_process.ProcessoIP(process);
	}

}
