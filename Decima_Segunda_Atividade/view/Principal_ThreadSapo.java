package view;

import controller.Processo_ThreadSapo;

public class Principal_ThreadSapo {

	public static void main(String[] args) {
		for (int Anda_Sapo = 0; Anda_Sapo <= 1000; Anda_Sapo++) {
			int i = 0;
			for (int i1 = 0; i1 < 5; i1++) {
				System.out.println("O Sapo "+ (i1 + 1) + " Andou " + Anda_Sapo + " Metros");
			}
				Processo_ThreadSapo threadsapo = new Processo_ThreadSapo(Anda_Sapo, i, i, i, i, i, null);
	}
}
}