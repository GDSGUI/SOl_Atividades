package controller;

import java.util.concurrent.Semaphore;

public class Processo_Compra extends Thread{
	private int idCliente;
	private int TempoLogin, TempoCompra;
	private Semaphore semaforo;
	private static int idIngressos = 100;
	private int Compra;
	
	public Processo_Compra (int idCliente, Semaphore semaforo, int TempoLogin, int TempoCompra) {
		this.TempoCompra = TempoCompra;
		this.TempoLogin = TempoLogin;
		this.idCliente = idCliente;
		this.semaforo = semaforo;
		}
	@Override
	public void run() {
		Login_Cliente();
		}
	private void Login_Cliente() {
		double TempoMx = 1000;
		TempoLogin = (int) (Math.random() * 51) + 1950;
		
		if (TempoMx <= TempoLogin) {
			//ProcessoCompra();
			System.out.println("O Cliente #" + idCliente + " Entrou no Sistema");
		}
		else if (TempoLogin > 1000) {
		System.out.println("O Cliente #" + idCliente + " Não Entrou no Sistema");
		}
			}
}