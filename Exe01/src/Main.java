
public class Main {

	public static void main(String[] args) {

		String[] Opc = { "Calculo PA", "Calculo Distancia entre dois pontos", "Media Aritmetica" };

		int opcao = Console.mostrarMenu(Opc, "Lista01", null);

		boolean continua = true;

		do {

			switch (opcao) {
			case 1:
				EntradaCalPA();

				break;
			case 2:

				EntradaExeCal2Pontos();
				break;

			case 3:

				ExercicioMedia();

				break;

			case -1:

				continua = false;

				System.out.println("Finaliza programa");

				break;
			}

		} while (continua);
	}

	public static void ExercicioMedia() {

		double n1 = Console.recuperaDecimal("Entre com primeira nota:  ");
		double n2 = Console.recuperaDecimal("Entre com segunda nota:  ");
		double n3 = Console.recuperaDecimal("Entre com terceira nota:  ");

		double res = Exercicios.Media(n1, n2, n3);

		System.out.println("Resultado da Media: " + res);

	}

	public static void EntradaCalPA() {

		int a = Console.recuperaInteiro("Digite o termo a1: ");
		int n = Console.recuperaInteiro("Digite o termo n: ");
		int r = Console.recuperaInteiro("Digite termo r:");

		int re = Exercicios.calculo(a, n, r);

		System.out.println("reultado do calculo:  " +re);

	}

	public static void EntradaExeCal2Pontos() {

		double x1 = Console.recuperaDecimal("Digite a Coordenada do X1: ");
		double x2 = Console.recuperaDecimal("Digite a Coordenada do X2: ");
		double y1 = Console.recuperaDecimal("Digite a Coordenada do Y1: ");
		double y2 = Console.recuperaDecimal("Digite a Coordenada do Y2: ");
		double res = Exercicios.DistanciaPontos(y1, x2, y2, x1);
		System.out.println("A distancia entre essses pontos:  " + res);

	}

}
