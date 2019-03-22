package PacoteCalendario;

public class Main {

	public static void main(String[] args) {

		String[] Opc = { "Ano Bissexto" };

		boolean continua = true;

		do {
			int opcao = Console.mostrarMenu(Opc, "Lista02", null);

			switch (opcao) {
			case 1:

				AnoBissexto();
				break;
			case 2:

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

}
