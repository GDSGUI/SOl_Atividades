package view;

/*O segundo, chamado listaProcessos, que verifica o SO e, de acordo com SO, selecione o 
comando para listar os processos ativos.
O m�todo deve receber todas as linhas de sa�da do processo de listagem e exibi-las em console*/

import controller.Processo_Lista;

public class Principal_Lista {

	public static void main(String[] args) {
		Processo_Lista processo_lista = new Processo_Lista();
		
		String process = "TASKLIST";
		processo_lista.ProcessoLista(process);
	}

}
