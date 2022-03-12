package view;

import java.util.concurrent.Semaphore;
import controller.Processo_Semafaro;
/*1) Um servidor com multiprocessamento recebe requisi��es que envolve realizar c�lculos 
e fazer transa��es com bancos de dados. Por ter uma quantidade grande de n�cleos de 
processamentos e threads, al�m de um bom algoritmo de escalonamento de threads, 
enquanto as threads fazem c�lculos, estes podem ocorrer simultaneamente, mas 
quando se faz a transa��o no banco de dados, esta deve ser apenas uma thread por 
vez. Considere um conjunto de threads com IDs definidas na pr�pria aplica��o com 
n�meros iniciando em 1 e incrementando de um em um. As threads tem comportamento 
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