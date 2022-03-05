package view;

import controller.Processo_Matriz;

public class Principal_Matriz {

	public static void main(String[] args) {
		int Matriz [][] = new int[3][5];
		for(int i = 0; i < 3; i++) {
			System.out.println("Linha " + (i+1));
			for (int i2 = 0; i2 < 5; i2++) {
				Matriz[i][i2] = (int) ((Math.random()* 10)+ 10);
				System.out.print(Matriz[i][i2] + " ");
			}
			System.out.println(" " + "\n" + "-----------------");
		}
		for(int V = 0; V < 3; V++) {
			Processo_Matriz process_matriz = new Processo_Matriz (V, Matriz);
			process_matriz.start();
		}
		
	}

}