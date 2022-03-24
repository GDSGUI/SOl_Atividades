package view;

import java.util.concurrent.Semaphore;

import controller.Processo_Porta;

public class Principal_Porta {

	public static void main(String[] args) {
		int Permissoes = 1;
		Semaphore semaforo = new Semaphore(Permissoes);
		
		for (int idPessoa = 1; idPessoa < 5; idPessoa ++) {
			Processo_Porta porta = new Processo_Porta (idPessoa, idPessoa, semaforo);
			porta.start();
		}
	}

}
