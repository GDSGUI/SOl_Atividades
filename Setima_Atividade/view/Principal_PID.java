package view;

import controller.Processo_PID;
/*3) O terceiro, chamado mataPid, que recebe um PID como parâmetro de entrada, verifica o SO 
e, de acordo com SO, selecione o comando para matar o processo e o finalize*/
public class Principal_PID {

	public static void main(String[] args) {
		Processo_PID pCont = new Processo_PID();
		
		String opc = "4712"; // PID do CMD (Prompt de Comando)
		pCont.killProcess(opc);
		
		
	}

}