package view;

import java.util.concurrent.Semaphore;

import controller.Processo_Carro;

public class Principal_Carro {

	public static void main(String[] args) {
		String[] direcoes = {"Norte para o Sul", " Leste para o Oeste", "Oeste para o Leste", " Sul para o Norte" };
		Semaphore semaforo = new Semaphore (1);
		for (int i = 1; i < 5; i ++) {
			Processo_Carro processcarro = new Processo_Carro(direcoes[i - 1], semaforo);
			processcarro.start();
		}
	}
		
	}
