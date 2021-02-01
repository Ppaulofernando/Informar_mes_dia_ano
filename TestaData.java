package total_dias_mes;

import java.util.Scanner;

public class TestaData {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int mes;
		int dia;
		int ano;
		System.out.print("Digite mes: ");
		mes = ler.nextInt();
		System.out.print("Digite dia: ");
		dia = ler.nextInt();
		System.out.print("Digite ano: ");
		ano = ler.nextInt();
		System.out.print("\n");
		Data data = new Data(mes, dia, ano);
		data.mostrarData();
		
		ler.close();

	}

}

