package PacoteCalendario;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		String[] Opc = { "Ano Bissexto", "Mostrar Quantidade de dias no mes" };

		boolean continua = true;

		do {
			int opcao = Console.mostrarMenu(Opc, "Lista02", null);

			switch (opcao) {
			case 1:

				AnoBissexto();
				break;
			case 2:

				
				ChamarMes();
				
				break;

			case 3:

				break;

			case -1:

				continua = false;

				System.out.println("Finaliza programa");

				break;
			}

		} while (continua);

	}

	public static void AnoBissexto() {

		int ano = Console.recuperaInteiro("Digite o ano que deseja saber: ");

		boolean anores = Calendario.CalculaBinario(ano);

		System.out.println("ano e: " + anores);

	}

	
	public static void ChamarMes () {
		
		int mes = Console.recuperaInteiro("Informe o mes ");
		int ano= Console.recuperaInteiro("Informe o ano");
		ArrayList<Integer> diaDoMes = Calendario.CriarMes(mes, ano);
		System.out.println(diaDoMes);
		
	}
	
	
	
}
