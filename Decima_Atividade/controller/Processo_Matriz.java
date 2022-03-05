package controller;

public class Processo_Matriz extends Thread {
	private int V;
	private int Matriz[][];
	
	public Processo_Matriz (int V,int Matriz [][] ) {
		this.V = V;
		this.Matriz = Matriz;
	}
	@Override
	public void run() {
		Visualizar();
	}
	private void Visualizar() {
		int Soma = 0;
		for (int i = 0; i < 5; i++) {
			Soma = Soma + Matriz [V][i];
		}
		System.out.println("A Soma da " + (V + 1) + "° Linha é = "+ Soma  );
	}
}