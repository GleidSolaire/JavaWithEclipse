import java.util.ArrayList;

public class Exercicios {
	/**
	 * 
	 */

	public static int[] CriaSerieFibonacci(int quantidade) {

		int[] fibonacci = new int[quantidade];

		for (int i = 0; i < fibonacci.length; i++) {

			if (i == 0 || i == 1) {
				fibonacci[i] = 1;

			} else {
				fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
			}

		}

		return fibonacci;

	}

	public static ArrayList<Integer> CriaSerieFibonacciAray(int quantidade) {

		ArrayList<Integer> fibonacci = new ArrayList<>();

		for (int i = 0; i < quantidade; i++) {

			if (i == 0 || i == 1) {
				fibonacci.add(1);

			} else {
				int valor = fibonacci.get(i - 1) + fibonacci.get(i - 2);

				fibonacci.add(valor);
			}
		}
		return fibonacci;

	}
}
