package view;

import java.util.concurrent.Semaphore;
import controller.Processo_Semafaro;
/*1) Um servidor com multiprocessamento recebe requisições que envolve realizar cálculos 
e fazer transações com bancos de dados. Por ter uma quantidade grande de núcleos de 
processamentos e threads, além de um bom algoritmo de escalonamento de threads, 
enquanto as threads fazem cálculos, estes podem ocorrer simultaneamente, mas 
quando se faz a transação no banco de dados, esta deve ser apenas uma thread por 
vez. Considere um conjunto de threads com IDs definidas na própria aplicação com 
números iniciando em 1 e incrementando de um em um. As threads tem comportamento 
como segue
 */
public class Principal_Semaforo {

	public static void main(String[] args) {
		Semaphore semafaro = new Semaphore(1);

		for (int idThread = 1; idThread < 22; idThread++) {
			Processo_Semafaro process_semafaro = new Processo_Semafaro(idThread, semafaro);
			process_semafaro.start();
		}
	}

}