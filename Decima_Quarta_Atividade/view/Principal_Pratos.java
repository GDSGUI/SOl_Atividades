package view;

import java.util.concurrent.Semaphore;
import controller.Processo_Pratos;

public class Principal_Pratos {

	public static void main(String[] args) {
		Semaphore semafaro = new Semaphore(1);
		for (int idPratos = 1; idPratos < 6; idPratos ++) {
			Processo_Pratos processpratos = new Processo_Pratos(idPratos, semafaro);
			processpratos.start();
		}
	}

}
