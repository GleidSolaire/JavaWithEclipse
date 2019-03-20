import java.util.ArrayList;

public class Main_2 {

	
	public static void main(String[] args) {

		String[] Opc = { "Mostrar Vetor", "Mostrar Array"};

	
		boolean continua = true;

		do {
			int opcao = Console.mostrarMenu(Opc, "Lista02", null);

			switch (opcao) {
			case 1:
			int [] vetor= criarVetorInteiros () ;
			System.out.println(vetor);
              
				break;
			case 2:
			
				ArrayList<Integer> array= criarVetorInteiros();
				System.out.println(array);
				
				
				
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
	
	
	
	public static int [] criarVetorInteiros () {
		
		
		int quantidade = Console.recuperaInteiro("Informe a quantidade");
		int [] valores = new int [quantidade];
		
		for (int i = 0; i < quantidade; i++) { 
			
			valores[i] = Console.recuperaInteiro("Informe o valor: "+ (i+1)+":");
			
		}
		
		return valores;
		
	}
	
	
	
	
	public static void ImpVetorInteiro (int [] valores ) {
		
		
		if (valores.length==0) {
			System.out.println("[]");
		}
		
		else if (valores.length==1) {
			System.out.println("[" + valores[0] + "]");
		}
	else {
	
		System.out.println("["); 
	for (int i = 0; i < valores.length; i ++) {
		System.out.println(valores[i] + ",");
	}
			
		}
		
		System.out.println(valores [valores.length-1]);
		System.out.println("]");
	}
	
	
	
	
	public static  ArrayList<Integer> CriarArrayInteiros () {
		
		
		int quantidade = Console.recuperaInteiro("Informe a quantidade: ");
		ArrayList<Integer> array = new ArrayList<> ();
		
 		for (int i = 0; i < quantidade; i++) { 
 			
 			array.add(Console.recuperaInteiro("Informe o valor" + (i+1) +":"));
			
		}
		return array;
	}
	
}
