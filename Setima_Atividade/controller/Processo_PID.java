package controller;

public class Processo_PID {

	public Processo_PID() {
		super();
	}
	public void initProcess(String process) {
		try {
			Runtime.getRuntime().exec(process);
		} catch (Exception e) {
			String erro = e.getMessage();
			if (erro.contains("2")) {
				System.err.println("Aplicação não encontrada");
			}
			if (erro.contains("740")) {
				StringBuffer buffer = new StringBuffer();
				buffer.append("cmd /c");
				buffer.append(" ");
				buffer.append(process);

				String cmdCred = buffer.toString();

				try {
					Runtime.getRuntime().exec(cmdCred);
				} catch (Exception e1) {
					System.err.println("Chamada de aplicação inválida");
				}
			}
		}
	}
	public void killProcess(String opc) {
		String os = System.getProperty("os.name");
		String cmdNome = "";
		String cmdPid = "";
		if (os.contains("Windows")) {
			cmdPid = "TASKKILL /PID";
		}
		if (os.contains("Linux")) {
			cmdPid = "kill -9";
		}

		int pid = 0;
		StringBuffer buffer = new StringBuffer();
		
		try {
			pid = Integer.parseInt(opc);
			buffer.append(cmdPid);
			buffer.append(" ");
			buffer.append(pid);
		} catch (NumberFormatException e) {
			buffer.append(cmdNome);
			buffer.append(" ");
			buffer.append(opc);
		}
		initProcess(buffer.toString());
	}
	
	
}