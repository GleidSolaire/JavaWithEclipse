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
	
	
	
}
	
	
	
	
	
	
}
