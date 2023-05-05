package view;
import java.io.IOException;

import javax.swing.JOptionPane;

import controller.SteamController;
public class Main {

	public static void main(String[] args) throws IOException {
		SteamController sc = new SteamController();
		String path = "C:\\Users\\FATEC ZONA LESTE\\eclipse-workspace\\Steam\\src\\arq";
		String nome = "SteamCharts.csv";
		String ano;
		String mes;
		double avg;
		ano = JOptionPane.showInputDialog("Qual o ano deve ser buscado?");
		mes = JOptionPane.showInputDialog("Qual mes?");
		avg = Double.parseDouble(JOptionPane.showInputDialog("Qual media?"));
		sc.ler(ano, mes, avg);
	}

}
 