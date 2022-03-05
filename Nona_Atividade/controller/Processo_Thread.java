package controller;

public class Processo_Thread extends Thread {
	private int IdThread;
	public Processo_Thread(int IdThread) {
		this.IdThread = IdThread;
	}
	@Override
	public void run() {
		System.out.println("Thread: " + IdThread);
	}
}