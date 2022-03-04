package view;
/*4) O quarto, chamado mataNome, que recebe um nome de processo como parâmetro de 
entrada, verifica o SO e, de acordo com SO, selecione o comando para matar o processo e o 
finalize*/
import controller.Processo_Nome;

public class Principal_Nome {

	public static void main(String[] args) {
		Processo_Nome processo_nome = new Processo_Nome(); 
		
		String opc = "cmd.exe"; // Nome da Operação que você quer finalizar
		processo_nome.killProcess(opc);
	}

}
