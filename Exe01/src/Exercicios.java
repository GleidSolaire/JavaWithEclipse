
public class Exercicios {

	/**
	 * funcao que calcula PA a= variavel de entrada n = variavel de entrada r=
	 * variavel de entrada
	 * 
	 */

	public static int calculo(int a, int n, int r) {

		int cal = a + (n - 1) * r;

		return cal;
	}


	
	
/**
 * 
 * @param n1 primeira nota de entrada	
 * @param n2 segunda nota de entrada
 * @param n3 terceira nota de entrada
 * @return med variavel de retorno com o calculo da media
 */
	public static double Media (double n1, double n2, double n3 ) {
		
		
		double med = (n1 +n2 +n3)/3;
		 return med;
		
		
	}
	
	/** 
	 *  This Method Calculate the distance between two points
	 * @param y1 coordinate x1
	 * @param x2 coordinate x2
	 * @param y2 coordinate y2
	 * @param x1 coordinate y1
	 * @return
	 */
	
public static double DistanciaPontos (double y1, double x2, double y2, double x1 ) {
		
		
		double distanciaX = x2-x1;
		  double distanciaY = y2-y1;
		     double quadradoDisX = Math.pow(distanciaX, 2);
		      double quadradoDisY = Math.pow(distanciaY, 2);
        double CalDistancia = quadradoDisX + quadradoDisY;
		 double Distancia = Math.sqrt(CalDistancia);
		 
		 return Distancia;
		
	}



/**
 * This method caculate avg harmonic
 * @param n1 enter with first note	
 * @param n2 enter with second note
 * @param n3 enter with third note
 * @return avg harmonic of 3 notes
 */


public static double MediaHarmonica (double n1, double n2, double n3) {
	
	return 3/ (1 / n1 +1 /n2 +1 / n3);
	
	
	
}

}