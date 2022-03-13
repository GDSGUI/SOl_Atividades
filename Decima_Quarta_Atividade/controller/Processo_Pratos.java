package controller;

import java.util.concurrent.Semaphore;

public class Processo_Pratos extends Thread{
	
	private int idPrato;
	private int TempoCozimento;
	private Semaphore semafaro;
	public Processo_Pratos (int idPrato, Semaphore semafaro) {
		this.idPrato = idPrato;
		this.semafaro = semafaro;
	}
	@Override
	public void run() {
		PreparoPrato();
	}
	private void PreparoPrato() {
		if (idPrato %2 == 1) {
			double TempoFogo = 0;
			double PorcentoCozimento = 0d;
			TempoCozimento = (int) (Math.random() * 501 + 300);
			System.out.println("O Prato #" + idPrato + ": Uma Sopa de Cebola foi colocada no fogo!");
			while (TempoFogo < TempoCozimento) {
				try {
					sleep(1000);
					TempoFogo += 100;
					PorcentoCozimento = TempoFogo / TempoCozimento;
					if (PorcentoCozimento >= 1) {
						System.out.println("Sopa de Cebola #" + idPrato + 
								": % de cozimento = 100% \nidPrato #" + idPrato + ": Sopa de Cebola Cozida!");
					} else {
						System.out.println("O Prato Sopa de Cebola #" + idPrato + " : % de cozimento = "+ (int) (PorcentoCozimento * 100) + "%");
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			try {
				semafaro.acquire();
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			finally {
				semafaro.release();
				System.out.println("O Prato " + idPrato + "Sopa de Cebola foi entregue!");
			}
		}else if (idPrato %2 == 0) {
			double TempoFogo = 0;
			double PorcentoCozimento = 0d;
			TempoCozimento = (int) (Math.random() * 601) + 600;
			System.out.println("O Prato #" + idPrato + "Lasanha a Bolonhesa foi colocada no Fogo");
			while (TempoFogo < TempoCozimento) {
				try {
					sleep(1000);
					TempoFogo += 100;
					PorcentoCozimento = TempoFogo / TempoCozimento;
					if (PorcentoCozimento >= 1) {
						System.out.println("Lasanha a Bolonhesa #" + idPrato + 
								": % de cozimento = 100% \nidPrato #" + idPrato + ": Lasanha a Bolonhesa Cozida");
					} else {
						System.out.println("O Prato de Lasanha a Bolonhesa #" + idPrato + " : % de cozimento = "+ (int) (PorcentoCozimento * 100) + "%");
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			try {
				semafaro.acquire();
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			finally {
				semafaro.release();
				System.out.println("O Prato " + idPrato + " Lasanha a Bolonhesa foi entregue!");
			}
		}
		
	}
}
