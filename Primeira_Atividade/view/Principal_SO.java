package view;
/*1) O primeiro, chamado os, que identifica e retorna o nome do Sistema Operacional (Fazê-lo 
privado*/
import controller.Processo_SO;

public class Principal_SO {

	public static void main(String[] args) {
		Processo_SO processo_so = new Processo_SO();
		
		String process = "Windows 10";
		processo_so.ProcessoSO(process);
		
	}

}
