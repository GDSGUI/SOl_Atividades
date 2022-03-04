package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Processo_IP {
	
	public void ProcessoIP (String process) {
		try {
			Process p = Runtime.getRuntime().exec(process);
			InputStream fluxo = p.getInputStream();
			InputStreamReader convString = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(convString);
			String linha = buffer.readLine();
			linha = buffer.readLine();
			linha = buffer.readLine();
			linha = buffer.readLine();
			linha = buffer.readLine();
			while (linha != null) {
				String[] vetLinha = linha.split("IPv6");
				int tamanho = vetLinha.length;
				String ip = vetLinha[tamanho - 1];
				
				if (ip.contains("[")) {
					String[] vetIp = ip.split("\\[");
					String newIp = vetIp[1].replace("]", "");
					System.out.println(newIp);
				} else {
					if (!ip.contains("tempo limite")) {
						System.out.println(ip.trim());
					}
				}
				
				linha = buffer.readLine();
				
			}
		} catch (IOException e) {
			System.err.println("Chamada inválida");
		}
	}
}