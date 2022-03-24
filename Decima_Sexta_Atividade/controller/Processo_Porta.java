package controller;

import java.util.concurrent.Semaphore;

public class Processo_Porta extends Thread{
	
	private int idPessoa;
	private static int Saida;
	private Semaphore semaforo;
	
	public Processo_Porta (int idPesso, int Saida, Semaphore semaforo) {
		this.idPessoa = idPessoa;
		this.semaforo = semaforo;
	}
	@Override
	public void run() {
		PessoaAndando();
		try {
			semaforo.acquire();
			PessoaNaPorta();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
		}
		PessoaCruzando();
	}
		private void PessoaAndando() {
			int tempo = 1000;
			int distanciaPercorrida = 0;
			
			while (distanciaPercorrida < 200) {
				distanciaPercorrida += (int) ((Math.random() * 3 ) + 4);
				
				try {
					Thread.sleep(tempo);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("A Pessoa #" + idPessoa + " Já Andou " + distanciaPercorrida + " Metros");
			}
	}
	private void PessoaNaPorta() {
		System.out.println("A Pessoa #" + idPessoa + " Chegou na Porta");
		double tempoInicial = System.nanoTime();
		int tempoParado = (int) ((Math.random() * 1001)) + 1000;
		
		try {
			Thread.sleep(tempoParado);
		} catch (Exception e) {
			e.printStackTrace();
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Pessoa " + idPessoa +" Tempo Parado" + tempoTotal);
	}
private void PessoaCruzando() {
	Saida++;
	System.out.println("A Pessoa " + idPessoa + " Foi a " + "°. A Cruzar a Porta");
	}
}
