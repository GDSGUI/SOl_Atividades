package controller_so;

public class Processo_so {
	
	public void Processo_so (String process) {
		String SO = System.getProperty("os.name");
		if (SO.contains("Windows")) {
			System.out.println("O Sistema Operacional é: "+SO);
		}else if (SO.contains("Linnux")){
			System.out.println("O Sistema Operacional é: "+SO);
		}else {
			System.out.println("O Sistema Operacional é: Mac");
		}
		}
}