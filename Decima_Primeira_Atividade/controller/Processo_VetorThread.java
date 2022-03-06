package controller;

import java.util.Random;

public class Processo_VetorThread extends Thread {
	
	private int Vetor;
	
	public Processo_VetorThread (int Vetor) {
		this.Vetor = Vetor;
	}
	@Override
	public void run() {
		Processo_Thread();
	}
	private void Processo_Thread() {
		double Tempo_Inicial = System.nanoTime();
		int i;
		Random random = new Random();
		if (Vetor %2 == 0) {
			for (i = 0; i < 1000 ; i++) {
				random.nextInt(100);
			}
			double Tempo_Final = System.nanoTime();
			double Tempo_Total = Tempo_Final - Tempo_Inicial;
			Tempo_Total = Tempo_Total / Math.pow(10, 9);
			System.out.println("Vetor Par em Segundos => " + Tempo_Total);
		}
		else {for (i = 0; i < 1000 ; i++) {
			random.nextInt(100);
		}
		double Tempo_Final = System.nanoTime();
		double Tempo_Total = Tempo_Final - Tempo_Inicial;
		Tempo_Total = Tempo_Total / Math.pow(10, 9);
		System.out.println("Vetor Impar em Segundos => " + Tempo_Total);
			
		}
	}
}