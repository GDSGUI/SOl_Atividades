package controller;

import java.util.concurrent.Semaphore;

public class Processo_Semafaro extends Thread{
	
	private int idThread;
	private Semaphore semafaro;
	private double tempoCalculo, tempoBD;
	
	public Processo_Semafaro(int idThread, Semaphore semafaro) {
		this.idThread = idThread;
		this.semafaro = semafaro;
	}
	@Override
	public void run() {
		tempoCalculo();
		
	}
	private void tempoCalculo() {
		if (idThread %3 == 1) {
		tempoBD = 1000;
		tempoCalculo = (Math.random() * 801) + 200;
		transacaoBD();
		gravaBD();
		tempoCalculo = (Math.random() * 801) + 200;
		transacaoBD();
		gravaBD();
		}
		else if (idThread %3 == 2) {
		tempoBD = 1500;
			tempoCalculo = (Math.random() * 501) + 1000;
			transacaoBD();
			gravaBD();
			tempoCalculo = (Math.random() * 501) + 1000;
			transacaoBD();
			gravaBD();
			tempoCalculo = (Math.random() * 501) + 1000;
			transacaoBD();
			gravaBD();
		}
		else if (idThread %3 == 0) {
		tempoBD = 2000;
			tempoCalculo = (Math.random() * 1001) + 1000;
			transacaoBD();
			gravaBD();
			tempoCalculo = (Math.random() * 1001) + 1000;
			transacaoBD();
			gravaBD();
			tempoCalculo = (Math.random() * 1001) + 1000;
			transacaoBD();
			gravaBD();
		}
	}
	private void transacaoBD() {
		double tempo = tempoCalculo / 1000;
		System.out.format("A Thread " + idThread + " calculou por %.2f segundos. \n", tempo);
		try {
			sleep((long) tempoCalculo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	private void gravaBD() {
		try {
			semafaro.acquire();
			sleep((long) tempoBD);
			System.out.println("A Thread: " + idThread + " Gravou em " + (double) (tempoBD / 1000) + " Segundos");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			semafaro.release();
	}
	
}
}