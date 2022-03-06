package controller;

public class Processo_ThreadSapo extends Thread{
	private int Sapo [][];
	private int Posicao_Sapo;
	
	public Processo_ThreadSapo (int Anda_Sapo, int Posicao_Sapo, int Distancia, int Area_Percorrida,int Posicao, int Distancia1, int Sapo[][]) {
		this.Posicao_Sapo = Posicao_Sapo;
		this.Sapo = Sapo;
		Posicao = 0;
	}
	@Override
	public void run() {
		Corrida();
	}
	private void Corrida() {
				int Soma = 0;
				for (int i = 0; i <= 1000; i++) {
				Soma = Soma + Sapo [Posicao_Sapo][i];
			}
			System.out.println("O Sapo " + (Posicao_Sapo + 1) + " Andou "+ Soma + " Metros"  );
			}
	}