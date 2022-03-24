package controller;

import java.util.concurrent.Semaphore;

public class Processo_Carro extends Thread{
	private int idCarro;
	private String direcao;
	private double TempoInicial, TempoFinal, TempoTotal;
	private Semaphore semaforo;
	
	public Processo_Carro (String direcao, Semaphore semaforo) {
		this.idCarro = (int) this.getId();
		this.direcao = direcao;
		this.semaforo = semaforo;
	}
	@Override
	public void run() {
		CarroAndando();
		try {
			CarroEsperando();
			semaforo.acquire();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
		}
		CarroCruzando();
	}
	private void CarroAndando() {
		int tempo = 1000;
		int distanciaPercorrida = 0;
		
		while (distanciaPercorrida < 100) {
			distanciaPercorrida += (int) ((Math.random() * 5) + 6);
			try {
				Thread.sleep(tempo);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("O Carro " + idCarro + " Já andou " + distanciaPercorrida + " Metros");
		}
}
private void CarroEsperando() {
	System.out.println("O Carro " + idCarro + " Parou no Cruzamento");
	TempoInicial = System.nanoTime();
}
private void CarroCruzando() {
	TempoFinal = System.nanoTime();
	TempoTotal = TempoFinal - TempoInicial;
	TempoTotal = TempoTotal / Math.pow(10, 9);
	System.out.println("O Carro " + idCarro + " Ficou Aguardando no Cruzamento: " + TempoTotal + " Segundos e Cruzou da Direção " + direcao);
}
}
