package controller;

public class Processo_Threads extends Thread {
	private int IdThread;
	public Processo_Threads(int IdThread) {
		this.IdThread = IdThread;
	}
	@Override
	public void run() {
		System.out.println("Thread: " + IdThread);
	}
}