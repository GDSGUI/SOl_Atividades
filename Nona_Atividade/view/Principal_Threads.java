package view;

/*
1) Fazer uma aplicação que rode 5 Threads que
cada uma delas imprima no console o seu
número
 */
import controller.Processo_Threads;

public class Principal_Threads {

	public static void main(String[] args) {
		System.out.println("Processo Thread Aleatorio:");
		
		for (int IdThread = 0; IdThread < 5; IdThread++) {
			Processo_Threads process_thread = new Processo_Threads(IdThread);
			process_thread.start();
		}
	}

}
