package Exercicios;


//teste git
public class Main {
	
	
	public static void main(String[] args) {

		String[] Opc = { "Peso Ideal", "EquacaoSegundoGrau"};

	
		boolean continua = true;

		do {
			int opcao = Console.mostrarMenu(Opc, "Lista03", null);

			switch (opcao) {
			case 1:
			
                PesoIdealEntrada();
				break;
			case 2:
				BaskharaEntrada ();
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

	
	
	public static void PesoIdealEntrada () {
		
		double altura=Console.recuperaDecimal("Digite a altura: ");
		String sexo = Console.recuperaTexto("Digite o sexo");
		
		double result=Exercicios.PesoIdeal(altura, sexo);
		 System.out.println("Resultado do calculo: " +result);
		
	}
	
	public static  void BaskharaEntrada () {
	
	double a = Console.recuperaDecimal("Informe valor do A");
	double b =  Console.recuperaDecimal("Informe valor do B");
	double c = Console.recuperaDecimal("Informe Valor do C");
	double[] raizes = Exercicios.Bhaskara(a, b, c);
	 
	if (raizes.length==1) {
		System.out.println("Nao existe raizes reais");
	}
	
	
	if (raizes.length==1) {
		System.out.println("Existe uma raiz real: " +raizes[0]);
}
	if(raizes.length ==2) {
	System.out.println("raiz 1: "+raizes[0]);
	System.out.println("raiz 2: "+raizes[1]);
	}
	}
}
