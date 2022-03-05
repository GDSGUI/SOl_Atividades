package controller;

public class Processo_Threads extends Thread {
		private int IdThread;
		private int IdSequencial;
		
		public Processo_Threads(int IdThread) {
			this.IdThread = IdThread;
		}
		@Override
		public void run() {
			System.out.println("Thread: " + IdThread);
		}
		public void Processo_Sequencial(int IdSequencial) {
			this.IdSequencial = IdSequencial;
		}
		public void run_Sequencial() {
			System.out.println("Thread: " + IdSequencial);
			
			int tempo = 1000;
			try {
				sleep(IdSequencial * tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}