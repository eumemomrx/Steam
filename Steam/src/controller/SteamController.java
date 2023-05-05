package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class SteamController {
	String path = "C:\\Users\\FATEC ZONA LESTE\\eclipse-workspace\\Steam\\src\\arq";
	String nome = "SteamCharts.csv";

	
	public SteamController() {
		super();
	}
	public void ler(String ano, String mes, double media) throws IOException{
		File arq = new File(path, nome);
		if(arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			linha = buffer.readLine();
			while(linha != null) {
				String[] jogo = linha.split(",");
				//Nome 0
				//Ano 1
				//Mes 2
				//Media 3
				double mJ = Double.parseDouble(jogo[3]);
				if(jogo[1] == ano && jogo[2] == mes && mJ>=media) {
				System.out.println(jogo[0]);
				}
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		}else {
			throw new IOException("Arquivo inválido");
		}
	}

}
