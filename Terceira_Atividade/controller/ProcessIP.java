package controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProcessIP {
	
	public void ProcessoIP (String process) {
		
		try {
			Process p = Runtime.getRuntime().exec(process);
			InputStream leFluxo = p.getInputStream();
			InputStreamReader converteString = new InputStreamReader(leFluxo);
			BufferedReader buffer = new BufferedReader(converteString);
			String linha = buffer.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = buffer.readLine();
			}
			buffer.close();
			converteString.close();
			leFluxo.close();

		} catch (Exception e) {
			System.err.println("Chamada inv�lida");
		}
	}
}