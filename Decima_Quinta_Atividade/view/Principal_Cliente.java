package view;

import java.util.concurrent.Semaphore;

import controller.Processo_Compra;

public class Principal_Cliente {

	public static void main(String[] args) {
		Semaphore semaforo = new Semaphore (1);
		for (int idCliente =1; idCliente <= 100;idCliente ++) {
			Processo_Compra processcompra = new Processo_Compra (idCliente, semaforo, idCliente, idCliente);
			processcompra.start();
		}
	}

}
