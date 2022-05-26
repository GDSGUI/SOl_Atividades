package view;

import java.io.IOException;

import exercicioArquivosGenericFood.controller.ArquivosController;

public class PRINCIPAL {

	public static void main(String[] args) throws IOException {
		
		ArquivosController arqCont = new ArquivosController();
		String path = "C:\\planilha";
		String nome = "food";
		
		arqCont.readFile(path, nome);
	}

}