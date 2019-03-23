package Arrays;

public class Main2 {

	
	public static void main(String[] args) {
		
		int [ ]idade = new int [4];
		System.out.println(idade.length);
		
		idade= aumentarVetor (idade);
		
		System.out.println(idade.length);
		
	}

	
	
	public static int [] aumentarVetor (int[] vetor) {
		
		int[] vetorNovo= new int [vetor.length +1];
		
		for (int i=0; i<vetor.length; i++) {
			vetorNovo[i]= vetor[i];
		}
		
		return vetorNovo;
		
	}
	
	
	
}
