package view;

/*
1) Fazer uma aplica��o que rode 5 Threads que
cada uma delas imprima no console o seu
n�mero
 */
import controller.Processo_Thread;

public class Principal_Threads {

	public static void main(String[] args) {
		System.out.println("Processo Thread Aleatorio:");
		
		for (int IdThread = 0; IdThread < 5; IdThread++) {
			Processo_Thread process_thread = new Processo_Thread(IdThread);
			process_thread.start();
		}
	}

}
