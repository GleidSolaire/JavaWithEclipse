package Exercicios;

public class Exercicios {
	

	/**  
	 *  constantes para utilizaçao calculo de peso ideal
	 */
	public static final double Fator_Masculino = 72.7d;
	public static final double Fator_Feminino = 62.1d;
	public static final double Fator_Masculino2 = 58;
	public static final double Fator_Feminino2 = 44.7;
	
	
	/**
	 * 
	 * @param alt: altura em metros da pessoa
	 * @param Sexo: utilize M para masculino F para feminino
	 * @return calculo se esta no peso ideal
	 */
	
	
public static double  PesoIdeal (double alt, String Sexo) {
	
	double PesoIdeal= 0d;
	
	if (Sexo.equalsIgnoreCase("M") || Sexo.equalsIgnoreCase("masculino") ) {
		
		
	PesoIdeal = (Fator_Masculino * alt) - Fator_Masculino2;	
		
	} 
	if (Sexo.equalsIgnoreCase("F") || Sexo.equals("Feminino") ) {
		
		
		PesoIdeal= (Fator_Feminino* alt) - Fator_Feminino2;
		
		
	}
	
	
	return PesoIdeal;
	
	// teste git
	
}
	
/**
 * 
 * @param a termo no x elevado ao quadrado
 * @param b termo em x
 * @param c termo em x elevado a 0
 * @return conjunto resposta
 */


	public static double [ ] Bhaskara (double a, double b, double c) {
		
		double delta = Math.pow(b,2 ) - 4 * a* c;
		 
		// não tem raízes de numeros negativos
		if (delta <0  ) {
			 double [ ] vazio = {};
			 return vazio;
		 }
		
		
		if (delta ==  0 ) {
			// apenas uma raiz real.
			
		double raiz= -b / 2 * a;
		double[] umaRaiz = {raiz};
		return umaRaiz;
		
		
		
		
	}
	
	//duas raizes 
		
		double raiz1 = (-b + Math.sqrt(delta))/2*a;
		double raiz2 = (-b - Math.sqrt(delta))/2*a;
		double [] raizes = {raiz1, raiz2};
	return raizes;
}
}
	

